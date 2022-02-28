package demo;
import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);
    int svar, shift, nogleord;
    char caesarValg, vigenereValg;
    String krypteringsTekst, kodeTekst, vigenereTekst, vigenereKodetekst;

    void menu() {
        System.out.println("MENU");
        System.out.println("1) Cæsar (tast 1 for at vælge)");
        System.out.println("2) Vigenére (tast 2 for at vælge)");
        System.out.println("0) Exit (tast 3 for at vælge)");
        System.out.print("Dit svar: ");
        svar = in.nextInt();
    }

    void caesarMenu() {
            System.out.println("Cæsar MENU");
            System.out.println("Ønsker du at kryptere eller dekryptere? Skriv K for at kryptere" +
                " eller skriv D for at dekryptere");
            caesarValg = in.next().charAt(0);

        if (caesarValg == 'K') {
            caesarKryptering();
        } else if (caesarValg == 'D') {
            caesarDekryptering();
        }
    }

    void caesarKryptering() {
            System.out.println("Cæsar Kryptering");
            System.out.println("Indtast tekst:");
            krypteringsTekst = in.nextLine();
            in.nextLine();
            System.out.println("Vælg shift (0-29):");
            shift = in.nextInt();
            System.out.println("Kodeteksten er: ");
            System.out.println("XXXXXXXXXXXXXXXXX");

        efterCaesarKryptering();
    }

    void efterCaesarKryptering() {
        System.out.println("Cæsar Kryptering");
        System.out.println("1) Tryk K for at kryptere en ny tekst");
        System.out.println("2) Tryk D for at dekryptere en tekst");
        System.out.println("3) Tryk T for at komme til hovedmenuen");
        caesarValg = in.next().charAt(0);

        if (caesarValg == 'K') {
            caesarKryptering();
        } else if (caesarValg == 'D') {
            caesarDekryptering();
        } else if (caesarValg == 'T') {
            menu();
        }
    }

    void caesarDekryptering() {
            System.out.println("Cæsar Dekryptering");
            System.out.println("Indtast kodetekst:");
            kodeTekst = in.nextLine();
            in.nextLine();
            System.out.println("Vælg shift (0-29):");
            shift = in.nextInt();
            System.out.println("Originalteksten er: ");
            System.out.println("XXXXXXXXXXXXXXXXX");

        efterCaesarDekryptering();
    }

    void efterCaesarDekryptering() {
        System.out.println("Cæsar kryptering");
        System.out.println("1) Tryk D for at dekryptere en ny tekst");
        System.out.println("2) Tryk K for at kryptere en tekst");
        System.out.println("3) Tryk T for at komme til hovedmenuen");
        caesarValg = in.next().charAt(0);

        if (caesarValg == 'D') {
            caesarDekryptering();
        } else if (caesarValg == 'K') {
            caesarKryptering();
        } else if (caesarValg == 'T') {
            menu();
        }
    }

    void vigenereMenu() {
            System.out.println("Vigenére MENU");
            System.out.println("Ønsker du at kryptere eller dekryptere? Skriv K for at kryptere" +
                " eller skriv D for at dekryptere");
            vigenereValg = in.next().charAt(0);

        if (vigenereValg == 'K') {
            vigenereKryptering();
        } else if (vigenereValg == 'D') {
        vigenereDekryptering();
    } }

    void vigenereKryptering() {
            System.out.println("Vigenére Kryptering");
            System.out.println("Indtast tekst:");
            vigenereTekst = in.nextLine();
            in.nextLine();
            System.out.println("Indtast nøgleord:");
            nogleord = in.nextInt();
            System.out.println("Kodeteksten er:");
            System.out.println("XXXXXXXXXXXXXXXX");

        efterVigenereKryptering();
    }

    void efterVigenereKryptering() {
        System.out.println("Vigenére kryptering");
        System.out.println("1) Tryk K for at kryptere en ny tekst");
        System.out.println("2) Tryk D for at dekryptere en tekst");
        System.out.println("3) Tryk T for at komme til hovedmenuen");
        vigenereValg = in.next().charAt(0);

        if (vigenereValg == 'K') {
            vigenereKryptering();
        } else if (vigenereValg == 'D') {
            vigenereDekryptering();
        } else if (vigenereValg == 'T') {
            menu();
        }
    }

    void vigenereDekryptering() {
            System.out.println("Vigenére Dekryptering");
            System.out.println("Indtast kodetekst:");
            vigenereKodetekst = in.nextLine();
            in.nextLine();
            System.out.println("Indtast nøgleord:");
            nogleord = in.nextInt();
            System.out.println("Originalteksten er:");
            System.out.println("XXXXXXXXXXXXXXXX");

        efterVigenereDekryptering();
    }

    void efterVigenereDekryptering() {
        System.out.println("Vigenére dekryptering");
        System.out.println("1) Tryk D for at dekryptere en ny tekst");
        System.out.println("2) Tryk K for at kryptere en tekst");
        System.out.println("3) Tryk T for at komme til hovedmenuen");
        vigenereValg = in.next().charAt(0);

        if (vigenereValg == 'D') {
            vigenereDekryptering();
        } else if (vigenereValg == 'K') {
            vigenereKryptering();
        } else if (vigenereValg == 'T') {
            menu();
        }
    }

    void exitMenu() {
            System.out.println("Programmet er hermed afsluttet");

    }

    void go() {

        menu();

       while (svar != 3) {

           if (svar == 1) {
               caesarMenu();
           }
           else if (svar == 2) {
            vigenereMenu();
        } }

        if (svar == 3) {
            exitMenu();
        }
    }

    public static void main(String[] args) {
        new Main().go();

    }
}
