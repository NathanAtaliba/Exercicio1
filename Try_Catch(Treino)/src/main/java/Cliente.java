public class Cliente {
    private String nome;
    private int nConta;
public Cliente (String nome,int nConta){
    this.nome = nome;
    this.nConta= nConta;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }
}
