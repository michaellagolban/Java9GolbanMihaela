/*
 * Program Calcul 
 */
package oopcomputervariantapersonala;

import java.util.Scanner;

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
        
        
        //Ecran = 0
        //Apasam butoane pana apare un operator
        calculator.ecran.setAfisaj(calculator.buton1.apasa().toString());
        //Ecran = 1
        
        calculator.ecran.setAfisaj(calculator.ecran.getAfisaj()+calculator.buton2.apasa());
        //Ecran = 12
        
        calculator.ecran.setAfisaj(calculator.ecran.getAfisaj()+calculator.buton3.apasa());
        //Ecran = 123
        
        calculator.alu.setOperandUnu(new Integer(calculator.ecran.getAfisaj()));
        calculator.alu.setOperand(calculator.butonPlus.apasa());
        
        
        calculator.ecran.setAfisaj(calculator.buton3.apasa().toString());
        //Ecran = 3
        
        calculator.ecran.setAfisaj(calculator.ecran.getAfisaj()+calculator.buton2.apasa());
        //Ecran = 32
        
        calculator.ecran.setAfisaj(calculator.ecran.getAfisaj()+calculator.buton1.apasa());
        //Ecran = 321
        
        calculator.alu.setOperandDoi(new Integer(calculator.ecran.getAfisaj()));
        
        //Apasam butoane pana apare =
        calculator.alu.calculeaza();
        System.out.println(calculator.alu.getOperandUnu().toString() + calculator.alu.getOperand().toString() 
                +calculator.alu.getOperandDoi().toString() + calculator.butonEgal.apasa() + calculator.alu.getRezultat());
        
        //Afisam rezultatul ..se afiseaza rezultatul automat cand se apasa egal
        
        
        
        
    }
    
}
