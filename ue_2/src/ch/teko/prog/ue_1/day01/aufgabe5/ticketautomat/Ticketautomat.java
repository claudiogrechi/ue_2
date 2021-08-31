package ch.teko.prog.ue_1.day01.aufgabe5.ticketautomat;

public class Ticketautomat implements ITicketautomat {

    private int fabrikationsnummer;
    private int softwarerelease;

    public Ticketautomat(int fabrikationsnummer, int softwarerelease) {
        this.fabrikationsnummer = fabrikationsnummer;
        this.softwarerelease = softwarerelease;
    }

    public int getFabrikationsnummer() {
        return fabrikationsnummer;
    }

    public void setFabrikationsnummer(int fabrikationsnummer) {
        this.fabrikationsnummer = fabrikationsnummer;
    }

    public int getSoftwarerelease() {
        return softwarerelease;
    }

    public void setSoftwarerelease(int softwarerelease) {
        this.softwarerelease = softwarerelease;
    }


    @Override
    public double calculatePrice(int parkTimeInMinutes) {
        int minutiAlGiorno = 1440;
        int minutiAllaSettimana = 10080;
        double costoDelParcheggio = 0.0;

        if (parkTimeInMinutes>=minutiAllaSettimana){
            while (parkTimeInMinutes >= minutiAllaSettimana) {
                costoDelParcheggio += 70;
                parkTimeInMinutes -= minutiAllaSettimana;
            }
            while (parkTimeInMinutes >= minutiAlGiorno){
                costoDelParcheggio += 20;
                parkTimeInMinutes -= minutiAlGiorno;
            }
            while (parkTimeInMinutes >= 60){
                costoDelParcheggio += 1;
                parkTimeInMinutes -= 60;
            }
        }else if(parkTimeInMinutes >= minutiAlGiorno){
            while (parkTimeInMinutes>minutiAlGiorno){
                costoDelParcheggio += 12;
                parkTimeInMinutes -= minutiAlGiorno;
            }
            while (parkTimeInMinutes>60){
                costoDelParcheggio += 1;
                parkTimeInMinutes -=60;
            }
        }else{
            if (parkTimeInMinutes <=30){costoDelParcheggio=0.0;}
            else if (parkTimeInMinutes <= 90){costoDelParcheggio=1.5;}
            else if (parkTimeInMinutes<=120){costoDelParcheggio=2.0;}
            else{
                costoDelParcheggio = 3.0;
                while (parkTimeInMinutes <= 180){
                    parkTimeInMinutes -=60;
                    costoDelParcheggio +=1.0;
                }
            }
        }
        return costoDelParcheggio;
    }
    public void main(String[] args) {
        Ticketautomat t1 = new Ticketautomat(1233, 123123);
       /* System.out.println(t1.calculatePrice(20160));
        System.out.println(t1.calculatePrice(20220));
        System.out.println(t1.calculatePrice(21600));
        System.out.println(t1.calculatePrice(11520));
        System.out.println(t1.calculatePrice(10080));
     */   System.out.println(calculatePrice(10081));
        System.out.println(calculatePrice(10140));
        System.out.println(calculatePrice(8640));
        System.out.println(calculatePrice(8700));
        System.out.println(calculatePrice(180));
        System.out.println(calculatePrice(121));
        System.out.println(calculatePrice(120));
    }


}
