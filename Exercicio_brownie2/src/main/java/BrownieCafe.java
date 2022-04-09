public class BrownieCafe extends Brownie{
    BrownieCafe(String nome,double preco, String sabor) {
        super(nome, preco, sabor);
    }
    public void adicionaCafe(){}
    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie de cafe");

    }
}
