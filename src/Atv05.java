import java.util.Scanner;

public class Atv05 {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitação do valor do raio da esfera
        System.out.print("Digite o valor do raio da esfera: ");
        double raio = scanner.nextDouble();


        // Calcula o comprimento da esfera
        double comprimento = 2 * Math.PI * raio;

        // Calcula a área da esfera
        double area = Math.PI * Math.pow(raio, 2);

        // Calcula o volume da esfera
        double volume = (3.0 / 4.0) * Math.PI * Math.pow(raio, 3);

        // Impressão dos resultados
        System.out.println(" A - O comprimento da esfera é: " + String.format("%.2f", comprimento));
        System.out.println(" B - A área da esfera é: " + String.format("%.2f", area));
        System.out.println(" C - O volume da esfera é: " + String.format("%.2f", volume));

    }//Fim da Static
}//Fim da class
