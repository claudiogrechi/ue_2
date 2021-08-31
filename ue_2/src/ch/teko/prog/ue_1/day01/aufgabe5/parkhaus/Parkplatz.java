package ch.teko.prog.ue_1.day01.aufgabe5.parkhaus;

import ch.teko.prog.ue_1.day01.aufgabe5.auto.Auto;

public class Parkplatz {
    private boolean besetzt;
    private Auto auto;
    private final int parkzeit;
    public Parkplatz() {
        this.besetzt = false;
        this.parkzeit = (int) (Math.random() * 43800);
    }

    public boolean isBesetzt() {
        return besetzt;
    }

    public void setBesetzt(boolean besetzt) {
        this.besetzt = besetzt;
    }
    public int getParkzeit() {
        return parkzeit;
    }
    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        if (!isBesetzt()) {
            this.auto = auto;
            setBesetzt(true);
        }
        else {
            System.out.println("Parkplatz ist besetzt!");
        }
    }
}
