package glagoleva;

import java.util.Scanner;

public class PiskvorkyTest {

    private static final Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int[][] mat = {{0,0,0,1,2,1,2}, 
                       {0,0,0,1,1,1,2}, 
                       {0,0,1,2,1,2,0}, 
                       {0,1,1,1,1,0,0}};
        
        System.out.println("");
        System.out.println("Test souvislych k-tic v radce");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.format("%4d ", 
                        PiskvorkyTools.pocetStejnychVRadkuOdDanePozice(mat, i, j));
            }
            System.out.println();
        }
        
        System.out.println("");
        System.out.println("Test souvislych k-tic v sloupci");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.format("%4d ", 
                        PiskvorkyTools.pocetStejnychVSloupciOdDanePozice(mat, i, j));
            }
            System.out.println();
        }
        
        System.out.println("");
        System.out.println("Test souvislych k-tic v diagonalnim smeru 1");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.format("%4d ", 
                        PiskvorkyTools.pocetStejnychVDiag1OdDanePozice(mat, i, j));
            }
            System.out.println();
        }
        
        System.out.println("");
        System.out.println("Test souvislych k-tic v diagonalnim smeru 2");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.format("%4d ", 
                        PiskvorkyTools.pocetStejnychVDiag2OdDanePozice(mat, i, j));
            }
            System.out.println();
        }
    }

}
