package entities;

public class OutsourcedEmployee extends Employe {

    private Double additionalCharge;


    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String nome, Integer hours, Double valorPorHora, Double additionalCharge) {
        super(nome, hours, valorPorHora);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
}
