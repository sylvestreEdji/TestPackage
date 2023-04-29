package maths;
import java.util.*;
public class Soustraction {
    static int difference;
    static int x, y;
    public static void soustraire()
    {
        System.out.print("/********** Soustraction **********/");
        System.out.print("\n");
        System.out.print("Entrez le premier nombre : ");
        try (Scanner saisieX = new Scanner(System.in)) {
            x = saisieX.nextInt();
        }
        System.out.print("Entrez le second nombre : ");
        try (Scanner saisieY = new Scanner(System.in)) {
            int y=saisieY.nextInt();

            difference = x - y;
        }
        System.out.println("La difference nous donne : = " + difference);
    }
}
