package lf5;

public class StartApp {
    static void main() {
        //Deklarieren der Variablen
        int auswahl = 0;
        int zahl;
        boolean eingabewert = false;
        System.out.println("Hallo bitte wähle eines der folgenden Formate aus:");
        System.out.println("1.: Kopfgesteuerte While Schleife ");
        System.out.println("2.: Fußgesteuerte While Schleife ");
        System.out.println("3.: For Schleife");
        System.out.println("4.: ");
        System.out.println(" ");
        do {
            // Falls keine Zahl eingegeben wird ein try und catch
            try {
                auswahl = BenutzerEingabeWerte.eingabeZahl("Bitte Zahl eingeben");
                eingabewert = true;
            } catch (Exception e) {
                System.out.println("Bitte gebe eine Zahl an");
            }
        } while (!eingabewert);

        switch (auswahl) {
            case 1:
                System.out.println("In der Methode 1");
                SchleifenWahl.kopfGesteuerteWhileSchleife();
                break;
            case 2:
                System.out.println("Methode 2");
                SchleifenWahl.fussGesteuerteWhileSchleife();
                break;
            case 3:
                System.out.println("Methode 3");
                SchleifenWahl.forSchleife();
                break;
            case 4:
                break;
        }
    }
}
