class Data {

    int dia;
    int mes;
    int ano;
    
    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String formatada() {
        String dataFormatada = "" + this.dia;
        dataFormatada += "/" + this.mes;
        dataFormatada += "/" + this.ano;

        return dataFormatada;
    }
}