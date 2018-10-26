/* * Program pentru afisarea cartilor cu toate detaliile
 */
package electronicbooks;

import java.util.ArrayList;

/**
 *
 * @author Michaela
 */
public class SearchBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ElectronicBook> electronicBooks = new ArrayList<>();
        
        EBook eBook1 = new EBook();
        
        eBook1.setYearOfPublication(2001);
        eBook1.setAuthor("Harold Henke");
        eBook1.setTitle("Electronic Books and ePublishing");
        eBook1.setFormatOfElectronicBook("PDF");
        eBook1.setDownloadLinks("https://www.springer.com/us/book/9781852334352");
        eBook1.setIsbn("978-1-4471-0317-2");
        eBook1.setPrice(99.99);
        eBook1.setPublisher("Springer-Verlag London");
        eBook1.setRecommendedReader("Kindle");
        eBook1.setRemarksAndNotes("Good stuff!!");
        
        EBook eBook2 = new EBook();
        
        eBook2.setYearOfPublication(2017);
        eBook2.setAuthor("Karin Bodewits");
        eBook2.setTitle("You Must Be Very Intelligent");
        eBook2.setFormatOfElectronicBook("PDF");
        eBook2.setDownloadLinks("https://www.springer.com/us/book/9783319593203");
        eBook2.setIsbn("978-3-319-59321-0");
        eBook2.setPrice(29.99);
        eBook2.setPublisher("Springer International Publishing");
        eBook2.setRecommendedReader("Kindle");
        eBook2.setRemarksAndNotes("Funny and interesting!!");
        
        IBook iBook1 = new IBook();
        
        iBook1.setYearOfPublication(2018);
        iBook1.setAuthor("Lothar Krienitz");
        iBook1.setTitle("Lesser Flamingos");
        iBook1.setFormatOfElectronicBook("PDF");
        iBook1.setDownloadLinks("https://www.springer.com/us/book/9783662581629");
        iBook1.setIsbn("978-3-662-58163-6");
        iBook1.setPrice(39.99);
        iBook1.setPublisher("Springer-Verlag Berlin Heidelberg");
        iBook1.setiBookReader("iPad, iMac, iPhone");
        iBook1.setRemarksAndNotes("Funny and interesting!!");
        
        electronicBooks.add(eBook1);
        electronicBooks.add(eBook2);
        electronicBooks.add(iBook1);
        
        System.out.println(electronicBooks);
        
    }
    
}
