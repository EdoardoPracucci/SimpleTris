package view;

import controller.ControllerBox;
import model.Tab;

import java.io.Console;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        String p1="X";
        String p2="O";

        Tab t1 = new Tab();
        ControllerBox c1 = new ControllerBox();
        StartPlayGame game = new StartPlayGame();


        System.out.println("Hey giochiamo! quanto vuoi sia grande la tabella?...");

        Scanner in = new Scanner(System.in);  // Create a Scanner object
        t1.setDimensionTab(in.nextInt());
        t1.setEmptyTab();

        game.startGame(t1,c1,p1,p2);

        
    }
}

