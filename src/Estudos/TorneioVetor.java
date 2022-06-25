package Estudos;

import java.util.Scanner;

public class TorneioVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] times = new String[3];

            int tamanho = 0;
        for (int i = 0; i < times.length; i++) {
            System.out.printf("Digite o nome do %dº time: ", i + 1);
            times[i] = scanner.next();
            if (tamanho < times[i].length())
            tamanho = times[i].length();
        }


        for (int i = 0; i < times.length; i++) {
            for (int j = 0; j < times.length; j++) {
                if (i != j) {
                    System.out.println(tabularString(times[i], tamanho) + "[   ]   X   [   ]  " +times[j]);
                }
            }

        }
    }
    public static String tabularString(String nome, int tamanho) {
        for (int i = nome.length(); i <= tamanho; i++) {
            nome += " ";
        }
        return nome;
    }
}
