import java.util.Scanner;

//Declaração da Classe PessoaFisica e seus atributos
class PessoaFisica {
    private String nomePessoaFisica;
    private String CPF;

    //Criação do método contrutor da classe PessoaFisica

    public PessoaFisica(String nomePessoaFisica, String CPF) {
        this.nomePessoaFisica = nomePessoaFisica;
        this.CPF = CPF;
    }

    //Inicialização dos metodos get e set
    public String getNomePessoaFisica() {
        return nomePessoaFisica;
    }

    public String getCPF() {
        return CPF;
    }

    public void setNomePessoaFisica(String nomePessoaFisica) {
        this.nomePessoaFisica = nomePessoaFisica;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}//Fim da Classe PessoaFisica


    //Criação da classe PessoaJuridica
class PessoaJuridica {
    private String nomePessoaJuridica;
    private int CNPJ;

    //Inicialização do método construtor da classe

    public PessoaJuridica(String nomePessoaJuridica, int CNPJ) {
        this.nomePessoaJuridica = nomePessoaJuridica;
        this.CNPJ = CNPJ;
    }

    // Metodos get and Set
    public String getNomePessoaJuridica() {
        return nomePessoaJuridica;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setNomePessoaJuridica(String nomePessoaJuridica) {
        this.nomePessoaJuridica = nomePessoaJuridica;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }
}

//Classe principal

public class GQS10_02 {
    //Declaração da quantidade máxima de pessoas a poderem ser cadastradas
    private static final int MAX_PESSOAS = 100;

