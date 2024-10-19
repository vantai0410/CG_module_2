package model;

public class Clothing extends Product{
    private String idClothing;
    private String size;
    private String color;

    public Clothing( String idClothing,String name, double price, int quantity, String size, String color) {
        super(name, price, quantity);
        this.idClothing = idClothing;
        this.size = size;
        this.color = color;
    }

    @Override
    public double calculateDiscount() {
        return this.getPrice() * 0.3;
    }

    @Override
    public String getProductType() {
        return "Clothing";
    }

    public String getIdClothing() {
        return idClothing;
    }

    public void setIdClothing(String idClothing) {
        this.idClothing = idClothing;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "," + idClothing + "," + size + "," + color;
    }
}
