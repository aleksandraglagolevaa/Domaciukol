package glagoleva;

import java.util.Scanner;


public class VypocetMocniny {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        double c,m,v;
        System.out.println("Zadejte cislo a mocninu");
        c = sc.nextDouble();
        m = sc.nextDouble();
        v = Math.pow(c, m);
        System.out.println("Vysledek je: " + v);
    }

}