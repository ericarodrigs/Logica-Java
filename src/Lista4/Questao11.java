package Lista4;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero?");
        int numero = scanner.nextInt();
        int fatorial = 1;

        for (int x = 1; x <= numero; x++){
            fatorial = fatorial * x;
        }

        System.out.println("O valor de " + numero + "! é: " + fatorial);
    }
}
