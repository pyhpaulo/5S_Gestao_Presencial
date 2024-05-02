package GQS12_02;

public class Divisao {
    public static int dividir(int dividendo, int divisor) throws ArithmeticException {
        if (dividendo == 0) { // Verifica se o dividendo é igual a zero
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        if (divisor < 10) { // Verifica se o divisor é menor que 10
            throw new ArithmeticException("Divisor menor que 10 não é permitido.");
        }
        return dividendo / divisor; // Retorna o resultado da divisão se todas as condições forem atendidas
    }
}

