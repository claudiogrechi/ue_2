package ch.teko.prog.ue_1.day01.aufgabe5.parkhaus;

import ch.teko.prog.ue_1.day01.aufgabe5.ticketautomat.Ticketautomat;

public class Etage {
    private Parkplatz[] parkplaetze;
    private Ticketautomat ticketautomat;
    private String etagenBezeichnung;

    public Etage(final int etageNummer, final Parkplatz[] parkplaetze, final Ticketautomat ticketautomat){
        this(etageNummer);
        this.parkplaetze = parkplaetze;
        this.ticketautomat = ticketautomat;
    }
    private Etage (int etageNummer){
        this.etagenBezeichnung = "Etage :" + etageNummer;
    }

    public Parkplatz[] getParkplaetze() {
        return parkplaetze;
    }

    public Ticketautomat getTicketautomat() {
        return ticketautomat;
    }

    public String getEtagenBezeichnung() {
        return etagenBezeichnung;
    }
}
