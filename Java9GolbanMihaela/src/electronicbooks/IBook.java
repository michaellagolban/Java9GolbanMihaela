/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicbooks;

/**
 *
 * @author Michaela
 */
public class IBook extends ElectronicBook {

    String iBookReader;

    public String getiBookReader() {
        return iBookReader;
    }

    public void setiBookReader(String iBookReader) {
        this.iBookReader = iBookReader;
    }

    @Override
    public String toString() {
        return "IBook\n{\n" + " yearOfPublication=" + yearOfPublication + ",\n"
                + " formatOfElectronicBook=" + formatOfElectronicBook + ",\n"
                + " title=" + title + ",\n"
                + " isbn=" + isbn + ",\n"
                + " author=" + author + ",\n"
                + " downloadLinks=" + downloadLinks + ",\n"
                + " remarksAndNotes=" + remarksAndNotes + ",\n"
                + " publisher=" + publisher + ",\n"
                + " price=" + price + "\n" + " iBookReader=" + iBookReader + "\n}\n";
    }

}
