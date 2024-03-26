import java.util.Scanner;

public class SumaImparLimite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0, total = 0;

        System.out.print("Ingrese el número de inicio: ");
        int min = scanner.nextInt();

        System.out.print("Ingrese el número final: ");
        int max = scanner.nextInt();

        if(min % 2 == 0) {
            min = min + 1;
        } // convierto un par en impar de manera ultra rudimentaria

        int contador = min; // Inicializamos el contador con el valor de min

        do {
            if(contador % 2 != 0) {
                total += contador;
            }
            contador += 2; // Avanzamos al siguiente número impar
            System.out.println("valor total: " + total);

        } while (contador <= max);

    }
}