/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddfigures;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michaela
 */
public class CercTest {
    
    public CercTest() {
    }

    /**
     * Test of getDefinition method, of class Cerc.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Cerc instance = new Cerc();
        String expResult = "CIRCLE: a plane figure whose boundary (the circumference) consists of points equidistant from a fixed point (the centre).";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
