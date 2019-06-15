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
    
    @Override
    public String toString() {
    	return "Número: " + + this.numero + " Titular: " + this.titular;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + numero;
		result = prime * result + ((titular == null) ? 0 : titular.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (numero != other.numero)
			return false;
		if (titular == null) {
			if (other.titular != null)
				return false;
		} else if (!titular.equals(other.titular))
			return false;
		return true;
	}

}