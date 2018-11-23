/*
 * Program Calcul 
 */
package oopcomputer2;

/**
 *
 * @author Michaela
 */
public class TestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creaza un calculator(carcasa)
        Carcasa calculator = new Carcasa();

        //Apasam butoane pana apare un operator
        calculator.buton1.apasa();
        calculator.buton2.apasa();
        calculator.buton3.apasa();
        calculator.butonPlus.apasa();
        calculator.buton3.apasa();
        calculator.buton2.apasa();
        calculator.buton1.apasa();
        
        // Apasam butoane pana apare =
        calculator.butonEgal.apasa();
        
        // afisam rezultatul
        
        //Afisam rezultatul ..se afiseaza rezultatul automat cand se apasa egal

    }

}
