package principal;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String args[]) {
        int quantidadeContas;

        // Solicita ao usuário a quantidade de contas que deseja calcular o dígito verificador.
        String qtdContasString = JOptionPane.showInputDialog("Informe a quantidade de contas correntes:");
        quantidadeContas = Integer.parseInt(qtdContasString);

        for (int i = 0; i < quantidadeContas; i++) {
            // Solicita ao usuário o número da conta corrente (sempre com 3 dígitos).
            String numeroContaString = JOptionPane.showInputDialog("Informe o número da conta corrente (3 dígitos):");
            int numeroConta = Integer.parseInt(numeroContaString);

            // Calcula o dígito verificador com base nas instruções fornecidas.
            int digitoVerificador = calcularDigitoVerificador(numeroConta);

            // Exibe o número da conta e seu dígito verificador.
            JOptionPane.showMessageDialog(null, "Número da Conta: " + numeroConta + "\nDígito Verificador: " + digitoVerificador);
        }
    }

    // Método para calcular o dígito verificador de uma conta corrente.
    private static int calcularDigitoVerificador(int numeroConta) {
        // Calcula a soma do número da conta com seu inverso.
        int soma = numeroConta + inverterNumero(numeroConta);

        // Multiplica cada dígito da soma pela sua posição e soma os resultados.
        int somaMultiplicada = 0;
        int posicao = 0;
        while (soma > 0) {
            int digito = soma % 10;
            somaMultiplicada += digito * posicao;
            soma /= 10;
            posicao++;
        }

        // O dígito verificador é o último dígito da soma multiplicada.
        return somaMultiplicada % 10;
    }

    // Método para inverter os dígitos de um número.
    private static int inverterNumero(int numero) {
        int inverso = 0;
        while (numero > 0) {
            inverso = inverso * 10 + numero % 10;
            numero /= 10;
        }
        return inverso;
    }
}
