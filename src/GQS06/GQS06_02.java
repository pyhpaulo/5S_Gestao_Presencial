package GQS06;
import javax.swing.JOptionPane; //Extensão que permite utiliza interfaces gráficas
public class GQS06_02 {
    public static void main(String[] args) {
        // Solicitar ao usuário um número natural
        int numero = obterNumeroNatural("Informe um número natural para calcular o fatorial:");

        // Calcular e exibir o fatorial do número
        long fatorial = calcularFatorial(numero);
        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + fatorial);
    }//Fim da class  void

    // Método para obter um número natural da entrada do usuário
    // Neste solicitamos que o método retorne um número inteiro através do int, a partir da entrada do usuário em mensagem
    private static int obterNumeroNatural(String mensagem) {
        int numero = 0;
        do {
            String input = JOptionPane.showInputDialog(mensagem);
            try {
                numero = Integer.parseInt(input);
                // Verificação se o número é natural
                if (numero < 0) {
                    //Iniciando como Null - para a mensagem ser exibida no centro da tela ou na posição padrão do sistema.
                    JOptionPane.showMessageDialog(null, "Por favor, informe um número natural válido.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, informe um número válido.");
            }
        } while (numero < 0);
        return numero;
    }//Fim do metodo obterNumeroNatural

    // Método para calcular o fatorial de um número
    // Utilizado o long por conta do tamanho do numero em resultado fatorial. Que buscará numero na entrada do usuário
    private static long calcularFatorial(int numero) {
        if (numero == 0) {
            return 1; // Caso especial: 0! é sempre 1
        }

        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;

    }//Fim do método calcularFatorial
}//Fim da classe principal

