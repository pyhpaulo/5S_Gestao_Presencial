package GQS08;
import java.util.Scanner;

public class GQS08_01 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Criação da Matriz 5x5

        int [][] matriz = new int [5][5];

        // #Questão A) - Leitura e impressão da matriz

        //entrada de dados

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        //exibição dos dados

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();


        //Questão B - Impressão dos elementos específicos , índice da linha é
        //par e o índice da coluna é ímpar.

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

        System.out.println();

        //Questão C - Imprimir a matriz transposta da matriz informada. OBS: na matriz transposta,
        //as linhas da matriz tornam-se colunas e as colunas, linhas.

        // Imprimir a matriz transposta
        System.out.println("Matriz Transposta:");
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        //Questão D - Trocar os elementos da diagonal principal com os elementos da diagonal
        //secundária. Imprimir a matriz resultante.


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


    }// Fim da void
}// Fim da class principal
