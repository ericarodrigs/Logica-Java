package Estudos;

import java.util.Scanner;

public class Procedimento3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int a = scanner.nextInt();
        System.out.println("Digite um numero: ");
        int b = scanner.nextInt();

        soma(a, b);
    }

    public static void soma(int a, int b) {
        System.out.printf("Recebi o valor %d\n", a);
        System.out.printf("Recebi o valor %d\n", b);
        System.out.printf("A soma vale %d", a + b);
    }
}
