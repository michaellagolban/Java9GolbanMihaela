/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadingnotepad;

/**
 *
 * @author Michaela
 */
public class OpenThreeNotepad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread one = new NotepadRunner("C:\\Users\\Michaela\\Desktop\\1.txt");
        Thread two = new NotepadRunner("C:\\Users\\Michaela\\Desktop\\2.txt");
        Thread three = new NotepadRunner("C:\\Users\\Michaela\\Desktop\\3.txt");
        Thread four = new NotepadRunner();

        one.setPriority(Thread.NORM_PRIORITY);
        two.setPriority(Thread.MIN_PRIORITY);
        three.setPriority(Thread.MAX_PRIORITY);
        four.setPriority(Thread.MIN_PRIORITY);

        one.start();
        two.start();
        three.start();
        four.start();
    }

}
