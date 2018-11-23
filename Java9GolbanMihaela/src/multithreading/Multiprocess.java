/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michaela
 */
public class Multiprocess {

    public static void main(String[] args) {
        try {
            ProcessBuilder pb;
            // Use process builder to start 2 processes multithreading.SayHello with parameter
            
            //TODO replace all path to local one 
            pb = new ProcessBuilder(
                    "java",
                    "-classpath",
                    "C:\\Users\\Michaela\\Documents\\NetBeansProjects\\Java9GolbanMihaela\\Java9GolbanMihaela\\Java9GolbanMihaela\\build\\classes",
                    "multithreading.SayHello",
                    "2", "John", "Jane");
            Map<String, String> env = pb.environment();
            env.put("TEXT_CONGRATS", "Congratulations for starting your process! ");
            env.remove("OTHERVAR");
            env.put("TEXT_HI", "Hello ");
            //TODO same as above 
            pb.directory(new File("C:\\Users\\Michaela\\Documents\\NetBeansProjects\\Java9GolbanMihaela\\Java9GolbanMihaela\\Java9GolbanMihaela\\build\\classes\\multithreading"));
            Process p1 = pb.start();
            Process p2 = pb.start();
        } catch (IOException ex) {
            Logger.getLogger(Multiprocess.class.getName()).log(Level.SEVERE, "An IO exception is here!", ex);
        }
    }

}
