public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        conta1.setNomeConta("Conta 1");
        conta2.setNomeConta("Conta 2");
        conta1.setValorCompra(700);
        conta2.setValorCompra(10000);
        conta1.pagarComCartao();
        conta2.pagarComCartao();
        conta1.mostraInfo();
        conta2.mostraInfo();


    }
}
