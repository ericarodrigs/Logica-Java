package Lista1;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        int soma = ((1 + numero) * numero) / 2;

        System.out.println("A soma dos números é: " + soma);
    }
}
