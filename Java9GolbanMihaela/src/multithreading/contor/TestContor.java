/*
 * Testeaza incrementarea si decrementarea unui contor de catre doua threaduri paralele.
 */
package multithreading.contor;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michaela
 */
public class TestContor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final Contor contor = new Contor();
        Scadere scade = new Scadere(contor);
        Adunare aduna = new Adunare(contor);

        try {
            aduna.start();
            System.out.println(contor.getValoare());
            scade.start();
            System.out.println(contor.getValoare());

        } catch (java.lang.IllegalThreadStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
