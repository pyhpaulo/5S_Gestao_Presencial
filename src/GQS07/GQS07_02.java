package GQS07;

import java.util.Scanner;
public class GQS07_02 {
    public static void main (String[] args){

        //Importação do scanner
        Scanner scanner = new Scanner (System.in);

        //Double para o vetor com numeros reais

        double[] numeros = new  double[10];

        //Entrada de dados do usuário e leitura do vetor

        System.out.println("Informe 10 numeros reais");
        for (int i = 0; i < 10 ; i++) {
            numeros[i] = scanner.nextDouble();

        }

        //Exibindo numeros do vetor

        System.out.println("Numeros digitados");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i] + " ");

        }

        //Exibindo a posição do numero no vetor e numeros negativos

        System.out.println("Posição dos numeros negativos");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] < 0) {
                System.out.print("Posição " + i + " : " + numeros[i]);

            }

        }

    }//Fim da Void

}//Fim da Class principal
