package Estudos;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº numero: ", i + 1);
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("O %dº numero é: %d\n", i + 1, numeros[i]);
        }

    }
}
