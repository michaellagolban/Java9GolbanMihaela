/*
 * Clasa femeia
 */
package multithreadingscena;

/**
 *
 * @author Michaela
 */
public class Femeia extends Thread{
    Output output;
    
    public Femeia(Output output) {
        this.output = output;
    }
    
    @Override
    public void run(){
        output.print("Femeia doarme...");
    }
}
