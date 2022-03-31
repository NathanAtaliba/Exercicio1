public class Cartao {

    private String tipo;
    private int numCartao;
    private int limite = 1000;
    public Cartao(String tipo,int numCartao){
        this.numCartao= numCartao;
        this.tipo = tipo;

    }
    public Cartao(){

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(int numCartao) {
        this.numCartao = numCartao;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
}
