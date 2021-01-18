package controller;


import model.BoxState;

import java.util.Map;

public class ControllerBox {
    public BoxState controlPosition(Integer i, Map e){
        if(e.get(i)=="vuota"){
            return BoxState.EMPTY;
        }
        return BoxState.FILLED;
    }
}
