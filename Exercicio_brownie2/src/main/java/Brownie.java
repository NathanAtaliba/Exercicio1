public class Brownie {
   protected String nome;
   protected double preco;
   protected String sabor;
   Comprador comprador;
   public Brownie(String nome,double preco,String sabor){
       this.nome = nome;
       this.preco = preco;
       this.sabor = sabor;
   }

    public void addCarrinhoDeCompras(){

    }

    public void calculaValorTotalCompra(){

    }

    public void mostraInfo(){

    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
