class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data dataDeAbertura;
    
    public Conta(String titular) {
        this.titular    = titular;
        this.agencia    = "2801-0";
        this.saldo      = 0;
        // this.numero     = gerador.numeros();
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
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

    public Data getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(Data dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public void saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double calculaRendimento() {
        double rendimento = this.saldo *= 0.1;
        return rendimento;
    }

    public String recuperaDadosImpressao() {
        String dados = "Titular: " + this.titular;
        dados += "\nAgência: " + this.agencia;
        dados += "\nConta: " + this.numero;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nData de abertura da conta: " + this.dataDeAbertura.formatada();
        
        return dados;
    }

}