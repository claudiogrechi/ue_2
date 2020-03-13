package ch.teko.prog.ue_1;

public class Rectangle {

    private int width;
    private int length;
    public String color;


    public Rectangle (String color) {
        this.width = 0;
        this.length = 0;
        this.color = color;
    }

    public int getWidth() {

        return width;
    }

    public void setWidth(int width) {

        this.width = width;
    }

    public int getLength() {

        return length;
    }

    public void setLength(int length) {

        this.length = length;
    }

    public void setColor(String color){
       this.color = color;

    }

    public String getColor(){
        return color;

    }
    public static void main(String[] args) {

            Rectangle re1 = new Rectangle("blu");
            Rectangle re2 = new Rectangle("rosso");
            System.out.println(re1.getColor());

            re1.setColor("verde");
            System.out.println(re1.getColor());
            re1.setLength(5);
            System.out.println(re1.getLength());


        int i = 3;
        double d = 3.0;
        System.out.println(7 / i + 1.5f);
        System.out.println(13 % i);
        System.out.println(10 / i + 3);
        System.out.println(10 / (d + 1));
        System.out.println(7 / (i + 1.0));
        System.out.println(8 + i * d);

        int n = (int) 99.99;
        System.out.println(n);

        long long01 = 5432423433300l;
        float float01 = 30.5f;
        System.out.println(long01);
        System.out.println(float01);


    }

}
