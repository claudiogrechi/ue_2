package day02.test;

public class TopLevel {
    int instancedata = 0; // Instanzvariable
    static int shareddata = 0; // Klassenvariable
    static int m1 () { // statische Methode
        return 17;
    }
    int m2 () { // nichtstatische Methode
        return 12;
    }
    public static void main(String[] args) {


        // Anwendung der Klasse
        TopLevel t1 = new TopLevel();
        TopLevel t2 = new TopLevel();
        t1.instancedata = 3;
        t2.instancedata = 4;
        TopLevel.shareddata = 5;
        System.out.println(TopLevel.shareddata);
        int result = TopLevel.m1();

    }

}
