package glagoleva;

import java.util.Scanner;

public class VycetkaPlatidel {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Vycetka Platidel");
        int [] platidla = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int castka;
        int[] vycetka = new int[platidla.length];
        System.out.println("Nacitejte castky, pro ukonceni zadejte nulu nebo zaporne cislo");
        while ((castka = sc.nextInt()) > 0) 
        {
            for (int i = 0; i < vycetka.length; i++) {
                vycetka[i] = castka / platidla[i];
                castka = castka % platidla[i];
                System.out.println((vycetka[i]) + " * " + (platidla[i]) + " kc");
            }
            System.out.println("Vypocet byl ukoncen");
        }
    }

}
