package GQS_REF_07;

import javax.swing.JOptionPane;

public class NomeCompleto {

    public static void main(String[] args) {
        // Solicita e lê os nomes utilizando JOptionPane
        String primeiroNome = lerNome("Digite o primeiro nome:");
        String nomeMeio = lerNome("Digite o nome do meio:");
        String ultimoNome = lerNome("Digite o último nome:");

        // Formata o nome completo
        String nomeCompleto = formarNomeCompleto(primeiroNome, nomeMeio, ultimoNome);

        // Exibe o nome completo utilizando JOptionPane
        exibirMensagem(nomeCompleto);
    }

    // Método para ler o nome utilizando JOptionPane
    public static String lerNome(String mensagem) {
        return JOptionPane.showInputDialog(null, mensagem); // Utilização do JOptionPane para entrada de dados
    }

    // Método para formar o nome completo
    public static String formarNomeCompleto(String primeiroNome, String nomeMeio, String ultimoNome) {
        return primeiroNome + " " + nomeMeio + " " + ultimoNome; // Concatenação dos nomes para formar o nome completo
    }

    // Método para exibir mensagem utilizando JOptionPane
    public static void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem); // Utilização do JOptionPane para exibição de mensagem
    }
}
