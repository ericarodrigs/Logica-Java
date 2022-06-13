package Lista1;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor do numero 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Insira o valor do numero 2: ");
        int num2 = scanner.nextInt();

        int aux = num1;

        num1 = num2;
        num2 = aux;

        System.out.println("O valor do num 1 é: " + num1 + " e o valor do num 2 é: " + num2);
    }
}
