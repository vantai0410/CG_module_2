package model;

public class Book extends Product{
    private String author;
    private String publisher;

    public Book(String id, String name, double price, int quantity, String author, String publisher) {
        super(id, name, price, quantity);
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
    public boolean validate() {
        String idPattern = "B\\d{3}";
        String textPattern = ".+";

        return getId().matches(idPattern) &&
                author.matches(textPattern) &&
                publisher.matches(textPattern);
    }

    @Override
    public String toString() {
        return super.toString() + ", Author: " + author + ", Publisher: " + publisher;
    }
}

