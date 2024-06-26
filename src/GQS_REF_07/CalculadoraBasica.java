package GQS_REF_07;

import javax.swing.JOptionPane;

public class CalculadoraBasica {

    public static void main(String[] args) {
        // Leitura dos números inteiros
        int numero1 = lerNumeroInteiro("Digite o primeiro número inteiro:");
        int numero2 = lerNumeroInteiro("Digite o segundo número inteiro:");

        // Exibição do menu e obtenção da operação desejada
        int escolha = exibirMenu();

        // Realiza a operação escolhida e exibe o resultado
        switch (escolha) {
            case 1:
                exibirResultado("Resultado da soma: " + (numero1 + numero2));
                break;
            case 2:
                exibirResultado("Resultado da subtração: " + (numero1 - numero2));
                break;
            case 3:
                exibirResultado("Resultado da multiplicação: " + (numero1 * numero2));
                break;
            case 4:
                if (numero2 != 0) {
                    exibirResultado("Resultado da divisão: " + ((double) numero1 / numero2));
                } else {
                    exibirMensagemErro("Erro: divisão por zero.");
                }
                break;
            default:
                exibirMensagemErro("Opção inválida.");
                break;
        }
    }

    // Método para ler número inteiro utilizando JOptionPane
    public static int lerNumeroInteiro(String mensagem) {
        String input = JOptionPane.showInputDialog(null, mensagem);
        return Integer.parseInt(input);
    }

    // Método para exibir menu e obter a escolha do usuário
    public static int exibirMenu() {
        String[] opcoes = {"1 - Somar", "2 - Subtrair", "3 - Multiplicar", "4 - Dividir"};
        String input = (String) JOptionPane.showInputDialog(null, "Escolha uma operação:", "Menu",
                JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

        // Convertendo a escolha do usuário para um número inteiro
        int escolha = 0;
        if (input != null) {
            escolha = Integer.parseInt(input.substring(0, 1));
        }
        return escolha;
    }

    // Método para exibir resultado utilizando JOptionPane
    public static void exibirResultado(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    // Método para exibir mensagem de erro utilizando JOptionPane
    public static void exibirMensagemErro(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}

