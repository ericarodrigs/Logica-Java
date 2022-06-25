package Estudos;

import java.util.Scanner;

public class FatorialFuncao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um num ");
        int num = scanner.nextInt();
        System.out.printf("O resultado de %d! é %d", num, fatorial(num));
    }
    public static int fatorial(int x){
        int resultado = 1;
        for (int i = 1; i <= x; i++){
            resultado = resultado * i;
        }
        return resultado;
    }
}
