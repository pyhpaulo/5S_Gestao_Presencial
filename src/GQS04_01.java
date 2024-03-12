import java.util.Scanner;

public class GQS04_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorAlunosAprovados = 0;
        int contadorAlunosReprovados = 0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;
        double somaNotas = 0;
        int totalAlunos = 0;

        System.out.println("Informe a nota final e o total de faltas (para encerrar, digite uma nota negativa):");

        while (true) {
            System.out.print("Nota final: ");
            double notaFinal = scanner.nextDouble();

            // Verifica se o usuário deseja encerrar o programa
            if (notaFinal < 0) {
                break;
            }

            System.out.print("Total de faltas: ");
            int totalFaltas = scanner.nextInt();

            // Lógica para contagem e cálculos
            totalAlunos++;
            somaNotas += notaFinal;

            if (notaFinal >= 90) {
                contadorAlunosAprovados++;
            }

            if (notaFinal < 70 || totalFaltas >= 20) {
                contadorAlunosReprovados++;
            }

            if (notaFinal > maiorNota) {
                maiorNota = notaFinal;
            }

            if (notaFinal < menorNota) {
                menorNota = notaFinal;
            }
        }

        // Exibindo os resultados
        System.out.print("\nResultados:");
        System.out.print("a. Alunos com nota >= 90: " + contadorAlunosAprovados);
        System.out.print("b. Alunos reprovados por nota < 70 ou faltas >= 20: " + contadorAlunosReprovados);
        System.out.print("c. Maior nota: " + maiorNota);
        System.out.print("   Menor nota: " + menorNota);
        System.out.print("d. Média de notas da turma: " + (somaNotas / totalAlunos));

        scanner.close();
    }
}
