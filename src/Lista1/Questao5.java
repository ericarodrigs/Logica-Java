package Lista1;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o raio do círculo? ");
        double raio = scanner.nextDouble();

        double pi = Math.PI;
        double diametroCirculo = 2 * raio;
        double perimetroCirculo = 2 * pi * raio;
        double areaCirculo = pi * Math.pow(raio,2);

        System.out.printf("O diâmetro do círculo é: %.2f \n", diametroCirculo);
        System.out.printf("O perímetro do círculo é: %.2f \n", perimetroCirculo);
        System.out.printf("A área do círculo é: %.2f", areaCirculo);
    }
}
