package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	
	private Conta conta;
	
	public void criaConta(Evento evento) {
		String tipoDeConta = evento.getSelecionadoNoRadio("tipo");
		if (tipoDeConta.contentEquals("Conta Corrente")) {
			this.conta = new ContaCorrente();
		} else if (tipoDeConta.contentEquals("Conta Poupança")) {
			this.conta = new ContaPoupanca();
		}
		
		this.conta.setAgencia(evento.getString("agencia"));
		this.conta.setNumero(evento.getInt("numero"));	
		this.conta.setTitular(evento.getString("titular"));
	}
	
	public void deposita(Evento evento) {
		double valorDepositado = evento.getDouble("valorOperacao");
		this.conta.deposita(valorDepositado);
	}
	
	public void saca(Evento evento) {
		double valorSacado = evento.getDouble("valorOperacao");
		this.conta.saca(valorSacado);
	}
	
	public void transfere(Evento evento) {
		Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
		conta.transfere(evento.getDouble("valorTransferencia"), destino);
	}
}
