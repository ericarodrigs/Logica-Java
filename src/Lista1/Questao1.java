package Lista1;

public class Questao1 {

    public static void main(String[] args) {

        int a = 1;
        int b = 3;
        int c = 4;
        int d = 8;
        double e = 2.0;

        int resultado1 = a + b + c + d/4;

        System.out.println("O resultado da primeira expressão é: " + resultado1);

        double resultado2 = b/e;

        System.out.println("O resultado da segunda expressão é: " + resultado2);

        boolean resultado3 = ! (c > d);

        System.out.println("O resultado da terceira expressão é: " + resultado3);

        int resultado4 = d / b;

        System.out.println("O resultado da quarta expressão é: " + resultado4);

        boolean resultado5 = a > b || b < c;

        System.out.println("O resultado da quinta expressão é: " + resultado5);

        int resultado6 = 2 * b - d / 2;

        System.out.println("O resultado da sexta expressão é: " + resultado6);

        boolean resultado7 = d % b == 0;

        System.out.println("O resultado da setima expressão é: " + resultado7);

        boolean resultado8 = a > b || b < c && (b > c || c < d);

        System.out.println("O resultado da oitava expressão é: " + resultado8);

        boolean resultado9 = b > c || ! ( 2 * c != d);

        System.out.println("O resultado da nona expressão é: " + resultado9);

        String resultado10 = "a + b + c" + d;

        System.out.println("O resultado da décima expressão é: " + resultado10);

    }
}
