	package br.com.caelum.contas.modelo;

public abstract class Conta {
	
    private String titular;
    private int numero;
    private String agencia;
	protected double saldo;
    
    public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

    public void saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
    }

    public void deposita(double valor) {
        if (valor < 0) {
        	throw new IllegalArgumentException("Você tentou depositar "
        									+ "um valor negativo!");
        } else {
        	this.saldo += valor;
        }
    }

    public abstract String getTipo();

    public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
    
    public String testeDeMetodoAbstrato() {
    	return this.getTipo();
    }

}