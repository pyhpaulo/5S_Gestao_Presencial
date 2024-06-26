package GQS_REF_04;

import javax.swing.JOptionPane;

public class Main {

    // Constantes para limites de nota e idade
    private static final double NOTA_MIN = 0;
    private static final double NOTA_MAX = 10;
    private static final int IDADE_MIN = 6;
    private static final int IDADE_MAX = 150;

    public static void main(String[] args) {
        // Métodos para ler cada informação individualmente
        double nota = lerNota();
        double salario = lerSalario();
        String sexo = lerSexo();
        int idade = lerIdade();

        // Exibição das informações lidas
        JOptionPane.showMessageDialog(null, "Nota informada: " + nota);
        JOptionPane.showMessageDialog(null, "Salário informado: " + salario);
        JOptionPane.showMessageDialog(null, "Sexo informado: " + sexo);
        JOptionPane.showMessageDialog(null, "Idade informada: " + idade);
    }

    // Método para ler a nota, com tratamento de exceções e validação
    private static double lerNota() {
        double nota = 0;
        boolean repetir;
        do {
            String resp = JOptionPane.showInputDialog("Informe a nota [0, 10]", 0);
            if (resp == null) {
                cancelarOperacao();
            }
            try {
                nota = Double.parseDouble(resp);
                repetir = nota < NOTA_MIN || nota > NOTA_MAX;
                if (repetir) {
                    System.err.println("ERRO: Nota fora da faixa permitida.");
                }
            } catch (NumberFormatException e) {
                System.err.println("ERRO: número não identificado.");
                repetir = true;
            }
        } while (repetir);
        return nota;
    }

    // Método para ler o salário, com tratamento de exceções e validação
    private static double lerSalario() {
        double salario = 0;
        boolean repetir;
        do {
            String resp = JOptionPane.showInputDialog("Informe o salário", 0);
            if (resp == null) {
                cancelarOperacao();
            }
            try {
                salario = Double.parseDouble(resp);
                repetir = salario <= 0;
                if (repetir) {
                    System.err.println("ERRO: Salário deve ser maior que zero.");
                }
            } catch (NumberFormatException e) {
                System.err.println("ERRO: número não identificado.");
                repetir = true;
            }
        } while (repetir);
        return salario;
    }

    // Método para ler o sexo, com tratamento de exceções e validação
    private static String lerSexo() {
        String sexo = "";
        boolean repetir;
        do {
            sexo = JOptionPane.showInputDialog("Informe o sexo");
            if (sexo == null) {
                cancelarOperacao();
            }
            repetir = !sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m");
            if (repetir) {
                System.err.println("ERRO: Sexo inválido.");
            }
        } while (repetir);
        return sexo;
    }

    // Método para ler a idade, com tratamento de exceções e validação
    private static int lerIdade() {
        int idade = 0;
        boolean repetir;
        do {
            String resp = JOptionPane.showInputDialog("Informe a idade", 6);
            if (resp == null) {
                cancelarOperacao();
            }
            try {
                idade = Integer.parseInt(resp);
                repetir = idade < IDADE_MIN || idade > IDADE_MAX;
                if (repetir) {
                    System.err.println("ERRO: Idade fora da faixa permitida.");
                }
            } catch (NumberFormatException e) {
                System.err.println("ERRO: número não identificado.");
                repetir = true;
            }
        } while (repetir);
        return idade;
    }

    // Método para tratar a operação cancelada
    private static void cancelarOperacao() {
        System.err.println("Aviso: o botão \"cancelar\" foi pressionado.");
        System.exit(1);
    }
}
