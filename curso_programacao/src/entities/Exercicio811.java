package entities;

public class Exercicio811 {
    private Integer id;
    private String nome;
    private Double salario;

    public Exercicio811(){

    }
    public Exercicio811(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void increaseSalary(double percentage) {
        salario += salario * percentage / 100.0;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", nome='" + nome + '\'' +
                String.format(", salario=%.2f",salario);
    }
}
