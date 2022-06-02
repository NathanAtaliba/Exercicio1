public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Nathan",1);
        Cliente c2 = null;
        Cliente c3 = new Cliente("Ian",3);
        Conta conta = new Conta(10000,1000);
        conta.addCliente(c1);
        conta.addCliente(c2);
        conta.addCliente(c3);
conta.mostraInfo();
conta.sacar(12000);
}
    }

