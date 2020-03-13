package ch.teko.prog.ue_1;

import java.util.Scanner;

public class Adressen {

    public String strasse;
    public int nummer;
    public int plz;
    public String wohnort;

    public Adressen (String strasse, int nummer, int plz, String wohnort ){
        this.strasse = strasse;
        this.nummer = nummer;
        this.plz = plz;
        this.wohnort = wohnort;

    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getWohnort() {
        return wohnort;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }
    public static void main(String[] args) {
        Adressen pkw1 = new Adressen("Wartburg", 353, 50, "Luino");
        Adressen pkw2 = new Adressen("VW", 85, 50,"Luino");
        Adressen pkw3 = new Adressen("Chevrolet", 27, 250, "Luino");
        System.out.println(pkw1.getWohnort());
        System.out.println(pkw1.getPlz());
        System.out.println(pkw1.getStrasse());
        System.out.println(pkw1.getNummer());
        System.out.println(pkw2.getWohnort());
        System.out.println(pkw2.getPlz());
        System.out.println(pkw2.getStrasse());
        System.out.println(pkw2.getNummer());
        System.out.println(pkw3.getWohnort());
        System.out.println(pkw3.getPlz());
        System.out.println(pkw3.getStrasse());
        System.out.println(pkw3.getNummer());
        pkw1.setPlz(66);
        System.out.println(pkw1.getPlz());

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username: ");
        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);

    }
}
