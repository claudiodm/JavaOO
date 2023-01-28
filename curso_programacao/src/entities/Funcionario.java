package entities;

public class Funcionario {

    public String nome;
    public double salBruto;
    public double imposto;

    public double salarioLiq(){
        return salBruto - imposto;
    }

    public double aumento(double percent){
        return salBruto * (1 + (percent/100)) - imposto;
    }
    public String toString(){

        return "funcionário:  " + this.nome + ", $" + salarioLiq();
    }

}
