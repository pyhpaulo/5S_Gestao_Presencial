package GQS_REF_05;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int opcao;
        String resp;
        boolean repetir;
        double lado01 = 0, lado02 = 0, lado03 = 0;

        do {
            // Lendo os lados do triângulo:
            lado01 = lerLado("Informe o primeiro lado:");
            lado02 = lerLado("Informe o segundo lado:");
            lado03 = lerLado("Informe o terceiro lado:");

            // Verificando o tipo de triângulo:
            if (lado01 == lado02 && lado02 == lado03)
                JOptionPane.showMessageDialog(null, "Triângulo equilátero.");
            else if (lado01 == lado02 || lado01 == lado03 || lado02 == lado03)
                JOptionPane.showMessageDialog(null, "Triângulo isósceles");
            else
                JOptionPane.showMessageDialog(null, "Triângulo escaleno.");

            // Perguntando se deseja continuar:
            opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
        } while (opcao == JOptionPane.YES_OPTION);
    }

    // Método para ler um lado do triângulo e garantir entrada válida:
    // Isola a lógica de leitura de cada lado do triângulo em um método específico. Isso melhora a legibilidade e a manutenção do código
    private static double lerLado(String mensagem) {
        String resp;
        boolean repetir;
        double lado = 0;

        do {
            resp = JOptionPane.showInputDialog(mensagem);
            if (resp == null) {
                System.err.println("Aviso: o botão \"cancelar\" foi pressionado para sair do programa.");
                System.exit(0);
            }
            try {
                lado = Double.parseDouble(resp);
                repetir = false;
            } catch (NumberFormatException e) {
                System.err.println("ERRO: número não identificado.");
                repetir = true;
            }
        } while (repetir);

        return lado;
    }
}



