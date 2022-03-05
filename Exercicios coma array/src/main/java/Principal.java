public class Principal {
    public static void main(String[] args) {
        Conta[] novaConta = new Conta[2];
        Conta conta = new Conta();
        novaConta[0] = conta;
        novaConta[1] = conta;
        novaConta[0].mostraInfo();
        novaConta[1].nome ="Julia";
                novaConta[1].saldo=10;
        novaConta[1].mostraInfo();


    }
}
