package maths;

import java.util.Scanner;

public class Division {
    static int division, x, y;

    public static void divise()
    {
        System.out.print("/********** Division **********/");
        System.out.print("\n");
        System.out.print("Entrez le premier nombre : ");
        try (Scanner saisieX = new Scanner(System.in)) {
            x = saisieX.nextInt();
        }
        System.out.print("Entrez le second nombre : ");
        try (Scanner saisieY = new Scanner(System.in)) {
            int y=saisieY.nextInt();

            division = x / y;
        }
        System.out.println("La division nous donne : = " + division);
    }
}
