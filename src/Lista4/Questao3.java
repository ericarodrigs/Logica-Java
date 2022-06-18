package Lista4;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = -9999;
        int maior2 = -9999;

        for (int contador = 1; contador <= 3; contador++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            if (numero > maior) {
                maior2 = maior;
                maior = numero;
            } else if (numero > maior2) {
                maior2 = numero;
            }
        }
        System.out.println("O maior foi: " + maior);
        System.out.println("O 2o maior foi: " + maior2);
    }

}

