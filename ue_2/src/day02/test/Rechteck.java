package day02.test;
import java.util.Random;

public class Rechteck {

    public static void main(String[] args) {
        String c;
        c= randomstr(16);
        System.out.println(c);

    }
        public static String randomstr(int n){
        int i;
        int zahl;
        char a;

            String s;
            char[] parola = new char[n];
            for (i=0; i<n; i++){

            Random r = new Random();
            zahl = 97 + r.nextInt(26);
            a=(char)zahl;
            parola[i]=a;
            }
            s = new String(parola);
            return s;
        }

}




