package Lista4;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int somaImpares = 0;

        for (int contador = 1; contador <= numero; contador++){
            if (contador % 2 == 1){
                somaImpares = somaImpares + contador;
            }
        }
        System.out.println("A soma de todos os números impares de 1 até " + numero + " deu: " + somaImpares);
    }
}
