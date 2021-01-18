package controller;


import model.MatchState;
import model.Tab;



public class ControlRow {
    public MatchState getHorizontalRow(Tab t, int i, int j, String player) {
        int counter = 0;

        for (; i <= j; i++) {
            if (t.getMap().get(i) == player) {
                counter++;
            }
        }

        if (counter == t.getDimRow()) {
            System.out.println("ho finito qui1");
            return MatchState.WIN;

        }
        return MatchState.ONGOING;
    }


    public MatchState getVerticalRow(Tab t, int i, int j, String player) {
        int counter = 0;

        for (; i <= j; i += t.getDimRow()) {
            if (t.getMap().get(i) == player) {
                counter++;
            }
        }
        if (counter == t.getDimRow()) {

            System.out.println("ho finito qui2");
            return MatchState.WIN;
        }
        return MatchState.ONGOING;
    }


    public MatchState getObliqueRow1(Tab t, int i, int j, String player) {
        int counter = 0;

        for(;i<=j ;i+=t.getDimRow()+1) {
            if (t.getMap().get(i) == player) {
                counter++;
            }
        }

        if (counter == t.getDimRow()) {

            System.out.println("ho finito qui3");
            return MatchState.WIN;
        }

        return MatchState.ONGOING;
    }


    public MatchState getObliqueRow2(Tab t, int i, int j, String player) {
        int counter = 0;

        for (; i <= j; i += (t.getDimRow()-1)) {
            if (t.getMap().get(i) == player) {
                counter++;
            }
        }

        if (counter == t.getDimRow()) {
            System.out.println("ho finito qui4");
            return MatchState.WIN;
        }

        return MatchState.ONGOING;
    }


 }


