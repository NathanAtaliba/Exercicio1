public class Comprador {
private String nome;
private double saldo;
public void efetuarCompra(Brownie bro){

    bro.addCarrinhoDeCompras();
    bro.calculaValorTotalCompra();
    System.out.println("Preco do produto: "+ bro.getPreco());
    System.out.println("Nome :"+bro.getNome());


}

}
