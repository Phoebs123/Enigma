package demo;
import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);
    int menu1, menu2, menu0, shift;
    char caesarValg;
    String krypteringsTekst;

    void menu() {
        System.out.println("MENU");
        System.out.println("1) Cæsar (tast 1 for at vælge):");
        menu1 = in.nextInt();
        System.out.println("2) Vigenére (tast 2 for at vælge):");
        menu2 = in.nextInt();
        System.out.println("0) Exit (tast 0 for at vælge):");
        menu0 = in.nextInt();
    }

    void caesarMenu() {
        if (menu1 == 1) {
            System.out.println("Ønsker du at kryptere eller dekryptere? Skriv K for at kryptere" +
                "eller skriv D for at dekryptere");
            caesarValg = in.next().charAt(0);
        }
    }

    void caesarKryptering() {
        if (caesarValg == 'K') {
            System.out.println("Cæsar Kryptering");
            System.out.println("Indtast tekst:");
            krypteringsTekst = in.nextLine();
            System.out.println("Vælg shift (0-29):");
            shift = in.nextInt();
            System.out.println("Kodeteksten er: ");
            System.out.println("XXXXXXXXXXXXXXXXX");
        }
    }

    void go() {
        //samle metoder
    }

    public static void main(String[] args) {
        new Main().go();

    }
}
