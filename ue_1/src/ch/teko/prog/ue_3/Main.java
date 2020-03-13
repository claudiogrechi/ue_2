package ch.teko.prog.ue_3;

public class Main {
    public static void main(String[] args){
        Input in1 = new Input();
        Caluclate calc1 = new Caluclate();
        System.out.println("Dieses Programm erwartet 2 Integer Eingaben und berechnet die Summe");
        System.out.println("Bitte geben Sie ihre erste Zahl ein: ");
        int value1 = in1.readFromLine();
        System.out.println("Bitte geben Sie ihre zweite Zahl ein: ");
        int value2 = in1.readFromLine();
        System.out.println("Die Summe ist: " + calc1.sum(value1,value2));

    }
}
