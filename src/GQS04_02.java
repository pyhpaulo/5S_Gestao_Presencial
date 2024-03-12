import java.util.Scanner;
import java.text.DecimalFormat; //para arredondar o resultado final

public class GQS04_02 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); //declarando o Scanner do import
        DecimalFormat formatoMonetario = new DecimalFormat("#,##0.00"); //Aplicação do import para arredondar o valor final
        //Declaração dos dados
        double somaSalarios = 0;
        double somaFilhos = 0;
        int totalHabitantes = 0;

        System.out.println(" informe o salário e a quantidade de filhos (Para encerrar digite o valor negativo)");

        while (true) {
            System.out.print("Salário:");
            //Entrada de dados do usuário
            double salario = scanner.nextDouble();

            //Base para verificar se o usuário deseja encerrar o programa

            if (salario < 0) {
                break;
            }// Fim da if

            System.out.print("Número de filhos: ");
            int numeroFilhos = scanner.nextInt();

            //Logica para contagem e calculos

            totalHabitantes++;
            somaSalarios += salario;
            somaFilhos += numeroFilhos;

        }//fim do laço while

        //saída dos resultados

        System.out.print("Resultados: ");
        System.out.println("A - A média salarial da população é de " + formatoMonetario.format(somaSalarios / totalHabitantes));
        System.out.println("B. Média do número de filhos: " + formatoMonetario.format (somaFilhos / totalHabitantes));
    }//Fim da void
}//Fim da classe main
