/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author Michaela
 */
public class UiteAsa {

    public static void main(String[] args) {
        Thread tha = new HelloAllThread();
        System.out.println("Prioritatea threadului tha este:" + tha.getPriority());
        Thread thw = new HelloWorldThread();
        System.out.println("Prioritatea threadului thw este:" + thw.getPriority());
        thw.setPriority(Thread.MAX_PRIORITY);
        tha.setPriority(Thread.MIN_PRIORITY);
        tha.start();
        thw.start();
    }
}
