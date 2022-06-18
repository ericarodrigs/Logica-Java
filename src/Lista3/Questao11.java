package Lista3;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;

        while ( contador <= 5) {

            System.out.print("Digite o primeiro numero desejado ");
            double numero1 = scanner.nextDouble();
            System.out.print("Digite o segundo numero desejado ");
            double numero2 = scanner.nextDouble();
            System.out.print("Qual a operação que você quer realizar? ");
            String operacao = scanner.next();

            switch (operacao) {
                case "soma":
                    double resultado = numero1 + numero2;
                    System.out.println("O resultado da operacao foi: " + resultado);
                    break;
                case "subtracao":
                    double resultado2 = numero1 - numero2;
                    System.out.println("O resultado da operacao foi: " + resultado2);
                    break;
                case "multiplicacao":
                    double resultado3 = numero1 * numero2;
                    System.out.println("O resultado da operacao foi: " + resultado3);
                    break;
                case "divisao":
                    double resultado4 = numero1 / numero2;
                    System.out.println("O resultado da operacao foi: " + resultado4);
                    break;
                default:
                    System.out.println("Operacao inexistente");
                    break;
            }

            contador++;
        }
    }
}
