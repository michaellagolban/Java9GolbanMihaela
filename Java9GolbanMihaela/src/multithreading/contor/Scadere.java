/*
 * Clasa este un thread paralel care va scadea o unitate la un obiect de tip contor
 */
package multithreading;

/**
 *
 * @author Michaela
 */
public class Scadere extends Thread {

    private Contor contor;

    public Scadere(Contor contorulComun) {
        contor = contorulComun;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            contor.decrement();
            //System.out.println(contor.getValoare());
        }
       
    }
}
