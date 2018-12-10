/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadingscena;

/**
 *
 * @author Michaela
 */
public class Barbatul extends Thread{
    Output output;
    
    public Barbatul(Output output) {
        this.output = output;
    }
    
    @Override
    public void run(){
        output.print("Barbatul face curat prin casa..");
    }
}
