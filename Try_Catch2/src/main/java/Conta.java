import java.util.HashSet;

public class Conta {
    private int saldo;
    private int limite;
    HashSet<Cliente> clientes = new HashSet<>();
public Conta(int saldo,int limite){
    this.saldo = saldo;
    this.limite = limite;
}
    public void mostraInfo(){
    for(Cliente cliente: clientes){
        try {
            System.out.println(cliente.getNome());
        }catch(NullPointerException e){
            System.out.println("Erro:"+ e);
        }
    }
    }

    public void addCliente(Cliente cliente){
    clientes.add(cliente);
    }

}
