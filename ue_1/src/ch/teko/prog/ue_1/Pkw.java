package ch.teko.prog.ue_1;
import java.util.Scanner;

public class Pkw {

        public String marke;
        public String modell;
        public int ps;

        public Pkw(){

        }

        public Pkw(String marke, String modell, int ps){
            this.marke = marke;
            this.modell = modell;
            this.ps = ps;
        }

        public String getMarke(){
            return marke;
        }

        public void setMarke(String marke){
            this.marke = marke;

        }

        public String getModell(){
            return modell;

        }

        public void setModell(String modell){
            this.modell = modell;
        }

        public int getPs(){
            return ps;

        }

        public void setPs(int ps){
            this.ps = ps;

        }

    public static void main(String[] args) {
        Pkw pkw1 = new Pkw("Wartburg", "353", 50);
        Pkw pkw2 = new Pkw("VW", "Lupo", 50);
        Pkw pkw3 = new Pkw("Chevrolet", "Bel Air", 250);
        System.out.println(pkw1.getMarke());
        System.out.println(pkw1.getModell());
        System.out.println(pkw1.getPs());
        System.out.println(pkw2.getMarke());
        System.out.println(pkw2.getModell());
        System.out.println(pkw2.getPs());
        System.out.println(pkw3.getMarke());
        System.out.println(pkw3.getModell());
        System.out.println(pkw3.getPs());
        pkw1.setMarke("Toyota");
        System.out.println(pkw1.getMarke());

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username: ");
        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);

        }
}
