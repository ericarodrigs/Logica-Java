package Lista2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if ( numero > 0 ) {
            System.out.println("O número digitado é positivo!");
        } else if ( numero < 0 ){
            System.out.println("O número digitado é negativo!");
        } else {
            System.out.println("O número digitado é ZERO!");
        }
    }
}
