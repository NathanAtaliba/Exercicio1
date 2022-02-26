import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner valorTeclado = new Scanner(System.in);
       Produto produto =  new Produto();
        Produto produto1 = new Produto();


        produto.codigoSerie = 17;
        produto.codigoProduto = "WB17";
        produto.Nome = "Gilete";
        produto.categoria = "Outros";
        System.out.println("Entre com a quantidade do produto gilete: " );
        produto.quantidade = valorTeclado.nextInt();

        produto1.codigoSerie = 18;
        produto1.codigoProduto = "WB18";
        produto1.Nome = "Manteiga";
        produto1.categoria = "Comida";
        System.out.println("Entre com a quantidade do produto manteiga: " );
        produto1.quantidade = valorTeclado.nextInt();



        if(produto.quantidade>=3 && produto1.quantidade>=1){
            System.out.println("Quantidade aceita,boa compra!");
            produto.mostraInfo();
            System.out.println("quantidade adquirida: " + produto.quantidade);
            produto1.mostraInfo();
            System.out.println("quantidade adquirida: " + produto1.quantidade);
        }
        else{
            do {
                System.out.println("Entre com um novo valor, essa quantidade de produtos nao é permitida.");
                System.out.println("Entre com a quantidade do produto gilete: " );
                produto.quantidade = valorTeclado.nextInt();
                System.out.println("Entre com a quantidade do produto manteiga: " );
                produto1.quantidade = valorTeclado.nextInt();

            } while (produto.quantidade < 3 || produto1.quantidade <1);
            System.out.println("Quantidade aceita,boa compra!");
            produto.mostraInfo();
            System.out.println("quantidade adquirida: " + produto.quantidade);
            produto1.mostraInfo();
            System.out.println("quantidade adquirida: " + produto1.quantidade);
        }
    }
}
