package Uppgift;

import java.util.Scanner;

public class Uppgift {
    //Skriv ett program som läser in text ifrån kommandoraden rad för rad tills användaren skriver ordet stop. GOTOV

    //När användaren är klar skriver programmet ut antal tecken och hur många rader som användaren har skrivit, exklusive raden med ordet stop
    //Programmet skall bestå av två klasser:





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
        //----------------------------------------------------


    }
}







