package GQS11;


//Declaração da classe Pessoa Fisica e atributos, juntamente da extensão da Classe PessoaFisica com a classe Pessoa
public class PessoaFisica extends Pessoa {
    private String CPF;

    //Declaração dos métodos get/set que estarão extendendo junto da classe Pessoa, agora possuindo  Nome e CPF
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String toString() {
        return "Pessoa Física - Nome: " + getNome() + ", CPF: " + CPF;
    }
}
