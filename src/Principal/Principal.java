package Principal;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        boolean clienteVIP = false;

        Produto p1 = new Produto("Arroz", 5, 18.75);
        Produto p2 = new Produto("Feijão", 1, 4.95);
        Produto p3 = new Produto("Leite", 1, 3.49);
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        InterfaceRelatorio relatorio = new Relatorio() {
            @Override
            public void gerarRelatorio(ArrayList<Produto> produtos, boolean clienteVIP) {

            }
        };
        relatorio.gerarRelatorio(produtos, clienteVIP);
    }
}
