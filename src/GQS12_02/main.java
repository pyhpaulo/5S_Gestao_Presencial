package GQS12_02;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dividendo (número a ser dividido):");
        int dividendo = scanner.nextInt();

        System.out.println("Digite o divisor (número pelo qual será dividido):");
        int divisor = scanner.nextInt();

        // Tentativa de efetuar a divisão
        try {
            // Chama o método dividir da classe Divisao e armazena o resultado
            int resultado = Divisao.dividir(dividendo, divisor);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) { // Captura a exceção do tipo ArithmeticException
            System.out.println("Erro: " + e.getMessage()); // Imprime a mensagem de erro associada à exceção
        }

        scanner.close();
    }
}
