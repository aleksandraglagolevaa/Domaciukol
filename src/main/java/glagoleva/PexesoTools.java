package glagoleva;

import java.util.Random;

public final class PexesoTools {

    private static final Random RND = new Random();

    private PexesoTools() {
    }

    /**
     * Vytvori dvourozmerne pole zadane velikosti a do nej umiisti cisla
     * 1..pDvojicKaret, kazde toto cislo prave 2x
     *
     * @param pr
     * @param ps
     * @param pDvojickaret
     * @return vytvorene a naplnene pole nebo null v pripade chybnych parametru
     */
    public static int[][] generujMaticiProRozlozeniKaretPexesa(int pr, int ps, int pDvojickaret) {
        int pk = pDvojickaret * 2;
        if (pr <= 0 || ps <= 0) {
            return null;
        }
        if (pr * ps < pk) {
            return null;
        }
        int[][] a = new int[pr][ps];
        int cislo = 1;
        for (int pocetCisel = 1; pocetCisel <= pk; pocetCisel++) {
            boolean test = false;
            while (!test) {
                int i = RND.nextInt(pr);
                int j = RND.nextInt(ps);
                if (a[i][j] == 0) {
                    a[i][j] = cislo;
                    test = true;
                }
            }
            if (pocetCisel % 2 == 0) {
                cislo++;
            }
        }
        return a;
    }

    public static boolean testujMaticiProRozlozeniKaretPexesa(int[][] a, int pDvojicKaret) {
        boolean test = true;
        int pocetCisel;
        for (int cislo = 1; cislo <= pDvojicKaret; cislo++) {
            pocetCisel = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] == cislo) {
                        pocetCisel++;
                    }
                }
            }
            if (pocetCisel != 2) {
                test = false;
                break;
            }
        }
        return test;

    }

}
