package model;

import java.time.LocalDate;

public class Food extends Product {
    private String idFood;
    private LocalDate expirationDate;

    public Food(String idFood,String name, double price, int quantity, LocalDate expirationDate) {
        super(name, price, quantity);
        this.idFood = idFood;
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

    public String getIdFood() {
        return idFood;
    }

    public void setIdFood(String idFood) {
        this.idFood = idFood;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + "," + idFood + "," + expirationDate;
    }
}
