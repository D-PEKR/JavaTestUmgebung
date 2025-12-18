package lf5;

import java.util.Scanner;

public class BenutzerEingabeWerte {
    private static final Scanner SCANNER = new Scanner(System.in);

    // Methode für Eingabe einer Zahl
    public static int eingabeZahl(String prompt) {
        System.out.print(prompt + ": ");
        while (!SCANNER.hasNextInt()) {
            System.out.println("Ungültige Eingabe. Bitte eine ganze Zahl eingeben.");
            System.out.print(prompt + ": ");
            SCANNER.next(); // falsche Eingabe verwerfen
        }
        return SCANNER.nextInt();
    }

    // Methode für Eingabe eines Strings
    public static String eingabeText(String prompt) {
        System.out.print(prompt + ": ");
        SCANNER.nextLine(); // Puffer leeren, falls vorher nextInt() verwendet wurde
        return SCANNER.nextLine();
    }

    //️ Pause bis zur Benutzereingabe
    public static void ContinueAction() {
        System.out.println("\n\n\n\n");
        eingabeText("Drücke Enter, um fortzufahren");
        System.out.println("\n\n\n\n");
    }
}