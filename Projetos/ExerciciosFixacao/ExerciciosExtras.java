class ExerciciosExtras {
    public static void main(String[] args) {
        // EXERCICIO 1
        // for (int contador = 150; contador <= 300; contador++) {
        //     System.out.println(contador);
        // }
    // ===========================================
        // EXERCICIO 2
        // int soma = 0;
        // for (int i = 1; i <= 1000; i++) {
        //     soma += i;
        //     System.out.println(soma);
        // }
    // ===========================================
        // EXERCICIO 3
        // for (int i = 1; i <= 100; i++) {
        //     if (i%3 == 0) {
        //         System.out.println(i);
        //     }
        // }
     // ===========================================
        // EXERCICIO 4
        // int n = 3;
        int fatorial = 1;
        String s = "";
        for (int n = 15; n >= 1; n--) {
            fatorial *= n;
            if (n == 1) {
                s += n;
            } else if (n > 1) {
                s += n + " x ";
            }
        }
        System.out.println(s + " = " + fatorial);
    }
}