package Estudos;

import java.util.Scanner;

public class FibonacciFuncao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 1;
        System.out.print("Fale até qual termo você quer ir: ");
        int limite = scanner.nextInt();
        System.out.print(b);

        fibonacci(a, b, limite);
    }

    public static void fibonacci(int x, int y, int limite) {
        for (int i = 1; i < limite; i++) {
            int resultado = x + y;
            x = y;
            y = resultado;
            System.out.print(" " + resultado);
        }
    }

}
