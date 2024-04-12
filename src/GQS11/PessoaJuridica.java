package GQS11;

//Declaração da classe Pessoa PessoaJuridica + extend para Pessoa, assim cincluindo os atributos da classe na Principal Class Pessoa
public class PessoaJuridica extends Pessoa {
    private String CNPJ;

    //Declaração dos metodos get and set


    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String toString() {
        return "Pessoa Jurídica - Nome: " + getNome() + ", CNPJ: " + CNPJ;
    }
}
