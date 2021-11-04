package Uppgift;

import java.util.Scanner;

public class Uppgift {


    //En klass som läser in text och skriver ut resultatet till användaren
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Count test = new Count();

        System.out.println("Du får börja skriva text: ");


        while (test.readLine(scan.nextLine())) ;

        //Skriva ut resultat-avropa objekt.method
        System.out.println("Antal tecken : " + test.numberLetter());
        System.out.println("Antal rader : " + test.numberRows());
        System.out.println("Antal ord : " + test.numberWord());
        System.out.println("Den längsta ord : " + test.longWord());



    }
}







