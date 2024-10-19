package model;

public class Book extends Product{
    private String idBook;
    private String author;
    private String publisher;

    public Book(String idBook, String name, double price, int quantity, String author, String publisher) {
        super(name, price, quantity);
        this.idBook = idBook;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public double calculateDiscount() {
        return this.getPrice() * 0.15;
    }

    @Override
    public String getProductType() {
        return "Book";
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return super.toString() + "," + idBook + "," + author + "," + publisher;
    }
}
