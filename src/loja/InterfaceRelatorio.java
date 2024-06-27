package loja;

import java.util.List;

public interface InterfaceRelatorio {
    double calcularTotal(List<Produto> produtos, boolean clienteVIP);
}
