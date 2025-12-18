package lf5;

import java.util.concurrent.TimeUnit;

public class SchleifenWahl {

    private static final int GRENZWERT = 10;
    private static final int PAUSE_SEKUNDEN = 1;

    public static void kopfGesteuerteWhileSchleife() {
        printHeader("Kopfgesteuerte While-Schleife");
        int i = 0;
        while (i <= GRENZWERT) {
            printZaehler(i++);
            pause();
        }
        BenutzerEingabeWerte.ContinueAction();
    }

    public static void fussGesteuerteWhileSchleife() {
        printHeader("Fußgesteuerte While-Schleife");
        int i = 0;
        do {
            printZaehler(i++);
            pause();
        } while (i <= GRENZWERT);
        BenutzerEingabeWerte.ContinueAction();
    }

    public static void forSchleife() {
        printHeader("For-Schleife");
        for (int i = 0; i <= GRENZWERT; i++) {
            printZaehler(i);
            pause();
        }
        BenutzerEingabeWerte.ContinueAction();
    }

    // 🔹 Hilfsmethoden zur Strukturierung

    private static void printHeader(String titel) {
        System.out.println("Willkommen in der " + titel);
        System.out.println();
        System.out.println("Wir legen die Variable i an.");
        System.out.println("Diese lassen wir hochzählen bis i = " + GRENZWERT + " ist.");
        System.out.println();
    }

    private static void printZaehler(int i) {
        System.out.println("i ist: " + i);
    }

    private static void pause() {
        try {
            TimeUnit.SECONDS.sleep(PAUSE_SEKUNDEN);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Besser als RuntimeException
            System.out.println("Die Pause wurde unterbrochen.");
        }
    }
}