package GQS_REF_01;

import java.util.Scanner;

//Código antes da refatoração

public class GQS_N_REF_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos coeficientes
        System.out.print("Informe o coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.print("Informe o coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.print("Informe o coeficiente c: ");
        double c = scanner.nextDouble();

        // Consistências dos coeficientes
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Igualdade confirmada: 0 = 0");
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            System.out.println("Esta é uma equação de primeiro grau");
            double x = -c / b;
            System.out.println("O valor da raiz é: " + x);
        } else {
            System.out.println("Esta é uma equação de segundo grau");
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            } else if (delta == 0) {
                System.out.println("Esta equação possui duas raízes reais iguais.");
                double x = -b / (2 * a);
                System.out.println("O valor da raiz é: " + x);
            } else {
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Os valores das raízes são: " + x1 + " e " + x2);
            }
        }

        scanner.close();
    }
}
