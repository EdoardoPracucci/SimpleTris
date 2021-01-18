package view;

import controller.ControlVictory;
import controller.ControllerBox;
import model.BoxState;
import model.MatchState;
import model.Tab;
import model.TurnPlayer;

import java.util.Random;
import java.util.Scanner;

public class StartPlayGame {
    public void startGame(Tab t, ControllerBox c, String p1, String p2) {
        Scanner in = new Scanner(System.in);
        ControlVictory cv = new ControlVictory();

        TurnPlayer turn= TurnPlayer.PLAYER1;

        int box;

        Random ran = new Random();
        int x = ran.nextInt(9)+1;

        while (cv.getStateVictory(t,p1)==MatchState.ONGOING && (cv.getStateVictory(t,p2))==MatchState.ONGOING) {

//            System.out.println("QUI NEL WHILE");
            t.printTab();



            switch (turn){
                case PLAYER1:
                    System.out.println("Tocca al giocatore1 inserisci N° casella per inserire X");
                    box= in.nextInt();
                    if( c.controlPosition(box,t.getMap()) == BoxState.EMPTY){
                        System.out.println("Casella vuota è stato inserito "+p1);
                        t.setBox(box, p1);
                        turn=TurnPlayer.PLAYER2;
                    }
                    break;
                case PLAYER2:
                    System.out.println("Tocca al giocatore2 inserisci N° casella per inserire O");

                    box=ran.nextInt(t.getDimensionTab())+1;//tramite random si automatizza questo passaggio di inserimento
                    //box= in.nextInt();

                    if( c.controlPosition(box,t.getMap()) == BoxState.EMPTY){
                        System.out.println("Casella vuota è stato inserito "+p2);
                        t.setBox(box, p2);
                        turn=TurnPlayer.PLAYER1;
                    }
                    break;
            }


        }
        System.out.println("Fine gioco!!");
    }

}
