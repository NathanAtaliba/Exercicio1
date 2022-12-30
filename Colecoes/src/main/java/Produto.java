import static java.lang.CharSequence.compare;

public class Produto implements Comparable<Produto> {
    private String nome;
private int preco;
//Integer preco2 =
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
// ORDENAR POR ORDEM ALFABETICA
//    @Override
//    public int compareTo(Produto p){
//        return (compare(this.nome.toString(), p.nome.toString()));
//    }
//ORDERNAR POR NUMERO
    @Override
    public int compareTo(Produto p) {
        return (Integer.compare(this.preco, p.preco));
    }
}


