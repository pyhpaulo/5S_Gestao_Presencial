package GQS_REF_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Definição da classe Produto
class Produto {
    private int codigo;
    private String nome;
    private String tipo;
    private double valor;
    private double desconto;

    // Construtor
    public Produto(int codigo, String nome, String tipo, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
        this.desconto = 0.0; // inicialmente sem desconto
    }

    // Método para calcular desconto
    public void aplicarDesconto() {
        switch (tipo.toLowerCase()) {
            case "roupas":
                desconto = valor * 0.05;
                break;
            case "calçados":
                desconto = valor * 0.04;
                break;
            case "casa":
                desconto = valor * 0.03;
                break;
            default:
                desconto = 0.0;
        }
    }

    // Método para calcular preço com desconto
    public double calcularPrecoComDesconto() {
        return valor - desconto;
    }

    // Método para exibir informações do produto
    public void exibirProduto() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor: R$" + valor);
        System.out.println("Desconto aplicado: R$" + desconto);
        System.out.println("Preço com desconto: R$" + calcularPrecoComDesconto());
        System.out.println("-----------------------------");
    }
}

// Classe principal que realiza o cadastro de produtos
public class CadastroProdutos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        while (true) {
            System.out.println("Digite o código do produto (ou digite 0 para sair): ");
            int codigo = scanner.nextInt();
            if (codigo == 0) {
                break;
            }

            scanner.nextLine(); // limpar o buffer do scanner

            System.out.println("Digite o nome do produto: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o tipo do produto (roupas, calçados ou casa): ");
            String tipo = scanner.nextLine();

            System.out.println("Digite o valor do produto: ");
            double valor = scanner.nextDouble();

            // Criando um novo produto com os dados fornecidos
            Produto produto = new Produto(codigo, nome, tipo, valor);

            // Aplicar desconto baseado no tipo de produto
            produto.aplicarDesconto();

            // Adicionar produto à lista
            produtos.add(produto);
        }

        // Exibir total de produtos vendidos sem desconto
        System.out.println("\nTotal de produtos vendidos (sem desconto): " + produtos.size());

        // Exibir total de produtos vendidos com desconto e detalhes de cada produto
        System.out.println("\nDetalhes dos produtos vendidos com desconto:");
        double totalComDesconto = 0.0;
        for (Produto p : produtos) {
            p.exibirProduto();
            totalComDesconto += p.calcularPrecoComDesconto();
        }
        System.out.println("Total de vendas com desconto: R$" + totalComDesconto);

        scanner.close();
    }
}
