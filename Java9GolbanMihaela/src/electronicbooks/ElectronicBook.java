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
//Orice classa in java care nu mostineste nici o alta classa extends by default classa Object.
public class ElectronicBook {

    Integer yearOfPublication;
    String formatOfElectronicBook;
    String title;
    String isbn;
    String author;
    String downloadLinks;
    String remarksAndNotes;
    String publisher;
    Double price;

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getFormatOfElectronicBook() {
        return formatOfElectronicBook;
    }

    public void setFormatOfElectronicBook(String formatOfElectronicBook) {
        this.formatOfElectronicBook = formatOfElectronicBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDownloadLinks() {
        return downloadLinks;
    }

    public void setDownloadLinks(String downloadLinks) {
        this.downloadLinks = downloadLinks;
    }

    public String getRemarksAndNotes() {
        return remarksAndNotes;
    }

    public void setRemarksAndNotes(String remarksAndNotes) {
        this.remarksAndNotes = remarksAndNotes;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
