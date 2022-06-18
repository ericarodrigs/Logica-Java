package Estudos;

import java.util.Scanner;

public class Procedimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;
        String n;
        String pesado = "";
        double p;
        double Mai = 0;

        System.out.println("");
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println(" D E T E C T O R  D E  P E S A D O ");
        System.out.println(" Maior peso ate agora: " + Mai + "kg");
        System.out.println("------------------------------------");

        for (i =1; i<= 5; i++) {
            System.out.println("Digite o nome: ");
            n = scanner.next();
            System.out.println("Digite o peso de " + n + ": ");
            p = scanner.nextDouble();
            if (p > Mai) {
                Mai = p;
                pesado = n;
            }
            System.out.println("");
            System.out.println("");
            System.out.println("-----------------------------------");
            System.out.println(" D E T E C T O R  D E  P E S A D O ");
            System.out.println(" Maior peso ate agora: " + Mai + "kg");
            System.out.println("------------------------------------");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println(" D E T E C T O R  D E  P E S A D O ");
        System.out.println(" Maior peso ate agora: " + Mai + "kg");
        System.out.println("------------------------------------");
        System.out.printf("A pessoa mais pesada foi %s, com %.2f quilos.", pesado, Mai);
    }
}
