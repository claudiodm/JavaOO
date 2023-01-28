package entities;

public class ContaBanco {

    private int conta;
    private String nome;
    private double depositoIni;

    public ContaBanco(int conta, String nome, double depositoIni) {
        this.conta = conta;
        this.nome = nome;
        deposito(depositoIni);
    }
    public ContaBanco(int conta, String nome) {
        this.conta = conta;
        this.nome = nome;
    }

    public int getConta() {
        return conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDepositoIni() {
        return depositoIni;
    }

    public void deposito(double valor){
        depositoIni += valor;
    }
    public void saquar(double valor){
        depositoIni-=valor + 5.0;
    }

    public String toString() {
        return "Conta: "
                + conta
                + ", Usuário: "
                + nome
                + ", Deposito Inicial: R$ "
                + String.format("%.2f", depositoIni)
                ;
    }
}
