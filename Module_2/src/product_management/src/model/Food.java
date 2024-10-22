package model;

import java.time.LocalDate;

public class Food extends Product {
    private LocalDate expirationDate;

    public Food(String id, String name, double price, int quantity, LocalDate expirationDate) {
        super(id, name, price, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public double calculateDiscount() {
       if(expirationDate.isBefore(LocalDate.now().plusDays(3))) {
           return this.getPrice() * 0.2;
       }
       return 0;
    }

    @Override
    public String getProductType() {
        return "Food";
    }


    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }



    @Override
    public String toString() {
        return super.toString() + ", Expiration Date: " + expirationDate;
    }
}
