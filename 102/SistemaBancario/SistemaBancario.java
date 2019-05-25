class SistemaBancario {
    public static void main(String[] args) {
        Gerador gerador = new Gerador();

        Conta c1    = new Conta("José");
        Data data   = new Data(02,01,2019);
        c1.setDataDeAbertura(data);

        Conta c2    = new Conta("Maria");
        Data data2  = new Data(24,06,2019);
        c2.setDataDeAbertura(data2);
        
        System.out.println(c1.recuperaDadosImpressao());
        System.out.println(c2.recuperaDadosImpressao());
    }
}