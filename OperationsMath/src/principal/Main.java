package principal;

/**
 *
 */
public class Main extends Thread{
    public static void main(String[] args) throws InterruptedException {


        maths.Addition.ajoute();
        System.out.print("\n");

        Thread.sleep(5000);

        System.out.print("\n");
        maths.Soustraction.soustraire();

        Thread.sleep(5000);

        System.out.print("\n");
        maths.Multiplication.multiplie();

        Thread.sleep(5000);

        System.out.print("\n");

        maths.Division.divise();

        System.out.print("\n");
        System.out.println(" Merci et au revoir !!! ");

    }
}