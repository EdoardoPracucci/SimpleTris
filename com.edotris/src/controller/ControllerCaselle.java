package controller;

import model.Tabella;


import java.util.HashMap;
import java.util.Map;

public class ControllerCaselle {
    public boolean controlloPosizione(Integer i,Map e){
        if(e.get(i)=="vuota"){
            System.out.println("Casella vuota è stato inserito X");
            return true;
        }
        return false;
    }
//    public boolean controlloVittoria(Map e){
//        if(){
//            return true;
//        }else{
//            return false;
//        }
//    }
}
