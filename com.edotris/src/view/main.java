package view;

import controller.ControllerCaselle;
import model.Tabella;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        String p1="X";
        String p2="O";
        Integer casella;

        boolean statoVittoria=false;
        boolean turnoGiocatore=false;


        Tabella t1 = new Tabella();
        ControllerCaselle c1 = new ControllerCaselle();

        System.out.println("Hey giochiamo! quanto vuoi sia grande la tabella?...");

        Scanner in = new Scanner(System.in);  // Create a Scanner object
        t1.setGrandezzaTabella(in.nextInt());
        t1.setTabellaVuota();

        System.out.println(t1.getGrandezzaTabella());

        while (statoVittoria==false) {
            t1.printTabella();
            try {
                if (turnoGiocatore == false) {
                    System.out.println("Tocca al giocatore1 inserisci N° casella per inserire X");
                    casella= in.nextInt();
                        if( c1.controlloPosizione(casella,t1.getMappa())  == true){
                            t1.setCasella(casella, p1);
                            turnoGiocatore=true;
                        }
                }
                else {
                    System.out.println("Tocca al giocatore2 inserisci N° casella per inserire O");
                    casella= in.nextInt();
                    if( c1.controlloPosizione(casella,t1.getMappa())  == true){
                        t1.setCasella(casella, p2);
                        turnoGiocatore=false;
                    }
                }
            }
            catch (Exception e){
                System.out.println("errore+e");
            }
        }
    }
}

