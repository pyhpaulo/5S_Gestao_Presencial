package loja;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // Inicializa variável indicando se o cliente é VIP
        boolean clienteVIP = false;

        // Cria objetos Produto
        Produto p1 = new Produto("Arroz", 5, 18.75);
        Produto p2 = new Produto("Feijão", 1, 4.95);
        Produto p3 = new Produto("Leite", 1, 3.49);

        // Adiciona os produtos a uma lista
        List<Produto> produtos = new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        // Usa a classe Relatorio para calcular o total a pagar
        InterfaceRelatorio relatorio = new Relatorio();
        double total = relatorio.calcularTotal(produtos, clienteVIP);

        // Exibe o total
        System.out.println("Total a pagar: R$ " + total);
    }
}
