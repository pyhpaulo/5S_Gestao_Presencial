package GQS11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cadastro cadastro = new Cadastro(100); // Capacidade inicial do cadastro

    //Menu de interação
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Pessoa Física");
            System.out.println("2. Adicionar Pessoa Jurídica");
            System.out.println("3. Excluir Pessoa");
            System.out.println("4. Exibir Pessoas Físicas");
            System.out.println("5. Exibir Pessoas Jurídicas");
            System.out.println("6. Buscar Pessoa");
            System.out.println("7. Atualizar Pessoa");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    cadastrarPessoaFisica(scanner, cadastro);
                    break;
                case 2:
                    cadastrarPessoaJuridica(scanner, cadastro);
                    break;
                case 3:
                    excluirPessoa(scanner, cadastro);
                    break;
                case 4:
                    cadastro.imprimirPessoasFisicas();
                    break;
                case 5:
                    cadastro.imprimirPessoasJuridicas();
                    break;
                case 6:
                    buscarPessoa(scanner, cadastro);
                    break;
                case 7:
                    atualizarPessoa(scanner, cadastro);
                    break;
                case 8:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 8);

        scanner.close();
    }

    /**
     * Método para cadastrar uma pessoa física no cadastro.
     * Solicita ao usuário o nome e CPF da pessoa física, cria um objeto PessoaFisica com os dados fornecidos
     * e o adiciona ao cadastro.
     */

    private static void cadastrarPessoaFisica(Scanner scanner, Cadastro cadastro) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome(nome);
        pessoaFisica.setCPF(cpf);

        cadastro.adicionarPessoaFisica(pessoaFisica);
        System.out.println("Pessoa física cadastrada com sucesso!");
    }

    /**
     * Método para cadastrar uma pessoa jurídica no cadastro.
     * Solicita ao usuário o nome e CNPJ da pessoa jurídica, cria um objeto PessoaJuridica com os dados fornecidos
     * e o adiciona ao cadastro.
     */


    private static void cadastrarPessoaJuridica(Scanner scanner, Cadastro cadastro) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome(nome);
        pessoaJuridica.setCNPJ(cnpj);

        cadastro.adicionarPessoaJuridica(pessoaJuridica);
        System.out.println("Pessoa jurídica cadastrada com sucesso!");
    }

    /**
     * Método para excluir uma pessoa do cadastro.
     * Solicita ao usuário o CPF ou CNPJ da pessoa que deseja excluir e realiza a exclusão.
     */
    private static void excluirPessoa(Scanner scanner, Cadastro cadastro) {
        System.out.print("Digite o CPF ou CNPJ da pessoa que deseja excluir: ");
        String cpfOuCnpj = scanner.nextLine();
        cadastro.excluirPessoa(cpfOuCnpj);
    }

    /**
     * Método para buscar uma pessoa no cadastro.
     * Solicita ao usuário o CPF ou CNPJ da pessoa que deseja buscar e exibe a pessoa encontrada, se existir.
     */

    private static void buscarPessoa(Scanner scanner, Cadastro cadastro) {
        System.out.print("Digite o CPF ou CNPJ da pessoa que deseja buscar: ");
        String cpfOuCnpj = scanner.nextLine();
        Pessoa pessoa = cadastro.buscarPessoa(cpfOuCnpj);
        if (pessoa != null) {
            System.out.println("Pessoa encontrada: " + pessoa);
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }

    /**
     * Método para atualizar uma pessoa no cadastro.
     * Solicita ao usuário o CPF ou CNPJ da pessoa que deseja atualizar, busca a pessoa no cadastro,
     * solicita os novos dados e atualiza a pessoa no cadastro.
     */
    private static void atualizarPessoa(Scanner scanner, Cadastro cadastro) {
        System.out.print("Digite o CPF ou CNPJ da pessoa que deseja atualizar: ");
        String cpfOuCnpj = scanner.nextLine();
        Pessoa pessoa = cadastro.buscarPessoa(cpfOuCnpj);
        if (pessoa != null) {
            if (pessoa instanceof PessoaFisica) {
                cadastrarPessoaFisica(scanner, cadastro);
            } else if (pessoa instanceof PessoaJuridica) {
                cadastrarPessoaJuridica(scanner, cadastro);
            }
            cadastro.excluirPessoa(cpfOuCnpj);
        } else {
            System.out.println("Pessoa não encontrada.");
        }

    }//Fim da void
}//Fim da Classe

