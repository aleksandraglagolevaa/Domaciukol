
package glagoleva;

import java.util.Scanner;

public class PexesoTest {

    private static final Scanner sc = new Scanner(System.in);

   
    public static void main(String[] args) {
        System.out.println("Zadejte rozmery");
        int pr = sc.nextInt();
        while (pr > 0) {
            int ps = sc.nextInt();
            System.out.println("Zadejte pocet dvojic karet");
            int pd = sc.nextInt();
            int[][] mat = PexesoTools.generujMaticiProRozlozeniKaretPexesa(pr, ps, pd);
            if (mat != null) {
                System.out.println("Matice je ok: " + 
                        PexesoTools.testujMaticiProRozlozeniKaretPexesa(mat, pd));
            } else{
                System.out.println("Neplatna data");
            }
            
            System.out.println("Zadejte rozmery");
            pr = sc.nextInt();
        }
    }

}
