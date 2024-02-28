import java.util.Scanner;
public class Atv02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitação ao usuário entrada de dados em  Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        // Chama o método para converter Celsius para Fahrenheit
        double temperaturaFahrenheit = converterParaFahrenheit(temperaturaCelsius);

        // Exibe o resultado
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);


    }

    //Criação de métodos para converter temperatura de Celsius para Fahrenheit
    private static double converterParaFahrenheit(double temperaturaCelsius) {
        // Fórmula de conversão
        return (temperaturaCelsius * 1.8) + 32;


    }//Fim da Static void
}//Fim da Class
