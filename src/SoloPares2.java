import java.util.Scanner;

public class SoloPares2 {
    public static void main(String[] args) {

        int i = 0, contador = 0, numero = 2;

        System.out.print("Ingrese la cantidad de digitos pares a visualizar: ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        do{
            if(numero % 2 == 0) {
                System.out.printf("%d\n", numero);
                numero += 2;
                contador ++;
            }
        }while (contador < n);

    }
}