public class BrownieNutella extends  Brownie{
    BrownieNutella(String nome,double preco, String sabor){
        super(nome, preco, sabor);
        }
    public void adicionaNutella(){
        System.out.println("adicionando nutella");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie de Nutella");

    }

}
