package GQS07;

import java.util.Scanner;

public class GQS07_03 {
    public static void main(String[] args) {
        //Declaração do Scanner
        Scanner scanner = new Scanner(System.in);

        //Criação do vetor

        double[] numeros = new double[10];

        //Entrada de dados

        System.out.println("Informe 10 numeros reais");
        for (int i = 0; i < 10 ; i++) {
            numeros[i] = scanner.nextDouble();

        }


        //Calculo para exibir maior e menor numeros informados

        double maior = numeros[0];
        double menor = numeros[0];

        for (int i = 0; i < 10 ; i++) {
            if (numeros[i] < menor){
                menor = numeros[i];

            }
            if (numeros[i] > maior){
                maior = numeros[i];
            }

        }

        // exibindo numeros do vetor

        System.out.println("Os numeros digitados são: ");
        for (int i = 0; i < 10 ; i++) {
            System.out.println(numeros[i] + " ");

        }

        //Resultado final

        System.out.println("O menor numero é : " + menor);
        System.out.println("O maior numero é : " + maior);


    }//Fim da void
}//Fim da Classe

