package demo;
import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);
    int menu1, menu2, menu0;

    void menu() {
        System.out.println("MENU");
        System.out.println("1) Cæsar (tast 1 for at vælge):");
        menu1 = in.nextInt();
        System.out.println("2) Vigenére (tast 2 for at vælge):");
        menu2 = in.nextInt();
        System.out.println("0) Exit (tast 0 for at vælge):");
        menu0 = in.nextInt();
    }

    void go() {
        //samle metoder
    }

    public static void main(String[] args) {
        new Main().go();

    }
}
