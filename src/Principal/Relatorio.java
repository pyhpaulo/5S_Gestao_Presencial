package Principal;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Relatorio implements InterfaceRelatorio {
    public void gerarRelatorio(ArrayList<Produto> produtos, boolean clienteVIP) {
        // Calcula o somatório dos preços:
        double total = calcularTotal(produtos);

        // Aplica desconto:
        total = aplicarDesconto(total, clienteVIP);

        // Adiciona taxa de entrega:
        total = adicionarTaxaEntrega(total);

        // Exibir o total:
        System.out.println("Total: " + total);
    }

    private double calcularTotal(ArrayList<Produto> produtos) {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco() * produto.getQuantidade();
        }
        return total;
    }

    private double aplicarDesconto(double total, boolean clienteVIP) {
        if (clienteVIP) {
            return total * 0.90;
        } else {
            return total * 0.95;
        }
    }

    private double adicionarTaxaEntrega(double total) {
        DayOfWeek diaSemana = LocalDate.now().getDayOfWeek();
        if (diaSemana == DayOfWeek.SUNDAY) {
            return total + 10.00;
        } else {
            return total + 5.00;
        }
    }
}
