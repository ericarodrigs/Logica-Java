package Lista4;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas vezes vc quer repetir a serie?");
        int limite = scanner.nextInt();

        int soma = 0;

        for (int num1 = 1; num1 <= limite; num1++){
            int resultParcela = num1 * (num1 + 1);
            soma = resultParcela + soma;
        }

        System.out.println("A soma dos " + limite + " primeiros termos da série é " + soma);
    }
}
