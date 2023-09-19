import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numInicio, numFin, contPrimos;
        Scanner sc = new Scanner(System.in);

        System.out.println("BUSCADOR DE PRIMOS");

        do {
            System.out.println("Escriba el numero inicial (0 para salir):");
            numInicio = sc.nextInt();

            if (numInicio!=0) {
                System.out.println("Escriba el numero final:");
                numFin = sc.nextInt();

                System.out.println("Buscando primos...");

                contPrimos = Primos.buscarPrimos(numInicio, numFin);
                System.out.println("Se han encontrado " + contPrimos + " numeros primos en el intervalo");

            }
        }while (numInicio!=0);

        sc.close();

    }

}
