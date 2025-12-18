package lf5;

import java.util.Scanner;

public class StartApp {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exitRequested = false;

        while (!exitRequested) {
            printMenu();
            int auswahl = -1;

            do {
                System.out.print("Bitte Zahl eingeben: ");
                if (scanner.hasNextInt()) {
                    auswahl = scanner.nextInt();
                    if (auswahl < 1 || auswahl > 7) {
                        System.out.println("Der Eingabewert entspricht nicht dem erwarteten Wertebereich.");
                        auswahl = -1;
                    }
                } else {
                    System.out.println("Bitte gebe eine Zahl an.");
                    scanner.next(); // falsche Eingabe verwerfen
                }
            } while (auswahl == -1);

            switch (auswahl) {
                case 1 -> SchleifenWahl.kopfGesteuerteWhileSchleife();
                case 2 -> SchleifenWahl.fussGesteuerteWhileSchleife();
                case 3 -> SchleifenWahl.forSchleife();
                case 4 -> Verzweigungen.IFVerzweigung();
                case 5 -> Verzweigungen.SwitchCaseVerzweigung();
                case 6 -> System.out.println("Du verwendest es die ganze Zeit ;)");
                case 7 -> exitRequested = true;
                default -> System.out.println("Ungültige Auswahl.");
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("Hallo bitte wähle eines der folgenden Formate aus:");
        System.out.println("1.: Kopfgesteuerte While Schleife ");
        System.out.println("2.: Fußgesteuerte While Schleife ");
        System.out.println("3.: For Schleife");
        System.out.println("4.: IF Verzweigung ");
        System.out.println("5.: switch Case Verzweigung");
        System.out.println("6.: Scanner Input");
        System.out.println("7.: Exit");
        System.out.println();
    }
}