package Lista3;

import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Qual a idade da criança?");
            int idade = scanner.nextInt();
            if (idade == 0) {
                break;
            }

            switch (idade) {
                case 1:
                    System.out.println("Faixa de peso: 7,5 kg a 12,5 kg");
                    break;
                case 2:
                    System.out.println("Faixa de peso: 9,8 kg a 15,2 kg");
                    break;
                case 3:
                    System.out.println("Faixa de peso: 14,2 kg a 18 kg");
                    break;
                default:
                    System.out.println("Nao consta na tabela");

            }

        }
    }
}
