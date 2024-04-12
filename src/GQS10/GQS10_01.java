import java.util.Scanner;

// Declaração da classe Veiculo com os dados que vão constituir o método construtor da classe
class Veiculo {
    private String numeroChassi;
    private String placa;
    private String marca;
    private String modelo;
    private int ano;

    // Criação do método construtor da Classe veículo
    public Veiculo(String numeroChassi, String placa, String marca, String modelo, int ano) {
        this.numeroChassi = numeroChassi;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Declaração dos métodos - Getters e setters
    public String getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

// Classe principal
public class GQS10_01 {
    // Método para pesquisar veículo por chassi ou placa
    public static Veiculo pesquisarVeiculo(String chave, Veiculo[] cadastro) {
        for (Veiculo veiculo : cadastro) {
            if (veiculo != null && (veiculo.getNumeroChassi().equals(chave) || veiculo.getPlaca().equals(chave))) {
                return veiculo;
            }
        }
        return null; // Retorna null se o veículo não for encontrado
    }

    // Método para atualizar veículo por chassi ou placa
    public static void atualizarVeiculo(String chave, Veiculo[] cadastro) {
        Veiculo veiculo = pesquisarVeiculo(chave, cadastro);
        if (veiculo != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Veículo encontrado. Informe os novos dados:");
            System.out.print("Número do chassi: ");
            veiculo.setNumeroChassi(scanner.nextLine());
            System.out.print("Placa: ");
            veiculo.setPlaca(scanner.nextLine());
            System.out.print("Marca: ");
            veiculo.setMarca(scanner.nextLine());
            System.out.print("Modelo: ");
            veiculo.setModelo(scanner.nextLine());
            System.out.print("Ano: ");
            veiculo.setAno(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Veículo atualizado com sucesso.");
        } else {
            System.out.println("Veículo não encontrado.");
        }
    }

    // Método para excluir veículo por chassi ou placa
    public static void excluirVeiculo(String chave, Veiculo[] cadastro) {
        for (int i = 0; i < cadastro.length; i++) {
            if (cadastro[i] != null && (cadastro[i].getNumeroChassi().equals(chave) || cadastro[i].getPlaca().equals(chave))) {
                cadastro[i] = null;
                System.out.println("Veículo excluído com sucesso.");
                return;
            }
        }
        System.out.println("Veículo não encontrado.");
    }

    // Método para listar todos os veículos cadastrados
    public static void listarVeiculos(Veiculo[] cadastro) {
        System.out.println("\n===== Veículos Cadastrados =====");
        for (Veiculo veiculo : cadastro) {
            if (veiculo != null) {
                System.out.println("Chassi: " + veiculo.getNumeroChassi() + ", Placa: " + veiculo.getPlaca() +
                        ", Marca: " + veiculo.getMarca() + ", Modelo: " + veiculo.getModelo() + ", Ano: " + veiculo.getAno());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        //Inicialização do MENU de opções

        System.out.print("Quantos veículos deseja cadastrar? ");
        int tamanho = scanner.nextInt();
        scanner.nextLine();
        Veiculo[] cadastro = new Veiculo[tamanho];

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Cadastrar veículo");
            System.out.println("2. Atualizar veículo");
            System.out.println("3. Excluir veículo");
            System.out.println("4. Listar veículos cadastrados");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    // Recepção dos dados para cadastro de veículos
                    for (int i = 0; i < tamanho; i++) {
                        System.out.println("\nCadastro do veículo " + (i + 1));
                        System.out.print("Número do chassi: ");
                        String numeroChassi = scanner.nextLine();
                        System.out.print("Placa: ");
                        String placa = scanner.nextLine();
                        System.out.print("Marca: ");
                        String marca = scanner.nextLine();
                        System.out.print("Modelo: ");
                        String modelo = scanner.nextLine();
                        System.out.print("Ano: ");
                        int ano = scanner.nextInt();
                        scanner.nextLine();

                        cadastro[i] = new Veiculo(numeroChassi, placa, marca, modelo, ano);
                    }
                    break;
                case 2:
                    System.out.println("\nAtualizar veículo:");
                    System.out.print("Informe o número do chassi ou placa do veículo: ");
                    String chaveAtualizacao = scanner.nextLine();
                    atualizarVeiculo(chaveAtualizacao, cadastro);
                    break;
                case 3:
                    System.out.println("\nExcluir veículo:");
                    System.out.print("Informe o número do chassi ou placa do veículo: ");
                    String chaveExclusao = scanner.nextLine();
                    excluirVeiculo(chaveExclusao, cadastro);
                    break;
                case 4:
                    listarVeiculos(cadastro);
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        } while (opcao != 5);
    }//Fim da Void
}//Fim da Classe Main (GQS10_01)
