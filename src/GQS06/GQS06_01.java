package GQS06;

import javax.swing.JOptionPane; //Extensão que permite utiliza interfaces gráficas

public class GQS06_01 {

    public static void main(String[] args) {
        // Solicitar ao usuário os dois números inteiros positivos
        int numero1 = obterNumeroInteiro("Informe o primeiro número inteiro positivo:");
        int numero2 = obterNumeroInteiro("Informe o segundo número inteiro positivo:");

        // Calcular e exibir a soma dos números ímpares entre os dois limites
        int somaImpares = calcularSomaImpares(numero1, numero2);
        JOptionPane.showMessageDialog(null, "A soma dos números ímpares entre " + numero1 + " e " + numero2 + " é: " + somaImpares);
    }// Fim do Void

    // Método para obter um número inteiro positivo da entrada do usuário
    private static int obterNumeroInteiro(String mensagem) {
        int numero = 0;
        do {
            String input = JOptionPane.showInputDialog(mensagem);
            try {
                numero = Integer.parseInt(input);
                // Verifica se o número é positivo
                if (numero <= 0) {
                    JOptionPane.showMessageDialog(null, "Por favor, informe um número inteiro positivo.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, informe um número inteiro válido.");
            }
        } while (numero <= 0);
        return numero;
    }//Fim do Metodo para obter numero inteiro positivo

    // Método para calcular a soma dos números ímpares entre dois limites
    private static int calcularSomaImpares(int limiteInferior, int limiteSuperior) {
        int soma = 0;
        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            if (i % 2 != 0) { // Verifica se o número é ímpar
                soma += i;
            }
        }
        return soma;
    }//Fim do Metodo para calcular soma dos impares
}//Fim da Classe
