package ch.teko.prog.ue_3;

import java.util.Scanner;

public class Input {
    //attribute
    private Scanner myScanner;
    //konstruktor
    public Input(){
        this.myScanner = new Scanner(System.in);
    }
    //methoden
    public int readFromLine(){
        return this.myScanner.nextInt();
    }
}
