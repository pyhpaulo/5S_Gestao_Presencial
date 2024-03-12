import java.util.Scanner;

public class q02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o tipo de apartamento e a quantidade de dias
        System.out.print("Digite o tipo de apartamento (S/D): ");
        String tipoApartamento = scanner.next();

        System.out.print("Digite a quantidade de dias: ");
        int quantidadeDias = scanner.nextInt();

        // Calcular o valor total
        double valorTotal = 0.0;

        if (tipoApartamento.equals("S")) {
            if (quantidadeDias < 10) {
                valorTotal = quantidadeDias * 100.0;
            } else if (quantidadeDias <= 15) {
                valorTotal = quantidadeDias * 90.0;
            } else {
                valorTotal = quantidadeDias * 80.0;
            }
        } else if (tipoApartamento.equals("D")) {
            if (quantidadeDias < 10) {
                valorTotal = quantidadeDias * 140.0;
            } else if (quantidadeDias <= 15) {
                valorTotal = quantidadeDias * 120.0;
            } else {
                valorTotal = quantidadeDias * 100.0;
            }
        }

        // Imprimir o valor total
        System.out.println("O valor total a ser pago é R$" + valorTotal);
    }
}
