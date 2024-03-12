import java.util.Scanner;

public class q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o coeficiente 'a': ");
        double a = scanner.nextDouble();

        System.out.println("Digite o coeficiente 'b': ");
        double b = scanner.nextDouble();

        System.out.println("Digite o coeficiente 'c': ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Igualdade confirmada: 0 = 0");
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente");
        } else if (a == 0 && b != 0) {
            System.out.println("Esta é uma equação de primeiro grau");
            double x = -c / b;
            System.out.println("Raiz real da equação: x = " + x);
        } else if (a != 0) {
            System.out.println("Esta é uma equação de segundo grau");

            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais");
            } else if (delta == 0) {
                System.out.println("Esta equação possui duas raízes reais iguais");
                double x = -b / (2 * a);
                System.out.println("Valor das raízes: x1 = x2 = " + x);
            } else {
                System.out.println("Esta equação possui duas raízes reais diferentes");
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Valor das raízes: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}
