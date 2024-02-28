import java.util.Scanner; //Import da ferramenta scanner que serve para interagir com o user.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in); //Declaração do Sacnner

        System.out.print("Informe a diagonal maior do losango: ");
        //Declaração da diagonalMaior, em Double que pode receber números não inteiros

        double diagonalMaior = scanner.nextDouble();


        System.out.print("Informe a diagonal menor do losango: ");

        //Declaração da diagonalMenor, em Double que pode receber números não inteiros
        double diagonalMenor = scanner.nextDouble();


        //Calculo da área
        double area = (diagonalMaior * diagonalMenor) / 2;

        System.out.println("A área do losangolo é: " + area);



    }//Fim da Static Void
}//Fim da Classe Main