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
public class EBook extends ElectronicBook {

    String recommendedReader;

    public String getRecommendedReader() {
        return recommendedReader;
    }

    public void setRecommendedReader(String recommendedReader) {
        this.recommendedReader = recommendedReader;
    }

    @Override
    public String toString() {

        return "EBook\n{\n" + " yearOfPublication=" + yearOfPublication + ",\n"
                + " formatOfElectronicBook=" + formatOfElectronicBook + ",\n"
                + " title=" + title + ",\n"
                + " isbn=" + isbn + ",\n"
                + " author=" + author + ",\n"
                + " downloadLinks=" + downloadLinks + ",\n"
                + " remarksAndNotes=" + remarksAndNotes + ",\n"
                + " publisher=" + publisher + ",\n"
                + " price=" + price + "\n" + " recommendedReader=" + recommendedReader + "\n}\n";
    }

}
