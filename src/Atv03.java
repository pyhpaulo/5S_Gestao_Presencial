import java.util.Scanner;
public class Atv03 {
    public static void main(String[] args){

        //Inserindo o objeto de Scanner que importamos no java.util
        //Que receberá os dados de entrada do usuário.
        Scanner scanner = new Scanner(System.in);

        //Dados de entrada do usário
        System.out.println("DIGITE O VALOR DO SALÁRIO MÍNIMO: ");
        double salarioMinimo = scanner.nextDouble();

        //Informação do salário do funcionario

        System.out.println("Informe seu salário: ");
        double salarioFuncionario = scanner.nextDouble();
        //Calculo da quantidade de salários minimos que o funcionário recebe

        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;

        System.out.println("O funcionário recebe aproximadamente" + quantidadeSalariosMinimos + "salários minimos");


    }//Fim da Static
}//fim da Class
