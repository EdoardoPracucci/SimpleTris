package model;

import java.util.HashMap;
import java.util.Map;

public class Tabella {
    int grandezzaTabella;

    Map<Integer, String> mappa = new HashMap<>();

    public int getGrandezzaTabella() {
        return grandezzaTabella;
    }

    public void setGrandezzaTabella(int grandezzaTabella) {
        this.grandezzaTabella = grandezzaTabella*grandezzaTabella;
    }

    public void setTabellaVuota(){
        for(Integer i=1;i<=grandezzaTabella;i++) {
            mappa.put(i,"vuota");
        }
    }
    public void printTabella(){
        System.out.println("La tua tabella è: ");

        mappa.forEach((k,v)-> System.out.println("Posizione "+k+" la casella è "+v));
        System.out.println("prova "+mappa.get(1));
    }

    public Map<Integer, String> getMappa() {
        return mappa;
    }

    public void setCasella(int e, String s){
        for(Integer i=1;i<=grandezzaTabella;i++) {
            if(i==e){
                mappa.put(i,s);

            }
        }
    }
}
