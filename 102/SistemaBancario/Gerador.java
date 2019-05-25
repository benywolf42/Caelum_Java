class Gerador {
    private int indiceDoGeradorDeNumeros;

    public int numeros() {
        this.indiceDoGeradorDeNumeros += 1;
        return this.indiceDoGeradorDeNumeros;
    }
}