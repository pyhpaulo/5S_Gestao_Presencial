import java.util.Scanner;
public class Atv04 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Informações dos dados de catetos do triângulo
        System.out.println("Digite o valor do 1° cateto: ");
        double cateto1 = scanner.nextDouble();

        //Informação dos dados do segundo cateto do triângulo
        System.out.println("Digite o valor do 2° cateto: ");
        double cateto2 = scanner.nextDouble();

        //Calculo da hipotenusa
        double hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));

        System.out.println("O valor da hipotenusa é: " + hipotenusa);

    }//Fim da Static
}//fim da Class