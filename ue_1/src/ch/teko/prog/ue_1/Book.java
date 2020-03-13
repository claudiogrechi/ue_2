//MODIFICA NUMERO 1



package ch.teko.prog.ue_1;

import java.util.Scanner;

public class Book {
    public String titel;
    public String autor;
    public double preis;
    public int jahrDesKaufen;

    public Book(String titel, String autor, double preis, int jahrDesKaufen) {
        this.titel = titel;
        this.autor = autor;
        this.preis = preis;
        this.jahrDesKaufen = jahrDesKaufen;

    }

    public Book(String titel, String autor) {
        this.titel = titel;
        this.autor = autor;
        this.preis = 0.0;
        this.jahrDesKaufen = -1;

    }

    public String getTitel() {
        return titel;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getJahrDesKaufen() {
        return jahrDesKaufen;
    }

    public void setJahrDesKaufen(int jahrDesKaufen) {
        this.jahrDesKaufen = jahrDesKaufen;
    }
    public static void main(String[] args) {

        Book pkw1 = new Book("Libro1", "Manzoni", 50,2020);
        Book pkw2 = new Book("VW", "Lupo", 50, 2020);
        Book pkw3 = new Book("Chevrolet", "Bel Air");
            System.out.println(pkw1.getJahrDesKaufen());
            System.out.println(pkw1.getPreis());
            System.out.println(pkw1.getAutor());
        System.out.println(pkw1.getTitel());
            System.out.println(pkw2.getJahrDesKaufen());
            System.out.println(pkw2.getPreis());
            System.out.println(pkw2.getAutor());
        System.out.println(pkw2.getTitel());
            System.out.println(pkw3.getJahrDesKaufen());
            System.out.println(pkw3.getPreis());
            System.out.println(pkw3.getAutor());
	System.out.println(pkw3.getAutor());
	System.out.println(pkw3.getAutor());
        System.out.println(pkw3.getTitel());
            pkw1.setJahrDesKaufen(2019);
            System.out.println(pkw1.getJahrDesKaufen());

            Book book1 = new Book("Herr der Ringe","J.R.R. Tolkien", 25.5, 2019);
            System.out.printf("--> %s \n--> %s \n--> %f \n--> %d",
                book1.getTitel(),
                book1.getAutor(),
                book1.getPreis(),
                book1.getJahrDesKaufen());
        System.out.println();
        System.out.println("--> "+book1.getTitel());

            /*
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter username: ");
            String userName = myObj.nextLine();
            System.out.println("Username is: " + userName);
            */
    }


}