package GQS03;

import java.util.Scanner;

public class GQS03_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler a idade e o sexo do cliente
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o seu sexo (M/F): ");
        String sexo = scanner.next();

        // Calcular o valor da mensalidade
        double valorMensalidade = 0.0;

        if (sexo.equals("M")) {
            if (idade <= 15) {
                valorMensalidade = 60.0;
            } else if (idade <= 18) {
                valorMensalidade = 75.0;
            } else if (idade <= 30) {
                valorMensalidade = 90.0;
            } else if (idade <= 40) {
                valorMensalidade = 85.0;
            } else {
                valorMensalidade = 80.0;
            }
        } else if (sexo.equals("F")) {
            if (idade <= 18) {
                valorMensalidade = 60.0;
            } else if (idade <= 25) {
                valorMensalidade = 90.0;
            } else if (idade <= 40) {
                valorMensalidade = 85.0;
            } else {
                valorMensalidade = 80.0;
            }
        }

        // Imprimir o valor da mensalidade
        System.out.println("O valor da sua mensalidade é R$" + valorMensalidade);
    }
}

