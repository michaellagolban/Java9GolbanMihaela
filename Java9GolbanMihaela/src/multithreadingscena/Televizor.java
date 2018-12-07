/*
 * Clasa sTV
 */
package multithreadingscena;

/**
 *
 * @author Michaela
 */
public class Televizor extends Thread {

    Output output;

    public Televizor(Output output) {
        this.output = output;
    }

    @Override
    public void run() {
        output.print("TV: Show-ul dvs incepe acum!");
    }
}
