package maisexercicios;

public class PessoaFisica {
    private String cpf;
    private String nome;
    private String telefone;
    private int data_nascimento;
    private int clientedesde;

    public PessoaFisica() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(int data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
     public int getclientedesde() {
        return clientedesde;
    }

    public void clientedesde(int clientedesde) {
        this.clientedesde = clientedesde;
    }
    
    public void validarCPF(){
        System.out.println("CPF validado...");
    }
}
