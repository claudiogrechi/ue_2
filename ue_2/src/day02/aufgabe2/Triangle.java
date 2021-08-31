package day02.aufgabe2;

public class Triangle extends Polygon implements IPolygon {
    private double a;
    private double b;
    private double c;
    private double s;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.s = (a + b + c) / 2;
    }
    @Override
    public double calculateArea() {
        double resultat=Math.sqrt((this.s * (this.s - this.a) * (this.s - this.b) * (this.s - this.c)));
        return resultat;
    }
}
