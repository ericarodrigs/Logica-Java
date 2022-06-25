package Lista5;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i=1; i<=5; i++){
            int div = 0;
            System.out.println("Digite um numero ");
            int numero = scanner.nextInt();
            for(int x =1; x <= numero; x++){
                if (numero % x == 0){
                    div++;
                }
            }
            if (div > 2) {
                System.out.println("O numero " + numero + " nao e primo!");
            } else {
                System.out.println("O numero " + numero + " e primo!");
            }
        }
    }
}

