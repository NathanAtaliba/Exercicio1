public class Conta {
    private int numConta;
    private String nomeConta;
    private int saldoConta = 3000;
    Cartao cartao;
    private int valorCompra;
    public static int numCartao;

    public Conta() {
        cartao = new Cartao();
        numCartao++;
    }

    public int getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(int saldoConta) {
        this.saldoConta = saldoConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public int getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(int valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void pagarComCartao() {
        if(valorCompra<=cartao.getLimite()){
            setSaldoConta( getSaldoConta() - valorCompra);
        }else setSaldoConta(getSaldoConta());
    }


    public void mostraInfo(){
        System.out.println("nome da conta: " + getNomeConta());
        System.out.println("numero de cartoes criados ao todo: " + numCartao );
        System.out.println("Valor da compra da " + getNomeConta() +":" +getSaldoConta() );

    }
}