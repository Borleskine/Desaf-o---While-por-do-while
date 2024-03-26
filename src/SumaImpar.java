import java.util.Scanner;

public class SumaImpar {
    public static void main(String[] args) {


        int i = 0, contador = 0, numero = 1, total = 0;

        System.out.print("Ingrese la cantidad de digitos pares a visualizar: ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        do {
            if (numero % 2 != 0 ) {
                contador ++;
                total = total + numero;
            }
            numero += 2;
        } while (contador < n);

        System.out.print("valor total: " + total);

    }
}
