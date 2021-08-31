package ch.teko.prog.ue_1.day01.aufgabe5.parkhaus;

public class Parkhaus {
    private String name;
    private Etage[] etagen;


    public Parkhaus(final String name, final Etage[] etagen) {
        this.name = name;
        this.etagen = etagen;

    }

    public String getName() {
        return name;
    }

    public Etage[] getEtagen() {
        return etagen;
    }


}
