package GQS06;
import javax.swing.JOptionPane; //Extensão que permite utiliza interfaces gráficas
public class GQS06_03 {
    public static void main(String[] args) {
        // Variáveis para armazenar a soma e a quantidade de idades
        int somaIdades = 0;
        int quantidadeIdades = 0;

        // Loop para obter idades até que o usuário deseje parar
        do {
            // Solicitar ao usuário uma idade
            int idade = obterIdade("Informe a idade (ou digite 0 para encerrar):");

            // Verificar se o usuário deseja encerrar
            if (idade == 0) {
                break;
            }

            // Atualizar a soma e a quantidade de idades
            somaIdades += idade;
            quantidadeIdades++;
        } while (true);

        // Calcular e exibir a média aritmética das idades
        double media = calcularMediaAritmetica(somaIdades, quantidadeIdades);
        JOptionPane.showMessageDialog(null, "A média das idades é: " + media);
    }//Fim da void

    // Método para obter uma idade da entrada do usuário
    private static int obterIdade(String mensagem) {
        int idade = 0;
        do {
            String input = JOptionPane.showInputDialog(mensagem);
            try {
                idade = Integer.parseInt(input);
                // Verifica se a idade é não negativa
                if (idade < 0) {

                    //Iniciando como Null - para a mensagem ser exibida no centro da tela ou na posição padrão do sistema.
                    JOptionPane.showMessageDialog(null, "Por favor, informe uma idade não negativa.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, informe uma idade válida.");
            }
        } while (idade < 0);
        return idade;
    }//Fim do metodo obterIdade

    // Método para calcular a média aritmética
    private static double calcularMediaAritmetica(int soma, int quantidade) {
        if (quantidade == 0) {
            return 0; // Evita a divisão por zero
        }
        return (double) soma / quantidade;
    }//Fim do metodo calcularMediaAritmetica

}//Fim da classe principal
