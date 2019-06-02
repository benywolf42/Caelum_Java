package br.com.caelum.modelo;

public class Diretor extends Gerente{

    @Override
    public double getBonusSalario() {
        return super.getBonusSalario() * 1.4;
    }
}
