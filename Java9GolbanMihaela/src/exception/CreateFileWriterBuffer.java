/*
 * This class will create or open a file which allow to write in it; 
 */
package exception;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michaela
 */
public class CreateFileWriterBuffer {

    String file;

    CreateFileWriterBuffer(String file) {
        this.file = file;
    }

    void saveData(String dataToSave) {
        String row = dataToSave + "\n";
        writeRow(row);
    }

    void writeRow(String row) {
        try {
//            if true -> scriem in continuare in file, if false -> stergem ce-i in fisier si scriem in loc 
            BufferedWriter out = new BufferedWriter(new FileWriter(file, false));
            out.write(row);
            out.close();  //save and close file
        } catch (IOException ex) {   //input/output exception
            Logger.getLogger(CreateFileWriterBuffer.class.getName()).log(Level.SEVERE, "Read write exception", ex);
            throw new RuntimeException(ex);
        } finally {
            System.out.println("final block");
        }
    }

    public static void main(String[] args) {
        CreateFileWriterBuffer writer = new CreateFileWriterBuffer("c:\\tmp\\file.txt");
        writer.saveData("Data to save");
    }

}
