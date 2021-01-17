
/**
 * Beschreiben Sie hier die Klasse Spieler.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Spieler
{
    
    private int port;
    private String ip, name;
    
    public Spieler(String s, int i, String nick)
    {
       ip = s;
       port = i;
       name = nick;
    }
    public String getIp(){
        
        return ip;
    }
    public int getPort(){
    
        return port;
    }
    public String getName(){
    
        return name;
    }
    
}
