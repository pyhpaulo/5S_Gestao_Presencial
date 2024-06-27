package loja;

public class Produto {
    // Atributos privados da classe Produto
    private String nome;
    private double quantidade;
    private double preco;

    // Construtor da classe Produto
    public Produto(String nome, double quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Métodos getter e setter para o atributo nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos getter e setter para o atributo quantidade
    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    // Métodos getter e setter para o atributo preco
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
