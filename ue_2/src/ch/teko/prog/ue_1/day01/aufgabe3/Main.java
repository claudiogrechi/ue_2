package ch.teko.prog.ue_1.day01.aufgabe3;

public class Main {

    public static void main(String[] args) {
        Lehrling _01 = new Lehrling("Grechi", "Claudio",43, 4000, 21, 10046);
        System.out.printf("Hallo %s %s, tu hai %d anni e il tuo id è %d", _01.getVorname(), _01.getName(), _01.getAlter(), _01.getMitarbeiterID());
    }
}
