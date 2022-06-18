package Lista2;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o seu peso? ");
        double peso = scanner.nextDouble();
        System.out.print("Qual a sua altura? ");
        double altura = scanner.nextDouble();

        double imc = peso / Math.pow(altura , 2);

        if ( imc > 25 ) {
            System.out.println("Você está acima do peso!");
        }
    }
}
