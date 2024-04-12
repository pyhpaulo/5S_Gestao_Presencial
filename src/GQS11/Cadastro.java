package GQS11;

public class Cadastro {

    //Criação do vetor
    private Pessoa[] cadastro;
    private int tamanho;

    //Criação do metodo Cadastro
    //Cadastro ira armazenar as pessoas no int tamanho
    public Cadastro(int capacidade) {
        cadastro = new Pessoa[capacidade]; //
        tamanho = 0;
    }

    //Criação do metodo AdicionarPessoa
    public void adicionarPessoa(Pessoa pessoa) {
        if (tamanho < cadastro.length) {
            cadastro[tamanho++] = pessoa;
        } else {
            System.out.println("O cadastro está cheio. Não é possível adicionar mais pessoas.");
        }
    }

    //Metodo adicionar PessoaFisica

    public void adicionarPessoaFisica(PessoaFisica pessoaFisica) {
        adicionarPessoa(pessoaFisica);
    }

    //Metodo para adicionar pessoaJuridica
    public void adicionarPessoaJuridica(PessoaJuridica pessoaJuridica) {
        adicionarPessoa(pessoaJuridica);
    }

    //Criação do metodo para exibir  o Cadastro

    public void imprimirCadastro() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(cadastro[i]);
        }
    }

    //Criação do metodo para exibir PessoasFisicas cadastradas

    public void imprimirPessoasFisicas() {
        for (int i = 0; i < tamanho; i++) {
            if (cadastro[i] instanceof PessoaFisica) {
                System.out.println(cadastro[i]);
            }
        }
    }

    //Metodo para exibir PessoaJuridicas cadastrada

    public void imprimirPessoasJuridicas() {
        for (int i = 0; i < tamanho; i++) {
            if (cadastro[i] instanceof PessoaJuridica) {
                System.out.println(cadastro[i]);
            }
        }
    }

    // Metodo para pesquisar pessoas cadastradas

    public Pessoa buscarPessoa(String cpfOuCnpj) {
        for (int i = 0; i < tamanho; i++) {
            if (cadastro[i] instanceof PessoaFisica && ((PessoaFisica) cadastro[i]).getCPF().equals(cpfOuCnpj)) {
                return cadastro[i];
            } else if (cadastro[i] instanceof PessoaJuridica && ((PessoaJuridica) cadastro[i]).getCNPJ().equals(cpfOuCnpj)) {
                return cadastro[i];
            }
        }
        return null;
    }

    public void atualizarPessoa(String cpfOuCnpj, Pessoa pessoaAtualizada) {
        for (int i = 0; i < tamanho; i++) {
            if (cadastro[i] instanceof PessoaFisica && ((PessoaFisica) cadastro[i]).getCPF().equals(cpfOuCnpj)) {
                cadastro[i] = pessoaAtualizada;
                System.out.println("Pessoa atualizada com sucesso.");
                return;
            } else if (cadastro[i] instanceof PessoaJuridica && ((PessoaJuridica) cadastro[i]).getCNPJ().equals(cpfOuCnpj)) {
                cadastro[i] = pessoaAtualizada;
                System.out.println("Pessoa atualizada com sucesso.");
                return;
            }
        }
        System.out.println("Pessoa não encontrada.");
    }

    public void excluirPessoa(String cpfOuCnpj) {
        for (int i = 0; i < tamanho; i++) {
            if (cadastro[i] instanceof PessoaFisica && ((PessoaFisica) cadastro[i]).getCPF().equals(cpfOuCnpj)) {
                removerElemento(i);
                System.out.println("Pessoa removida com sucesso.");
                return;
            } else if (cadastro[i] instanceof PessoaJuridica && ((PessoaJuridica) cadastro[i]).getCNPJ().equals(cpfOuCnpj)) {
                removerElemento(i);
                System.out.println("Pessoa removida com sucesso.");
                return;
            }
        }
        System.out.println("Pessoa não encontrada.");
    }

    private void removerElemento(int indice) {
        for (int i = indice; i < tamanho - 1; i++) {
            cadastro[i] = cadastro[i + 1];
        }
        cadastro[--tamanho] = null;
    }

}
