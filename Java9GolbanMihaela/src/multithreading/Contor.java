/*
 * obiectul partajat de cele 2 threaduri
 */
package multithreading;

/**
 *
 * @author Michaela
 */
public class Contor {

    private volatile double valoare = 0.0;

    //metoda incremenetaza valoarea
    public void increment() {
        valoare++;
//        valoare=valoare + 1;
    }

    //metoda decrementeaza valoarea
    public void decrement() {
//        valoare--;
        valoare = valoare - 1;

    }

    //metoda returneaza valoarea
    public double getValoare() {
        try {
            Thread.sleep(400);
        } catch (Exception e) {
            System.out.println(e);
        }
        return valoare;
    }

}
