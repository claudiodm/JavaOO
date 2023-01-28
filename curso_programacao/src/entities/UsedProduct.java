package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{

    private LocalDate manufatureDate;

    public UsedProduct(LocalDate  manufatureDate) {
        this.manufatureDate = manufatureDate;
    }

    public UsedProduct(String name, double price, LocalDate  manufatureDate) {
        super(name, price);
        this.manufatureDate = manufatureDate;
    }

    @Override
    public String priceTag() {
        return super.getName() + " (used) " + String.format("%.2f",super.getPrice()) + " (Manufacture date: " + manufatureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
    }
}
