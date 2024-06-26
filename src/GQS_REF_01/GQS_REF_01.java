package GQS_REF_01;

import java.util.Scanner;

public class GQS_REF_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// IMPLEMENTAÇÃO DA OPÇÃO WHILE PARA O USER REPETIR O CÓDIGO QUANTAS VEZES FOREM NECESSÁRIAS
        while (true) {
            // Leitura dos coeficientes
            double[] coeficientes = lerCoeficientes(scanner);

            // Consistências dos coeficientes
            avaliarCoeficientes(coeficientes);

            // Perguntar ao usuário se deseja continuar
            if (!desejaContinuar(scanner)) {
                break;
            }
        }

        scanner.close();
    }

    //REFATORAÇÃO APLICADA NA SEPARAÇÃO DE METODOS PARA FACILITAR A UTILIZAÇÃO EM OUTRAS PARTES DO CÓDIGO, MENOS DUPLICIDADE

    private static double[] lerCoeficientes(Scanner scanner) {
        System.out.print("Informe o coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.print("Informe o coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.print("Informe o coeficiente c: ");
        double c = scanner.nextDouble();
        return new double[]{a, b, c};
    }

    private static void avaliarCoeficientes(double[] coeficientes) {
        double a = coeficientes[0];
        double b = coeficientes[1];
        double c = coeficientes[2];

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Igualdade confirmada: 0 = 0");
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            resolverEquacaoPrimeiroGrau(b, c);
        } else {
            resolverEquacaoSegundoGrau(a, b, c);
        }
    }

    private static void resolverEquacaoPrimeiroGrau(double b, double c) {
        System.out.println("Esta é uma equação de primeiro grau");
        double x = -c / b;
        System.out.println("O valor da raiz é: " + x);
    }

    private static void resolverEquacaoSegundoGrau(double a, double b, double c) {
        System.out.println("Esta é uma equação de segundo grau");
        double delta = calcularDelta(a, b, c);
        if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais (delta < 0): delta = " + delta);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Esta equação possui duas raízes reais iguais: x' = x'' = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Esta equação possui duas raízes reais diferentes: delta = " + delta + ", x' = " + x1 + ", x'' = " + x2);
        }
    }

    private static double calcularDelta(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    private static boolean desejaContinuar(Scanner scanner) {
        System.out.print("Deseja resolver outra equação? (s/n): ");
        char resposta = scanner.next().charAt(0);
        return resposta == 's' || resposta == 'S';
    }
}
