package Estudos;

import java.util.Scanner;

public class Procedimento2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;
        String n;
        String pesado = "";
        double p;
        double maior = 0;

        topo(maior);

        for (i = 1; i <= 2; i++) {
            System.out.println("Digite o nome: ");
            n = scanner.next();
            System.out.println("Digite o peso de " + n + ": ");
            p = scanner.nextDouble();
            if (p > maior) {
                maior = p;
                pesado = n;
            }
            topo(maior);
        }
        topo(maior);
        System.out.printf("A pessoa mais pesada foi %s, com %.2f quilos.", pesado, maior);
    }

    public static void topo(double maior) {
        System.out.println("");
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println(" D E T E C T O R  D E  P E S A D O ");
        System.out.println(" Maior peso ate agora: " + maior + "kg");
        System.out.println("------------------------------------");
    }
}
