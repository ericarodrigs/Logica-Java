package Estudos;

import java.util.Scanner;

public class SomaFuncao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o 1 numero ");
        int a = scanner.nextInt();
        System.out.print("Digite o 2 numero ");
        int b = scanner.nextInt();
        System.out.print("O resultado da soma é: " + soma(a,b));
    }
    public static int soma(int x, int y){
        return x + y;
    }
}
