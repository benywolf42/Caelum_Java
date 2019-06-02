package br.com.caelum.modelo;

public class Funcionario {

    private String nome;
    private double salario;

    public double getBonusSalario(){
        return this.salario * 0.5;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
