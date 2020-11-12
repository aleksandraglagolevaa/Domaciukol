package glagoleva;

import java.util.Scanner;


public class VypocetFaktorialu {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
          double n,f,i;
        f = 1;
        i = 2;  
        System.out.println("Zadejte hodnotu faktorialu");
        n = sc.nextDouble();
        do{
            f=f*i;
            i++;        
        } while (i <= n);
        System.out.println("Vysledek je: " + f);

    }