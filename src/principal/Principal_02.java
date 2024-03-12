package principal;

import javax.swing.JOptionPane;

public class Principal_02 {

    public static void main(String args[]) {
        // Variáveis para armazenar os dados informados pelo usuário
        double nota;
        double salario;
        char sexo;
        int idade;

        // Loop para garantir que os dados sejam informados corretamente
        do {
            // Validação da Nota
            String notaString = JOptionPane.showInputDialog("Informe a nota (entre 0 e 10):");
            nota = Double.parseDouble(notaString);
        } while (nota < 0 || nota > 10);

        do {
            // Validação do Salário
            String salarioString = JOptionPane.showInputDialog("Informe o salário (maior que zero):");
            salario = Double.parseDouble(salarioString);
        } while (salario <= 0);

        do {
            // Validação do Sexo
            String sexoString = JOptionPane.showInputDialog("Informe o sexo (m ou f):");
            sexo = sexoString.charAt(0);
        } while (sexo != 'm' && sexo != 'f');

        do {
            // Validação da Idade
            String idadeString = JOptionPane.showInputDialog("Informe a idade (entre 0 e 150):");
            idade = Integer.parseInt(idadeString);
        } while (idade < 0 || idade > 150);

        // Exibição da mensagem de sucesso
        JOptionPane.showMessageDialog(null, "Dados informados com sucesso!");
    }
}

