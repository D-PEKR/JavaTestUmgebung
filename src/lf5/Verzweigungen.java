package lf5;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Verzweigungen {
    private static final LocalTime MORGEN_GRENZE = LocalTime.of(6, 0);
    private static final LocalTime ABEND_GRENZE = LocalTime.of(19, 0);

    public static void IFVerzweigung() {
        System.out.println("Willkommen in der IF Verzweigung.");
        System.out.println("Haben wir Tag oder Nacht?");

        String benutzerTagesZeit;
        try {
            benutzerTagesZeit = BenutzerEingabeWerte.eingabeText("Deine Antwort: ");
        } catch (Exception e) {
            System.out.println("Bitte gebe entweder Tag oder Nacht ein");
            return;
        }

        if (benutzerTagesZeit == null || benutzerTagesZeit.isBlank()) {
            System.out.println("Keine gültige Eingabe erhalten.");
            return;
        }

        benutzerTagesZeit = benutzerTagesZeit.trim();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Die aktuelle Uhrzeit ist: " + dtf.format(now));

        LocalTime aktuelleZeit = now.toLocalTime();
        String tagesZeit = (aktuelleZeit.isBefore(MORGEN_GRENZE) || aktuelleZeit.isAfter(ABEND_GRENZE))
                ? "Nacht"
                : "Tag";

        System.out.println("Es ist " + tagesZeit + "zeit.");

        if (benutzerTagesZeit.equalsIgnoreCase(tagesZeit)) {
            System.out.println("Du hast recht!");
        } else {
            System.out.println("Das stimmt nicht ganz.");
        }

        BenutzerEingabeWerte.ContinueAction();
    }

    public static void SwitchCaseVerzweigung() {
        System.out.println("Willkommen in der Switch Case Verzweigung");
        boolean exitRequested = false;

        do {
            printSwitchMenu();
            int choice = 0;
            try {
                choice = BenutzerEingabeWerte.eingabeZahl("Deine Eingabe: ");
            } catch (Exception e) {
                System.out.println("Es wurde eine Zahl erwartet.");
            }

            switch (choice) {
                case 1 -> System.out.println("Nick wurde gewählt");
                case 2 -> System.out.println("Gabse wurde gewählt");
                case 3 -> exitRequested = true;
                default -> System.out.println("Ungültige Eingabe, bitte erneut versuchen.");
            }
        } while (!exitRequested);

        BenutzerEingabeWerte.ContinueAction();
    }

    private static void printSwitchMenu() {
        System.out.println("Menü Ausgabe");
        System.out.println("1. Nick");
        System.out.println("2. Gabse");
        System.out.println("3. Exit");
        System.out.println();
    }
}