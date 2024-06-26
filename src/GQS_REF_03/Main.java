package GQS_REF_03;

public class Main {
    public static void main(String[] args) {
        double[] vet1 = { 90, 88, 78, 76 };
        double[] vet2 = { 865, 564, 43, 12 };

        // Calcular e exibir a média do vetor 1
        double mediaVet1 = calcularMedia(vet1);
        System.out.println("Média do vetor 1: " + mediaVet1);

        // Calcular e exibir a média do vetor 2
        double mediaVet2 = calcularMedia(vet2);
        System.out.println("Média do vetor 2: " + mediaVet2);
    }

    // Método para calcular a média de um vetor, para poder ser reutilizável e de fácil entendimento
    private static double calcularMedia(double[] vetor) {
        double soma = 0;
        for (double valor : vetor) {
            soma += valor;
        }
        return soma / vetor.length;
    }
}

