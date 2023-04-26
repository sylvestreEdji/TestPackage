package maths;
import java.util.*;


public class Addition {
     static int somme = 0;
     static int x, y;
     public static void ajoute(){

         System.out.print("/********** Addition **********/");
         System.out.print("\n");
         System.out.print("Entrez le premier nombre : ");
         Scanner saisieX = new Scanner(System.in);
         x = saisieX.nextInt();

         System.out.print("Entrez le second nombre : ");
         Scanner saisieY = new Scanner(System.in);
         y = saisieY.nextInt();
        somme += x + y;
         System.out.print("La somme des deux nombres est de : " + somme);

     }
}
