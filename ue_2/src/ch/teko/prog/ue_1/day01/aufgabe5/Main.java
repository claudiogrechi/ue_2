package ch.teko.prog.ue_1.day01.aufgabe5;

import ch.teko.prog.ue_1.day01.aufgabe5.auto.Auto;
import ch.teko.prog.ue_1.day01.aufgabe5.parkhaus.Parkhaus;
import ch.teko.prog.ue_1.day01.aufgabe5.parkhaus.Parkplatz;
import ch.teko.prog.ue_1.day01.aufgabe5.parkhaus.Etage;
import ch.teko.prog.ue_1.day01.aufgabe5.ticketautomat.Ticketautomat;

public class Main {
    public static void main(String[] args) {
  /* int simulationOfParkplaetze = 3;
        Parkplatz[] parkplaetze = new Parkplatz[simulationOfParkplaetze];

        for (int i = 0; i < parkplaetze.length; i++){
            Auto auto = new Auto();
            parkplaetze[i] = new Parkplatz();
            parkplaetze[i].setAuto(auto);
        }

        Ticketautomat ticketautomat = new Ticketautomat(123455,1001);
        Parkhaus parkhaus = new Parkhaus("Kesselturm", 4, parkplaetze, ticketautomat);

        for (int i = 0; i < parkhaus.getParkplaetze().length; i++) {
            System.out.printf("Ein %s in %s mit %d PS ist auf dem Platz mit der Nummer %d im Parkhaus %s parkiert. %n",
                    parkhaus.getParkplaetze()[i].getAuto().getMarke(),
                    parkhaus.getParkplaetze()[i].getAuto().getFarbe(),
                    parkhaus.getParkplaetze()[i].getAuto().getPs(),
                    i,
                    parkhaus.getName());
        }
    }
        int simulationOfEtagen = 2;
        Etage[] etagen = new Etage[simulationOfEtagen];
        int simulationOfParkplaetze = 4;

        for (int i = 0; i < etagen.length; i++) {
            Parkplatz[] parkplaetze = new Parkplatz[simulationOfParkplaetze];
            for (int n = 0; n < parkplaetze.length; n++) {
                Auto auto = new Auto();
                parkplaetze[n] = new Parkplatz();
                parkplaetze[n].setAuto(auto);
            }
            etagen[i] = new Etage(i, parkplaetze, new Ticketautomat(12345, 1002));
        }

        Parkhaus parkhaus = new Parkhaus("Kesselturm", etagen);

        System.out.println("Belegung Parkhaus Kesselturm:");
        for (int i = 0; i < parkhaus.getEtagen().length; i++) {
            System.out.printf("Auf der Etage %s, ist %n",
                    parkhaus.getEtagen()[i].getEtagenBezeichnung()
            );

            for (int n = 0; n < parkhaus.getEtagen()[i].getParkplaetze().length; n++) {
                System.out.printf("Ein %s in %s mit %d PS auf dem Platz mit der Nummer %d parkiert fuer %d Minuten zum Preis von %.02f.- CHF. %n",

                        parkhaus.getEtagen()[i].getParkplaetze()[n].getAuto().getMarke(),
                        parkhaus.getEtagen()[i].getParkplaetze()[n].getAuto().getFarbe(),
                        parkhaus.getEtagen()[i].getParkplaetze()[n].getAuto().getPs(),
                        n,
                        parkhaus.getEtagen()[i].getParkplaetze()[n].getParkzeit(),
                        //Ticketautomat.calculatePrice(parkhaus.getEtagen()[i].getParkplaetze()[n].getParkzeit())
                );
            }
            System.out.printf("%n");
        }

    }*/
    }
}