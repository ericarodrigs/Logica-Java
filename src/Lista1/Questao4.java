package Lista1;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o ano que você nasceu? ");
        int anoDeNascimento = scanner.nextInt();

        System.out.print("Qual o ano que estamos? ");
        int anoAtual = scanner.nextInt();

        int idadeAtual = anoAtual - anoDeNascimento;
        int anoEscolhido = 2030;
        int idade2030 = anoEscolhido - anoDeNascimento;

        System.out.println("A sua idade no ano atual é: " + idadeAtual);
        System.out.println("A sua idade no ano de 2030 é: " + idade2030);
    }
}