    //Inicialização dos vetores
    private static PessoaFisica[] pessoasFisicas = new PessoaFisica[MAX_PESSOAS];
    private static PessoaJuridica[] pessoasJuridicas = new PessoaJuridica[MAX_PESSOAS];
    private static int numPessoasFisicas = 0;
    private static int numPessoasJuridicas = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        //Laço para exibição do menu e metodos

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    cadastrarPessoaFisica();
                    break;
                case 2:
                    cadastrarPessoaJuridica();
                    break;
                case 3:
                    atualizarDados();
                    break;
                case 4:
                    excluirDados();
                    break;
                case 5:
                    exibirPessoasFisicas();
                    break;
                case 6:
                    exibirPessoasJuridicas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    //Exibição das opções do Menu
    private static void exibirMenu() {
        System.out.println("===== Menu de Opções =====");
        System.out.println("1. Cadastrar Pessoa Física");
        System.out.println("2. Cadastrar Pessoa Jurídica");
        System.out.println("3. Atualizar Dados");
        System.out.println("4. Excluir Dados");
        System.out.println("5. Exibir Pessoas Físicas Cadastradas");
        System.out.println("6. Exibir Pessoas Jurídicas Cadastradas");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    //Criação do método de cadastrarPessoas Fisicas
    private static void cadastrarPessoaFisica() {
        if (numPessoasFisicas < MAX_PESSOAS) {
            System.out.print("Digite o nome da pessoa física: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o CPF da pessoa física: ");
            String cpf = scanner.nextLine();
            pessoasFisicas[numPessoasFisicas++] = new PessoaFisica(nome, cpf);
            System.out.println("Pessoa física cadastrada com sucesso.");
        } else {
            System.out.println("Limite de pessoas físicas alcançado.");
        }
    }

    //Metodo para cadastrar pessoas juridicas
    private static void cadastrarPessoaJuridica() {
        if (numPessoasJuridicas < MAX_PESSOAS) {
            System.out.print("Digite o nome da pessoa jurídica: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o CNPJ da pessoa jurídica: ");
            int cnpj = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner
            pessoasJuridicas[numPessoasJuridicas++] = new PessoaJuridica(nome, cnpj);
            System.out.println("Pessoa jurídica cadastrada com sucesso.");
        } else {
            System.out.println("Limite de pessoas jurídicas alcançado.");
        }
    }

    //Metodo para atualização de dados
    private static void atualizarDados() {
        System.out.println("===== Atualizar Dados =====");
        System.out.println("1. Atualizar Pessoa Física");
        System.out.println("2. Atualizar Pessoa Jurídica");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        //Seleção de tipo de usuário a ser atuaalizado
        switch (opcao) {
            case 1:
                atualizarPessoaFisica();
                break;
            case 2:
                atualizarPessoaJuridica();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    //Metodo para Atualizar usuarios tipo PessoaFisica
    private static void atualizarPessoaFisica() {
        System.out.print("Digite o CPF da pessoa física que deseja atualizar: ");
        String cpf = scanner.nextLine();
        for (int i = 0; i < numPessoasFisicas; i++) {
            if (pessoasFisicas[i].getCPF().equals(cpf)) {
                System.out.print("Digite o novo nome da pessoa física: ");
                String novoNome = scanner.nextLine();
                pessoasFisicas[i].setNomePessoaFisica(novoNome);
                System.out.println("Dados da pessoa física atualizados com sucesso.");
                return;
            }
        }
        System.out.println("CPF não encontrado.");
    }

    //Metodo para Atualizar usuarios tipo PessoaJuridica
    private static void atualizarPessoaJuridica() {
        System.out.print("Digite o CNPJ da pessoa jurídica que deseja atualizar: ");
        int cnpj = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        for (int i = 0; i < numPessoasJuridicas; i++) {
            if (pessoasJuridicas[i].getCNPJ() == cnpj) {
                System.out.print("Digite o novo nome da pessoa jurídica: ");
                String novoNome = scanner.nextLine();
                pessoasJuridicas[i].setNomePessoaJuridica(novoNome);
                System.out.println("Dados da pessoa jurídica atualizados com sucesso.");
                return;
            }
        }
        System.out.println("CNPJ não encontrado.");
    }

        //Metodo de exclusão de dados
    private static void excluirDados() {
        System.out.println("===== Excluir Dados =====");
        System.out.println("1. Excluir Pessoa Física");
        System.out.println("2. Excluir Pessoa Jurídica");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        switch (opcao) {
            case 1:
                excluirPessoaFisica();
                break;
            case 2:
                excluirPessoaJuridica();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    //Metodo para Exclusão de pessoasFisicas
    private static void excluirPessoaFisica() {
        System.out.print("Digite o CPF da pessoa física que deseja excluir: ");
        String cpf = scanner.nextLine();
        for (int i = 0; i < numPessoasFisicas; i++) {
            if (pessoasFisicas[i].getCPF().equals(cpf)) {
                for (int j = i; j < numPessoasFisicas - 1; j++) {
                    pessoasFisicas[j] = pessoasFisicas[j + 1];
                }
                numPessoasFisicas--;
                System.out.println("Pessoa física excluída com sucesso.");
                return;
            }
        }
        System.out.println("CPF não encontrado.");
    }

    //Metodo para Exclusão de pessoasJuridicas
    private static void excluirPessoaJuridica() {
        System.out.print("Digite o CNPJ da pessoa jurídica que deseja excluir: ");
        int cnpj = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        for (int i = 0; i < numPessoasJuridicas; i++) {
            if (pessoasJuridicas[i].getCNPJ() == cnpj) {
                for (int j = i; j < numPessoasJuridicas - 1; j++) {
                    pessoasJuridicas[j] = pessoasJuridicas[j + 1];
                }
                numPessoasJuridicas--;
                System.out.println("Pessoa jurídica excluída com sucesso.");
                return;
            }
        }
        System.out.println("CNPJ não encontrado.");
    }

    //Metodo para exibir quantidade de usuários do tipo PessoaFisicas cadastrados
    private static void exibirPessoasFisicas() {
        if (numPessoasFisicas == 0) {
            System.out.println("Nenhuma pessoa física cadastrada.");
        } else {
            System.out.println("===== Pessoas Físicas Cadastradas =====");
            for (int i = 0; i < numPessoasFisicas; i++) {
                PessoaFisica pessoa = pessoasFisicas[i];
                System.out.println("Nome: " + pessoa.getNomePessoaFisica() + ", CPF: " + pessoa.getCPF());
            }
        }
    }

    //Metodo para exibir quantidade de usuários do tipo PessoaJuridica cadastrados
    private static void exibirPessoasJuridicas() {
        if (numPessoasJuridicas == 0) {
            System.out.println("Nenhuma pessoa jurídica cadastrada.");
        } else {
            System.out.println("===== Pessoas Jurídicas Cadastradas =====");
            for (int i = 0; i < numPessoasJuridicas; i++) {
                PessoaJuridica pessoa = pessoasJuridicas[i];
                System.out.println("Nome: " + pessoa.getNomePessoaJuridica() + ", CNPJ: " + pessoa.getCNPJ());
            }
        }
    }
}//Fim da Classe principal
