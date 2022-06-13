package Lista1;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva o valor que você tem em reais (sem considerar os centavos): ");
        int valor = scanner.nextInt();

        int notasCem = valor / 100;
        int restoCem = valor % 100;

        int notasCinquenta = restoCem / 50;
        int restoCinquenta = restoCem % 50;

        int notasDez = restoCinquenta / 10;
        int restoDez = restoCinquenta % 10;

        int notasCinco = restoDez / 5;
        int restoCinco = restoDez % 5;

        int notasDois = restoCinco / 2;
        int restoDois = restoCinco % 2;

        int notasUm = restoDois;

        System.out.println("A menor quantidade de notas para alcançar esse valor é: " + notasCem + " notas de 100, " +
                notasCinquenta + " notas de 50, " + notasDez + " notas de 10, " + notasCinco + " notas de 5, " + notasDois +
                " notas de 2 e " + notasUm + " notas de 1");
}}