/*
 * TTest multithreading
 */
package multithreadingscena;

/**
 *
 * @author Michaela
 */
public class Testmultithreading {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    

public static void main(String[] args) throws InterruptedException {
        Output output = new Output();
        Barbatul barbatul = new Barbatul(output);
        Femeia femeia = new Femeia(output);
        Televizor televizor = new Televizor(output);
        barbatul.start();
        Thread.sleep(2000);
        femeia.start();
        Thread.sleep(2000);
        televizor.start();
        Thread.sleep(2000);
        System.out.println("Barbatul: Auzi! Incepe emisiunea ta preferata! Trezeste-te!");
    }
    
}
