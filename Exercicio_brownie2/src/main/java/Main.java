public class Main {
    public static void main(String[] args) {
        Brownie browNutella = new BrownieNutella("qualquer",100,"Nutella");
        Brownie browCafe = new BrownieCafe("qual",300,"Cafe");
        Brownie browDoceDeLeite = new BrownieDoceDeLeite("qualq",200,"Nutella");
    browCafe.comprador.efetuarCompra(browCafe);
        browNutella.comprador.efetuarCompra( browNutella);
        browDoceDeLeite.comprador.efetuarCompra(browDoceDeLeite);
    }
}
