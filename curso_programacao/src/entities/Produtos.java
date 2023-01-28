package entities;

public class Produtos {

    private String nome;
    private double price;
    private int qtd;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public double getPrice() {
        return price;
    }

    public int getQtd() {
        return qtd;
    }

    public Produtos(){

    }
    public Produtos(String nome, double preco, int qtd){
        this.nome = nome;
        this.price = preco;
        this.qtd = qtd;
    }

    public Produtos(String nome, double price){
        this.nome = nome;
        this.price = price;
        this.qtd = 0; //é opcional este campo
    }

    public double totalEmEstoque(){
        return qtd * price;
    }

    public void addProdutos(int qtd){
        this.qtd += qtd;
    }

    public void removerProdutos(int qtd){
        this.qtd -= qtd;
    }

    public String toString() {
        return "Dados do produto : " + nome + ", Preço $" + String.format("%.2f",price) + ", quantidade " +
                qtd + ", Total: $" + String.format("%.2f",totalEmEstoque());
    }
}
