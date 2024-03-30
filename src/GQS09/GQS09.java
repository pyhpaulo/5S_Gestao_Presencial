package GQS09;
import java.util.Scanner;

public class GQS09 {

    // Método para leitura da matriz
    public static int[][] lerMatriz() {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }

    // Método para exibição da matriz
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método para imprimir os elementos específicos: índice da linha é par e o índice da coluna é ímpar
    public static void imprimirParesImpares(int[][] matriz) {
        System.out.println("Elementos pares nas linhas pares e elementos ímpares nas colunas ímpares:");
        for (int i = 0; i < matriz.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matriz[0].length; j++) {
                    if (j % 2 == 1) {
                        if (matriz[i][j] % 2 == 0) {
                            System.out.println(matriz[i][j] + " é Par ");
                        } else {
                            System.out.println(matriz[i][j] + " é Ímpar ");
                        }
                    }
                }
            }
        }
    }

    // Método para calcular e exibir a matriz transposta
    public static void calcularEExibirTransposta(int[][] matriz) {
        System.out.println("Matriz Transposta:");
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método para trocar os elementos da diagonal principal com os elementos da diagonal secundária
    public static void trocarDiagonais(int[][] matriz) {
        int tamanho = matriz.length;
        for (int i = 0; i < tamanho; i++) {
            int temp = matriz[i][i];
            matriz[i][i] = matriz[i][tamanho - 1 - i];
            matriz[i][tamanho - 1 - i] = temp;
        }

        // Imprimir a matriz resultante
        System.out.println("Matriz após troca:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matriz = lerMatriz();
        exibirMatriz(matriz);
        System.out.println();
        imprimirParesImpares(matriz);
        System.out.println();
        calcularEExibirTransposta(matriz);
        System.out.println();
        trocarDiagonais(matriz);
    }
}
