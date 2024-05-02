package GQS12;

// Importando a classe Scanner para entrada de dados do usuário
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Criando objeto Scanner que importamos
        Scanner scanner = new Scanner(System.in);

        //Entrada de dados do usuário
        System.out.println("Digite o dividendo (número a ser dividido):");
        int dividendo = scanner.nextInt();
        // Entrada do divisor que será inserido pelo usuário
        System.out.println("Digite o divisor (número pelo qual será dividido):");
        int divisor = scanner.nextInt();

        try {
            //Chamada do método dividir e amazena o resultado
            int resultado = dividir(dividendo, divisor);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e)
        //Arithmetic utilizada para capturar um tipo especifico de exeção
        //e é a variavel que representa a execção capturada, permitindo que informações sobre a exeção captura e a mensagem de erro
        {
            // Tratativa da excelçao caso ocorra tentativa de divisão por zero
            System.out.println("Erro: Divisão por zero não é permitida.");
        }

        scanner.close();
    }


    //Metodo para realizar a divisão de dois números inteiros
    public static int dividir(int dividendo, int divisor) {
        if (divisor == 0) {// Verifica se o dividor é zero, e caso a exceção seja igual a zero, lançara a exeção do try
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return dividendo / divisor;
    }
}


