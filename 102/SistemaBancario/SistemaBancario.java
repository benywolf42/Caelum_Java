class SistemaBancario {
    public static void main(String[] args) {
        Conta c1                = new Conta();
        c1.titular              = "José";
        c1.agencia              = "2801-0";
        c1.numero               = 1234;
        c1.saldo                = 10;
        c1.dataDeAbertura       = new Data();
        c1.dataDeAbertura.dia   = 02;
        c1.dataDeAbertura.mes   = 01;
        c1.dataDeAbertura.ano   = 2019;
                
        System.out.println(c1.recuperaDadosImpressao());
    }
}