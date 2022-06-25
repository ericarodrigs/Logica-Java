package Estudos;

import java.util.Scanner;

public class ParesVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[7];
        int pares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº numero: ", i + 1);
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }
        System.out.printf("O total de numeros pares foi: %d", pares);

    }
}
