package br.com.caelum.contas.modelo;

public interface Conta {
	double getSaldo();
	void deposita(double valor);
	void saca(double valor);
	void atualiza(double taxaSelic);
}
