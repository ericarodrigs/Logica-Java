package Lista1;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a largura da piscina em centímetros? Obs: utilize múltiplos de 10");
        int largura = scanner.nextInt();
        System.out.println("Qual o comprimento da piscina em centímetros? Obs: utilize múltiplos de 10");
        int comprimento = scanner.nextInt();
        System.out.println("Qual a altura da piscina em centímetros? Obs: utilize múltiplos de 10");
        int altura = scanner.nextInt();

        int areaParedes = 2 * comprimento * altura + 2 * largura * altura;
        int areaPiso = largura * comprimento;

        int areaAzulejo = 100;
        int quantidadeAzulejos = (areaParedes + areaPiso)/areaAzulejo;

        System.out.println("A quantidade necessária de azulejos será: " + quantidadeAzulejos);
    }
}
