import basis.*;
/**
 * Beschreiben Sie hier die Klasse TServer.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TServer extends Server
{
    private String operation;
    private Spieler spieler1, spieler2;
    private int a, anzahl;
    private List<String> list1, list2 ;
    
    public TServer(int port)
    {
        super(port);
        list1 = new List<String>();
        list2 = new List<String>();
    }

    public  void processNewConnection(String pClientIP, int pClientPort){

        send(pClientIP,pClientPort, "BenS Setzen Sie ihren Benutzernamen");

    }

    public  void processMessage(String pClientIP, int pClientPort, String pMessage){

        operation = pMessage.substring(0,4);

        switch(operation){
            case"BenS":
            a = a+1;
            if(a == 1){
                spieler1 = new Spieler(pClientIP,pClientPort,pMessage.substring(4,pMessage.length()));
                send(pClientIP,pClientPort, "Wait Warten auf Spieler 2");
            }else{
                spieler2 = new Spieler(pClientIP,pClientPort,pMessage.substring(4,pMessage.length()));
                send(pClientIP,pClientPort, "Start Sie spielen nun gegen "+spieler1.getName());
                send(spieler1.getIp(),spieler1.getPort(), "Start Sie spielen nun gegen "+spieler2.getName());
                Hilfe.pause(7);
                send(pClientIP,pClientPort,"Zchn O");
                send(spieler1.getIp(),spieler1.getPort(),"Zchn X");
                Hilfe.pause(7);
                send(spieler1.getIp(),spieler1.getPort(), "Turn Sie sind dran ");
                send(pClientIP,pClientPort, "Text "+spieler1.getName()+" ist dran");
                anzahl = 0;
            }
            break;
            
            case"Text":
            send(pClientIP,pClientPort, "Text Sie sind gerade nicht dran ");
            break;
            
            case"Turn":
            if(pClientIP.equals(spieler1.getIp())){
                send(spieler2.getIp(),spieler2.getPort(),"TSet"+pMessage.substring(4,pMessage.length()));
                Hilfe.kurzePause();
                send(spieler2.getIp(),spieler2.getPort(),"Turn Sie sind dran ");
                send(spieler1.getIp(), spieler1.getPort(), "Text "+spieler2.getName()+" ist dran");
                
                anzahl = anzahl+1;
            }else{
                send(spieler1.getIp(),spieler1.getPort(),"TSet"+pMessage.substring(4,pMessage.length()));
                Hilfe.kurzePause();
                send(spieler1.getIp(),spieler1.getPort(),"Turn Sie sind dran ");
                send(spieler2.getIp(), spieler2.getPort(), "Text "+spieler1.getName()+" ist dran");
                
                anzahl = anzahl+1;
            }
            
            break;

        }
    }
    public  void processClosingConnection(String pClientIP, int pClientPort){
        if(spieler1.getIp().equals(pClientIP)){
            send(spieler2.getIp(),spieler2.getPort(),"Clse Ende");
        }else{
            send(spieler1.getIp(),spieler1.getPort(),"Clse Ende");
        }
        close();
    }
}
