package br.com.caelum.modelo;

public class Gerente extends Funcionario{

    private String senha;

    @Override
    public double getBonusSalario() {
        return getSalario() * 0.7;
    }
}
