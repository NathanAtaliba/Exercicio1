public class Main {
    public static void main(String[] args) {

        Comprador comprador = new Comprador();
   comprador.efetuarCompra(new BrownieNutella("Brownie de nutella",100,"Nutella"));
   comprador.efetuarCompra(new BrownieCafe("Brownie de cafe",300,"Cafe"));
        comprador.efetuarCompra(new BrownieDoceDeLeite("Brownie de dode de leite",200,"Doce de leite"));
    }
}
