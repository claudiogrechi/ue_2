package ch.teko.prog.ue_1;

import java.io.PipedOutputStream;

public class Position {

    public int x;
    public int y;

    public Position(int x, int y){

        this.x = x;
        this.y = y;

    }

    public Position(){
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public static void main(String[] args) {

        Position re1 = new Position();
        Position re2 = new Position(5, 9);
        System.out.println(re1.getX());
        System.out.println(re1.getY());
        System.out.println(re2.getX());
        System.out.println(re2.getY());


        re1.setX(3);
        System.out.println(re1.getX());
        re1.setY(5);
        System.out.println(re1.getY());
    }
}
