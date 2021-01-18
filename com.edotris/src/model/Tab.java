package model;

import java.util.HashMap;
import java.util.Map;

public class Tab {
    int dimensionTab;
    int dimRow;
    Map<Integer, String> map = new HashMap<>();
    MatchState state;

    public int getDimensionTab() {
        return dimensionTab;
    }

    public int getDimRow() { return dimRow;
    }

    public void setDimensionTab(int dimTab) {
        this.dimRow=dimTab;
        this.dimensionTab = dimTab*dimTab;
    }

    public void setEmptyTab(){
        for(Integer i = 1; i<= dimensionTab; i++) {
            map.put(i,"vuota");
        }
    }
    public void printTab(){
        System.out.println("La tua tabella è: ");

        map.forEach((k, v)-> System.out.println("Posizione "+k+" la casella è "+v));
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setBox(int e, String s){
        for(Integer i = 1; i<= dimensionTab; i++) {
            if(i==e){
                map.put(i,s);

            }
        }
    }

    public MatchState getState() {
        return state;
    }

    public void setState(MatchState state) {
        this.state = state;
    }
}
