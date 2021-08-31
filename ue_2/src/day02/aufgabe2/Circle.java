package day02.aufgabe2;

public class Circle extends Polygon implements IPolygon {
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double calculateArea() {
        double resultat= radius*radius*Math.PI;
        return resultat;
    }
}
