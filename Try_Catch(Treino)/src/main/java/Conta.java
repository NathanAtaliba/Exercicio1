import java.util.Set;
import java.util.HashSet;

public class Conta {
    private double saldo;
    private double limite;

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    Set<Cliente> clientes = new HashSet<>();

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void mostraInfo() {
        System.out.println("saldo: " + saldo);
        System.out.println("limite: " + limite);

        for (Cliente clienteaux : clientes) {
            try {
                System.out.println("Nome: " + clienteaux.getNome());
                System.out.println("nConta: " + clienteaux.getnConta());
            } catch (NullPointerException e) {
                System.out.println("Erro:" + e);
            }
        }
    }

    public void sacar(int valor) {
        try{
        if (valor <= saldo) {
                saldo += -valor;
                System.out.println("saldo: " + saldo);
            }
        else{
                throw new SaldoException("nao");
            }}catch (SaldoException e){
            System.out.println("Saldo Insuficiente");
        }

    }
}

