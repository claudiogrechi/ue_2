package ch.teko.prog.ue_1;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int i = 1;
        while (i <= 10) {
          //  System.out.println(i * i);
            i = i + 1;
        }
        int a = 10;
        do {
            a = a - 1;
            // System.out.println(a);
        } while (a > 0);

        int n = 8;
        a = 1;
        while (n > a){
            n = n/2;
            //System.out.println(n);
        }
        do {
            n = n/2;
            //System.out.println(n);
        } while (n>a);
        n=8;
        a=1;
        double n1, n2=n;
        do{
            n1=n2;
            n2=n1/2;
            //System.out.println(n1);
            //System.out.println(n2);
        }while (n1-n2>=a);
        for(i=1; i<=10; i=i+1){
            System.out.printf("%d ", i*i);
        }
        a=0;
        for(i=1; i<=10; i++){
            a = a + i*i;
            System.out.println(a);
        }
        System.out.println(a);
        int pi = 0;
        for (i=0;i<11;i++) {
            pi += i * i;
        }
        System.out.println(pi);
        int ro = 0;
        int pu = 0;
        while (ro<11){

            pu += ro * ro;
            ro++;
        }
        System.out.println(pu);
        pu++;
        System.out.println(pu);

         */
        int numberOfStars = 5;
        /*for(int i = 0; i < numberOfStars; i++){
            System.out.println();
            for (int a = 0; a < i; a++){
                System.out.print("*");
            }
        } */for (int i = numberOfStars; i >= 0; i--){
            System.out.println();
            for (int a = 0; a < i; a++){
                System.out.print("*");
            }
        }
        double y = wurzel(6,3);
        System.out.println(y);
    }

        public static double wurzel(int a, int b){
         double sum = a+b;
         double x = Math.sqrt(sum);

        return(x);
        }



}
	// write your code here
