class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    Data dataDeAbertura;

    void saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
    }

    void deposita(double valor) {
        this.saldo += valor;
    }

    double calculaRendimento() {
        double rendimento = this.saldo *= 0.1;
        return rendimento;
    }

    String recuperaDadosImpressao() {
        String dados = "Titular: " + this.titular;
        dados += "\nAgência: " + this.agencia;
        dados += "\nConta: " + this.numero;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nData de abertura da conta: " + this.dataDeAbertura.formatada();
        
        return dados;
    }

   
}