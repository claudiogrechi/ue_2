package ch.teko.prog.ue_4;

public class Kontrollstruktur {

    //attribute
    private String name;
    private double version;

    //konstruktor
    public Kontrollstruktur(String name, double version){
        this.name = name;
        this.version = version;
    }
    //methode

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }/*

    public int calculatePrice(int alter){
        double price;
        if (alter<=6){

        }if else

    }*/
}
