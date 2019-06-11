package br.com.caelum.cargos;

public class Diretor extends Gerente{

    @Override
    public double getBonusSalario() {
        return super.getBonusSalario() * 1.4;
    }
}
