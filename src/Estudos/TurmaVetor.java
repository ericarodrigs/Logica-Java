package Estudos;

import java.util.Scanner;

public class TurmaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[4];
        double[] nota1 = new double[4];
        double[] nota2 = new double[4];
        double[] media = new double[4];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Aluno " + (i + 1));
            System.out.print("Nome: ");
            nomes[i] = tabularString(scanner.next());
            System.out.print("Primeira nota: ");
            nota1[i] = scanner.nextDouble();
            System.out.print("Segunda nota: ");
            nota2[i] = scanner.nextDouble();
            media[i] = (nota1[i] + nota2[i]) / 2;
        }
        System.out.println("LISTAGEM DE ALUNOS");
        System.out.println("______________________");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i] + media[i]);
        }
    }

    public static String tabularString(String nome) {
        for (int i = nome.length(); i < 17; i++) {
            nome += " ";
        }
        return nome;
    }


}
