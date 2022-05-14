import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(100,100);
        Cliente cliente1 = new Cliente("Nathan",1);
        Cliente cliente2 = new Cliente("Renan",2);
        Cliente cliente3 = null;
        conta.addCliente(cliente1);
        conta.addCliente(cliente2);
        conta.addCliente(cliente3);
        conta.mostraInfo();

    }
}
