package Lista1;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual foi o tempo obtido pela atleta em segundos?");
        int tempo = scanner.nextInt();

        int horas = tempo / (60*60);
        int restoHoras = tempo % (60*60);
        int minutos = restoHoras/60;
        int segundos = restoHoras % 60;

        System.out.println("O tempo foi: " + horas + " : " + minutos + " : " + segundos);
    }
}
