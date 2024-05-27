
//Agora, imagine que temos uma lista de frações: [1/3, 2/5, 3/8, 4/7]
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das frações do primeiro par
        System.out.println("Digite o numerador da primeira fração:");
        int numerador1 = scanner.nextInt();
        System.out.println("Digite o denominador da primeira fração:");
        int denominador1 = scanner.nextInt();

        // Verificação do denominador do primeiro par
        if (denominador1 == 0) {
            System.out.println("Erro: O denominador da primeira fração não pode ser zero.");
            return;
        }

        // Leitura das frações do segundo par
        System.out.println("Digite o numerador da segunda fração:");
        int numerador2 = scanner.nextInt();
        System.out.println("Digite o denominador da segunda fração:");
        int denominador2 = scanner.nextInt();

        // Verificação do denominador do segundo par
        if (denominador2 == 0) {
            System.out.println("Erro: O denominador da segunda fração não pode ser zero.");
            return;
        }

        // Cálculo dos valores decimais das frações
        double valor1 = (double) numerador1 / denominador1;
        double valor2 = (double) numerador2 / denominador2;

        // Comparação dos valores decimais
        if (valor1 > valor2) {
            System.out.println("O primeiro par de frações é maior.");
        } else if (valor2 > valor1) {
            System.out.println("O segundo par de frações é maior.");
        } else {
            System.out.println("Os pares de frações são iguais.");
        }
    }
}