package maisexercicios;

public class Cliente extends PessoaFisica {
    private String clientedesde;
    

    public Cliente() {
    }

    public String getClientedesde() {
        return clientedesde;
    }

    public void setclientedesde(String clientedesde) {
        this.clientedesde = clientedesde;
    }

  
    public void incluirNovoCliente(){
        System.out.println("Cliente sendo incluido");
    }
    public void atualizarCliente(){
        System.out.println("Cliente sendo atualizado.");
    }
    
}
