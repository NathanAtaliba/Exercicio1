public class BrownieNutella extends  Brownie{
    BrownieNutella(String nome,double preco, String sabor){
        super(nome, preco, sabor);
        }
    public void adicionaNutella(){}


    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie de Nutella");

    }

}
