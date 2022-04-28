public class Produto implements Comparable<Produto> {
    private String nome;
private int preco;
public Produto(String nome, int preco){
    this.preco = preco;
    this.nome = nome;

}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getPreco() {
        return preco;
    }

    public void mostraInfo(){
    System.out.println(nome);
    System.out.println(preco);

}
@Override
    public int compareTo(Produto p){
return nome.compareTo(p.nome);

}

}
