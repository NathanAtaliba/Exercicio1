public class Cliente {
    private String nome;
    private int numConta;

    public Cliente(String nome,int numConta){
        this.nome = nome;
        this.numConta = numConta;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
}
