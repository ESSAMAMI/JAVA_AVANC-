package exo.ja;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("================= EXERCICE 1 - SWAP =================");
        System.out.println("================= AVANT SWAP =================");
        double [] a = {10,20,30};
        double [] b = {40,50,60};
        System.out.println(a);
        System.out.println(b);

        System.out.println("================= APRES SWAP =================");
        double [] x = a;
        a = b;
        b = x;
        System.out.println(a);
        System.out.println(b);


        System.out.println("================= EXERCICE 2 - STRING BUILDER =================");
        StringBuilder [] sbTab ;
        sbTab = new StringBuilder[10];
        for (int i =0; i < sbTab.length; i++ ){
            sbTab[i]= new StringBuilder("Hello");
            System.out.println("=====> "+sbTab[i]);
        }
    }
}
