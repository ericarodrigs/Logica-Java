package Estudos;

import java.util.Scanner;

public class ParOuImparFuncao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero ");
        int numero = scanner.nextInt();
        System.out.printf("O numero %d é %s", numero, parOuImpar(numero));
    }

    public static String parOuImpar(int x){
        if (x % 2 == 0){
            return "par";
        } else{
            return "impar";
        }
    }
}