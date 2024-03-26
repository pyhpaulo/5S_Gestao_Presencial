package GQS07;

import java.util.Scanner;
public class GQS07_01 {
    public static void main(String[] args){

        //Importação do Scanner
        Scanner scanner = new Scanner(System.in);

        //Criação do vetor

        int[] numeros = new int[10];

        //Entrada de dados dos numeros digitados e armazenados

        System.out.println("Informe 10 numeros inteiros: ");
        for (int i = 0; i < 10; i++){
            numeros[i] = scanner.nextInt();;
        }

        //Exibindo numeros amarzenados no vetor

        System.out.println("Numeros digitados");
        for (int i = 0; i < 10 ; i++) {
            System.out.println(numeros[i] + " ");

        }

        //Calculo da soma dos numeros pares

        int soma = 0;
        for (int i = 0; i < 10 ; i++) {
            if (numeros[i] % 2 == 0){
                soma += numeros[i];
            }

        }

        //Resultado final

        System.out.println("A soma dos números pares é : " + soma);



    }//Fim da Void
}//Fim da Class Principal
