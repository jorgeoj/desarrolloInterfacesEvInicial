public class Primos {
    public static int contarDivisores(int numero) {
        int contDiv = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contDiv++;
            }
        }
        return contDiv;
    }

    public static int buscarPrimos(int inicio, int fin) {
        int contPrimos = 0;

        for (int i = inicio; i <= fin; i++) {
            int contDiv = contarDivisores(i);
            if (contDiv == 1 || contDiv == 2) {
                contPrimos++;
                System.out.println(i);
            }
        }

        return contPrimos;
    }
}
