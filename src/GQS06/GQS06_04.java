package GQS06;
import javax.swing.JOptionPane; //Extensão que permite utiliza interfaces gráficas
public class GQS06_04 {


        public static void main(String[] args) {
            // Variáveis para armazenar o maior e o menor número
            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;

            // Loop para obter números até que o usuário deseje parar
            do {
                // Solicitar ao usuário um número
                int numero = obterNumero("Informe um número inteiro (ou digite 0 para encerrar):");

                // Verificar se o usuário deseja encerrar
                if (numero == 0) {
                    break;
                }

                // Atualizar o maior e o menor número
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            } while (true);

            // Exibir o maior e o menor número
            JOptionPane.showMessageDialog(null, "Maior número: " + maior + "\nMenor número: " + menor);
        }//Fim da void

        // Método para obter um número inteiro da entrada do usuário
        private static int obterNumero(String mensagem) {
            int numero = 0;
            boolean numeroValido = false;
            do {
                String input = JOptionPane.showInputDialog(mensagem);
                try {
                    numero = Integer.parseInt(input);
                    numeroValido = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, informe um número inteiro válido.");
                }
            } while (!numeroValido);
            return numero;
        }//Fim do Metodo obterNumero

}//Fim da classe principal
