import java.util.Scanner;

public class q04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos coeficientes a, b e c
        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        // Cálculo do discriminante
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Verificação das condições
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Igualdade confirmada: 0 = 0");
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente");
        } else if (a == 0 && b != 0) {
            System.out.println("Esta é uma equação de primeiro grau");
            System.out.println("Raiz real: " + (-c / b));
        } else {
            System.out.println("Esta é uma equação de segundo grau");
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais");
            } else if (delta == 0) {
                System.out.println("Esta equação possui duas raízes reais iguais");
                double raiz = -b / (2 * a);
                System.out.println("Raiz real: " + raiz);
            } else {
                System.out.println("Esta equação possui duas raízes reais diferentes");
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Raiz 1: " + raiz1);
                System.out.println("Raiz 2: " + raiz2);
            }
        }
    }
}
