package controller;

import model.MatchState;
import model.Tab;


public class ControlVictory {
    ControlRow r = new ControlRow();

    public MatchState getStateVictory(Tab t,String player){

        for(int j=t.getDimRow(),i=1 ;j<=t.getDimensionTab();j+=t.getDimRow()) {
//            System.out.println("HO PASSATO AL METODO la i: "+i+"la j: "+j);
            if (r.getHorizontalRow(t, i, j, player) == MatchState.WIN) {
                System.out.println("Vince il giocatore con il simbolo "+player);
                return MatchState.WIN;
            }
            i+=t.getDimRow();
        }

        for(int j=t.getDimensionTab() - t.getDimRow()+1,i=1;i<=t.getDimRow();i++){
//            System.out.println("HO PASSATO AL METODO la i: "+i+"la j: "+j);
            if (r.getVerticalRow(t, i, j, player) == MatchState.WIN) {
                System.out.println("Vince il giocatore con il simbolo "+player);
                return MatchState.WIN;
            }
            j++;
        }

        for(int i=1,j=t.getDimensionTab();i<=t.getDimensionTab()-t.getDimRow()-1 ;i+=t.getDimRow()+1) {
//            System.out.println("HO PASSATO AL METODO " + i);
            if (r.getObliqueRow1(t, i, j, player) == MatchState.WIN) {
                System.out.println("Vince il giocatore con il simbolo "+player);
                return MatchState.WIN;
            }
        }
        for(int i=t.getDimRow(),j=t.getDimensionTab() - t.getDimRow()+1;i<=j-t.getDimRow()-1;i+=t.getDimRow()-1){
            if (r.getObliqueRow2(t,i,j,player) == MatchState.WIN) {
                System.out.println("Vince il giocatore con il simbolo "+player);
                return MatchState.WIN;
            }
        }

        for(int i=1,counter=0;i<=t.getDimensionTab();i++){

//            System.out.println("il contatore del pareggio segna!: "+counter);
//            System.out.println("matrice nel punto i "+t.getMap().get(i));

            if(t.getMap().get(i)=="vuota"){
                return MatchState.ONGOING;
            }
        }
        System.out.println("Pareggio! incredibile sono così rari");
        return MatchState.TIE;
    }
}

//quello che faremo per la verifica orizzontale è passare al controllo lungo pari alle righe e su ogni riga è base alla
//lunghezza della riga
//
//controllo verticale verrà passato

//controllo verticale verrà fatto un controllo su un numero pari alla lunghezza della riga con n numeri e gli passeranno
//i numeri n+1 partendo da 1

//        0 0 0  7=3 + 3 +1 row+row+1
//        0 0 0  7=9 - 2  (row*row)-row+1
//        0 0 0
//
//0 0 0 0 0 0 0 0 0
//1     4     7
//  2     5     8
//    3     6     9
//
//0 0 0  0 0 0  0 0 0
//1 2 3  4 5 6  7 8 9
//
//
//0 0 0 0 0 0 0 0 0 0
//1       5         9
//    3   5     7

//             1 -- -- --  5      1 - 3        1 -- --  4
//            --  7 --  9 --      - 5 -       --  6 -- --
//            -- -- 13 -- --      7 - 9       -- -- 11 --
//            -- 17 -- 19 --                  -- -- -- 16
//            21 -- -- -- 25
