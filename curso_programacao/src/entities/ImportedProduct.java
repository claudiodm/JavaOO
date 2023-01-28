package entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(Double customsFree) {
        this.customsFee = customsFree;
    }

    public ImportedProduct(String name, double price, Double customsFree) {
        super(name, price);
        this.customsFee = customsFree;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return super.getName() + " $" + totalPrice() + " (Customs fee: $ " + customsFee + ")";
    }
    public Double totalPrice(){
        return super.getPrice() + customsFee;
    }
}
