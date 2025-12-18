package lf5;

import java.util.concurrent.TimeUnit;

public class SchleifenWahl {
    public static void kopfGesteuerteWhileSchleife() {
        System.out.println("Willkommen in der Kopfgesteuerten While Schleife");
        System.out.println(" ");
        System.out.println("Wir legen die Variable i an");
        System.out.println("Diese lassen wir hochzählen bis i = 10 ist");

        int i = 0;
        while (i <= 10) {
            System.out.println("I ist: " + i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }

    public static void fussGesteuerteWhileSchleife() {
        System.out.println("Willkommen in der Fußgesteuerten While Schleife");
        System.out.println(" ");
        System.out.println("Wir legen die Variable i an");
        System.out.println("Diese lassen wir hochzählen bis i = 10 ist");

        int i = 0;
        do {
            System.out.println("I ist: " + i);
            i++;
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } while (i <= 10);
    }

    public static void forSchleife() {
        System.out.println("Willkommen in der For Schleife");
        System.out.println(" ");
        System.out.println("Wir legen die Variable i an");
        System.out.println("Diese lassen wir hochzählen bis i = 10 ist");

        int i = 0;
        for (i=0; i < 10; i++) {
            System.out.println("I ist: " + i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
