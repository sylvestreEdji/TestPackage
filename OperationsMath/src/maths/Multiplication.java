package maths;
import java.util.*;
public class Multiplication {
    static int multiple, x, y;

    public static void multiplie()
    {
        System.out.print("/********** Multiplication **********/");
        System.out.print("\n");
        System.out.print("Entrez le premier nombre: ");
        try (Scanner saisieX = new Scanner(System.in)) {
            x = saisieX.nextInt();
        }
        System.out.print("Entrez le second nombre: ");
        try (Scanner saisieY = new Scanner(System.in)) {
            y = saisieY.nextInt();
        }
        multiple = x * y;
        System.out.println("La multiplication des deux nombres donne : " + multiple);
    }
}

