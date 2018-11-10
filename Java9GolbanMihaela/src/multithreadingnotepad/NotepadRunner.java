/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadingnotepad;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michaela
 */
public class NotepadRunner extends Thread {

    String filePath = "myfile.txt";

    public NotepadRunner() {
    
    }

    public NotepadRunner(String newFilePath) {
        filePath = newFilePath;
    }

    @Override
    public void run() {
        ProcessBuilder windowsProcess = new ProcessBuilder("Notepad.exe", filePath);
        try {
            windowsProcess.start();
        } catch (IOException ex) {
            Logger.getLogger(NotepadRunner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
