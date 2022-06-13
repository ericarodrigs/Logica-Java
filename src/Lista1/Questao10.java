package Lista1;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos empregados tem na loja?");
        int empregados = scanner.nextInt();
        System.out.println("Qual o valor do salario minimo?");
        int salarioMinimo = scanner.nextInt();
        System.out.println("Qual o preço de custo de uma bicicleta?");
        int precoCusto = scanner.nextInt();
        System.out.println("Quantas bicicletas foram vendidas?");
        int bicicletasVendidas = scanner.nextInt();

        double salarioVendedor = 2 * salarioMinimo + (0.05 * precoCusto * bicicletasVendidas) / empregados;
        double lucroVenda = precoCusto * 0.5;
        double lucroLiquido = (lucroVenda * bicicletasVendidas) - (salarioVendedor * empregados);

        System.out.println("O salario do vendedor é " + salarioVendedor);
        System.out.println("O lucro líquido da loja é " + lucroLiquido);
    }
}
