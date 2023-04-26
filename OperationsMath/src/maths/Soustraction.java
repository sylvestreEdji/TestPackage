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
        Scanner saisieX = new Scanner(System.in);
        x = saisieX.nextInt();

        System.out.print("Entrez le second nombre : ");
        Scanner scan1=new Scanner(System.in);
        int y=scan1.nextInt();

        difference = x - y;
        System.out.println("La difference nous donne : = " + difference);
    }
}
