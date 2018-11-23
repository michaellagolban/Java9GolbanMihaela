/*
 * Clasa este un thread paralel care va aduna o unitate la un obiect de tip contor
 */
package multithreading;

/**
 *
 * @author Michaela
 */
public class Adunare extends Thread {

    private Contor contor;

    public Adunare(Contor contorulComun) {
        contor = contorulComun;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            contor.increment();
            //System.out.println(contor.getValoare());
        }
       
    }
}
