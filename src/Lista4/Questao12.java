package Lista4;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Até onde você quer que o Fibonacci vá?");
        int limite = scanner.nextInt();
        int termo1 = 0;
        int termo2 = 1;
        System.out.print(termo2);

        for (int x = 1; x < limite; x++){
            int resultado = termo1 + termo2;
            termo1 = termo2;
            termo2 = resultado;
            System.out.print(" " + resultado);
        }
    }
}
