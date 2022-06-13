package Lista1;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o salário base do funcionário? ");
        double salarioBase = scanner.nextDouble();

        double salarioAReceber = salarioBase + 0.05 * salarioBase - 0.07 * salarioBase;
        String string = "reais.";

        System.out.printf("O salário a receber do funcionário é: %.2f %s", salarioAReceber, string);

    }
}
