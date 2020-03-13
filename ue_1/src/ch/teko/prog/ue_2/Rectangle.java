package ch.teko.prog.ue_2;

public class Rectangle {
    private String  name;
    private int xPosition;
    private int yPosition;
    private double laenge;
    private  double breite;

    public Rectangle(String name, int xPosition, int yPosition, double laenge, double breite){
        this.breite = breite;
        this.laenge = laenge;
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;

    }
    public Rectangle(String name, int xPosition, int yPosition){
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.breite = 1.0;
        this.laenge = 1.0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }
    public double rechnenFlaeche(){
        return this.breite * this.laenge;
    }
    public void druckFlaeche(){
        System.out.println("Flaeche ist " + this.rechnenFlaeche() + " metriquadri");
    }
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle("Rectange 1", 5,5,2.0,3.0);
        System.out.println(rec1.getName());
        System.out.println(rec1.getxPosition());
        System.out.println(rec1.getyPosition());
        rec1.druckFlaeche();
        System.out.println("-------------");
        Rectangle rec2 = new Rectangle("Rectangle 2 ", 2,2);
        System.out.println(rec2.getName());
        System.out.println(rec2.getLaenge());
        rec2.setLaenge(20.0);
        System.out.println(rec2.getBreite());
        rec2.setBreite(10.0);
        rec2.druckFlaeche();
    }

}
