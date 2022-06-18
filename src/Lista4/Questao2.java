package Lista4;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = 0;

        for (int contador = 1; contador <= 10; contador++){
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            if (numero > maior){
                maior = numero;
            }
        }
        System.out.print("O maior numero digitado foi: " + maior);
    }
}
