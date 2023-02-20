package entities;

public class Employe {

    private String nome;
    private Integer hours;
    private  Double valorPorHora;

    public Employe() {
    }

    public Employe(String nome, Integer hours, Double valorPorHora) {
        this.nome = nome;
        this.hours = hours;
        this.valorPorHora = valorPorHora;
    }

    public double payment(){
        return hours * valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }


}
