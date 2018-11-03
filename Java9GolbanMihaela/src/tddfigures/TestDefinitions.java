/*
 * Test definitions
 */
package tddfigures;

import java.util.LinkedList;

/**
 *
 * @author Michaela
 */
public class TestDefinitions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creem mai multe instante din fiecare clasa
        
        Dreptunghi d1 = new Dreptunghi();
        Dreptunghi d2 = new Dreptunghi();
        Cerc c1 = new Cerc();
        Patrat p1 = new Patrat();
        Triunghi t1 = new Triunghi();
        Triunghi t2 = new Triunghi();
        
        //Creem o colectie de date si incarcam in ea obiecte
        
        LinkedList <FiguraGeometrica> listaDeFiguri = new LinkedList();
        listaDeFiguri.add(d1);
        listaDeFiguri.add(d2);
        listaDeFiguri.add(c1);
        listaDeFiguri.add(p1);
        listaDeFiguri.add(t1);
        listaDeFiguri.add(t1);
        
        //parcurgem lista si listam figurile
        
        listaDeFiguri.forEach((t) -> {
            System.out.println(t.getDefinition());
        });
    }
    
}
