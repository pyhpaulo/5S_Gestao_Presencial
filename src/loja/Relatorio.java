package loja;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class Relatorio implements InterfaceRelatorio {

    @Override
    public double calcularTotal(List<Produto> produtos, boolean clienteVIP) {
        double total = 0.0;

        // Calcula o somatório dos preços dos produtos
        for (Produto produto : produtos) {
            total += produto.getPreco() * produto.getQuantidade();
        }

        // Aplica desconto baseado no status do cliente
        if (clienteVIP) {
            total *= 0.90; // Desconto de 10% para clientes VIP
        } else {
            total *= 0.95; // Desconto de 5% para clientes não VIP
        }

        // Adiciona taxa de entrega baseada no dia da semana
        DayOfWeek diaSemana = LocalDate.now().getDayOfWeek();
        if (diaSemana == DayOfWeek.SUNDAY) {
            total += 10.00; // Taxa de entrega mais alta no domingo
        } else {
            total += 5.00; // Taxa de entrega padrão
        }

        return total;
    }
}
