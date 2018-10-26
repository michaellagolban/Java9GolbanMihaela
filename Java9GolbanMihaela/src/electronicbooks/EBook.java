/*
 * Am creat clasa mostenitoare in care am adugat proprietate suplimentara
 * Am suprascris metoda toString din clasa Object pt a afisa obiectele de tip Ebook
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
