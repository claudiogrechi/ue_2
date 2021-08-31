package day02.aufgabe2;

public class Main {
    public static void main(String[] args) {
            Rectangle rectangle01= new Rectangle(5,10);
            Circle circle01=new Circle(23);
            Triangle triangle01=new Triangle(5,3,4);
        System.out.println(rectangle01.calculateArea());
        System.out.println(circle01.calculateArea());
        System.out.println(triangle01.calculateArea());


    }
}
