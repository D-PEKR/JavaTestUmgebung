package lf5;

import java.util.Scanner;

public class BenutzerEingabeWerte {
    // Methode für Eingabe einer Zahl
    public static int eingabeZahl(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.print(text + ": ");
        int zahl = sc.nextInt();
        // sc.close(); // besser nicht schließen, sonst ist System.in weg
        return zahl;
    }

    // Methode für Eingabe eines Strings
    public static String eingabeText(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.print(text + ": ");
        String eingabe = sc.nextLine();
        return eingabe;
    }

}
