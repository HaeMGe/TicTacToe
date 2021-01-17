import basis.*;
/**
 * Beschreiben Sie hier die Klasse Interface.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Interface extends Client
{
    private Knopf a1,a2,a3,b1,b2,b3,c1,c2,c3, bensetzen;
    private Fenster spiel, ben;
    private TextFeld eingabe;
    private String operation,sip,zug,zeichen,gegnerzeichen;
    private int sport,test;
    private boolean feld;
    public Interface(String ip, int port)
    {
        super(ip,port);
        sip = ip;
        sport = port;
        test = 0;
    }

    public  void processMessage(String pMessage){
        operation = pMessage.substring(0,4);

        switch(operation){
            case"BenS":
            System.out.println(pMessage.substring(4,pMessage.length())); 
            this.benutzername();
            break;

            case"Wait":
            System.out.println(pMessage.substring(4,pMessage.length())); 
            break;

            case"Start":
            this.spiel();
            ben.gibFrei();
            System.out.println(pMessage.substring(4,pMessage.length()));
            break;
            
            case"Zchn":
            zeichen = pMessage.substring(4,pMessage.length());
            if(zeichen.equals("X")){
                gegnerzeichen = "O";
            }else{
                gegnerzeichen = "X";
            }
            break;

            case"Turn":
            System.out.println(pMessage.substring(4,pMessage.length()));
            this.turn(operation);
            System.out.println(zug);
            break;

            case"Text":
            System.out.println(pMessage.substring(4,pMessage.length()));
            break;

            case"TSet":
            this.gegnerzug(pMessage.substring(4,pMessage.length()));
            break;
            
            case"Clse":
            System.out.println(pMessage.substring(4,pMessage.length()));
            close();
            break;
               
        }

    }   

    public void gegnerzug(String g){
        switch(g){
            case" A1":
            a1.setzeText(gegnerzeichen);
            break;

            case" B1":
            b1.setzeText(gegnerzeichen);
            break;

            case" C1":
            c1.setzeText(gegnerzeichen);
            break;

            case" A2":
            a2.setzeText(gegnerzeichen);
            break;

            case" B2":
            b2.setzeText(gegnerzeichen);
            break;

            case" C2":
            c2.setzeText(gegnerzeichen);
            break;

            case" A3":
            a3.setzeText(gegnerzeichen);
            break;

            case" B3":
            b3.setzeText(gegnerzeichen);
            break;

            case" C3":
            c3.setzeText(gegnerzeichen);
            break;
        }

    }

    public void turn(String t){
        feld = true;
        if(test == 0){
            spiel = new Fenster("TicTacToe",400,400);
            a1 = new Knopf(" A1",30,30, 30,30);
            a2 = new Knopf(" A2", 70,30,30,30);
            a3 = new Knopf(" A3", 110,30,30,30);
            b1 = new Knopf(" B1", 30,70,30,30);
            b2 = new Knopf(" B2", 70,70,30,30);
            b3 = new Knopf(" B3",110,70,30,30);
            c1 = new Knopf(" C1", 30,110,30,30);
            c2 = new Knopf(" C2", 70,110,30,30);
            c3 = new Knopf(" C3", 110,110,30,30);
            test = 1;
        }
        while(feld){
            Hilfe.kurzePause();
            if(a1.wurdeGedrueckt()){
                if(a1.text().equals(" A1")){
                    zug = a1.text();
                    send(t+zug);
                    feld = false;
                    a1.setzeText(zeichen);
                }else{
                    System.out.println("Anderes Feld auswählen");
                }
            }else{
                if(b1.wurdeGedrueckt()){
                    if(b1.text().equals(" B1")){
                        zug = b1.text();
                        send(t+zug);
                        feld = false;
                        b1.setzeText(zeichen);
                    }else{
                        System.out.println("Anderes Feld auswählen");
                    }
                }else{
                    if(c1.wurdeGedrueckt()){
                        if(c1.text().equals(" C1")){
                            zug = c1.text();
                            send(t+zug);
                            feld = false;
                            c1.setzeText(zeichen);
                        }else{
                            System.out.println("Anderes Feld auswählen");
                        }
                    }else{
                        if(a2.wurdeGedrueckt()){
                            if(a2.text().equals(" A2")){
                                zug = a2.text();
                                send(t+zug);
                                feld = false;
                                a2.setzeText(zeichen);
                            }else{
                                System.out.println("Anderes Feld auswählen");
                            }
                        }else{
                            if(b2.wurdeGedrueckt()){
                                if(b2.text().equals(" B2")){
                                    zug = b2.text();
                                    send(t+zug);
                                    feld = false;
                                    b2.setzeText(zeichen);
                                }else{
                                    System.out.println("Anderes Feld auswählen");
                                }
                            }else{
                                if(c2.wurdeGedrueckt()){
                                    if(c2.text().equals(" C2")){
                                        zug = c2.text();
                                        send(t+zug);
                                        feld = false;
                                        c2.setzeText(zeichen);
                                    }else{
                                        System.out.println("Anderes Feld auswählen");
                                    }
                                }else{
                                    if(a3.wurdeGedrueckt()){
                                        if(a3.text().equals(" A3")){
                                            zug = a3.text();
                                            send(t+zug);
                                            feld = false;
                                            a3.setzeText(zeichen);
                                        }else{
                                            System.out.println("Anderes Feld auswählen");
                                        }
                                    }else{
                                        if(b3.wurdeGedrueckt()){
                                            if(b3.text().equals(" B3")){
                                                zug = b3.text();
                                                send(t+zug);
                                                feld = false;
                                                b3.setzeText(zeichen);
                                            }else{
                                                System.out.println("Anderes Feld auswählen");
                                            }
                                        }else{
                                            if(c3.wurdeGedrueckt()){
                                                if(c3.text().equals(" C3")){
                                                    zug = c3.text();
                                                    send(t+zug);
                                                    feld = false;
                                                    c3.setzeText(zeichen);
                                                }else{
                                                    System.out.println("Anderes Feld auswählen");
                                                }
                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            }
        }

    }
    public void benutzername(){
        ben = new Fenster("Benutzername", 200,200);
        eingabe = new TextFeld(30,30,70,30);
        bensetzen = new Knopf("Setzen", 50,50,50,30);
        while(!bensetzen.wurdeGedrueckt()){
            Hilfe.kurzePause();

        }
        send("BenS "+eingabe.text());

    }

    public void spiel(){
        spiel = new Fenster("TicTacToe",400,400);
        a1 = new Knopf(" A1",30,30, 30,30);
        a2 = new Knopf(" A2", 70,30,30,30);
        a3 = new Knopf(" A3", 110,30,30,30);
        b1 = new Knopf(" B1", 30,70,30,30);
        b2 = new Knopf(" B2", 70,70,30,30);
        b3 = new Knopf(" B3",110,70,30,30);
        c1 = new Knopf(" C1", 30,110,30,30);
        c2 = new Knopf(" C2", 70,110,30,30);
        c3 = new Knopf(" C3", 110,110,30,30);
        test = 1;
    }
}
