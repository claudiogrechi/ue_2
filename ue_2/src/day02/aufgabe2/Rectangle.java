package day02.aufgabe2;


public class Rectangle extends Polygon implements IPolygon {
    private double laenge;
    private double breite;

    public Rectangle(double laenge, double breite){
        this.laenge=laenge;
        this.breite=breite;
    }
    @Override
    public double calculateArea() {
        double resultat=laenge*breite;
        return resultat;
    }
}
