package br.com.caelum.main;

import br.com.caelum.modelo.Conta;
import br.com.caelum.modelo.Data;

/*
 * AQU FICA A MAIN DO PROJETO
 */

class SistemaBancario {

	public static void main(String[] args) {
		Conta c1 = new Conta("José", new Data(02, 01, 2019));
		Conta c2 = new Conta("Maria", new Data(24, 06, 2019));

		System.out.println(c1.recuperaDadosImpressao());
		System.out.println(c2.recuperaDadosImpressao());
	}
}