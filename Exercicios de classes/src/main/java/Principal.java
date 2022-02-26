import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner valorTeclado = new Scanner(System.in);
       Produto produto;
        produto = new Produto();
        produto.codigoSerie = 18;
        produto.codigoProduto = "WB18";
        produto.Nome = "Gilete";
        produto.categoria = "Outros";
        System.out.println("Entre com a quantidade de produtos: " );
        produto.quantidade = valorTeclado.nextInt();
        if(produto.quantidade>=3){
            System.out.println("Quantidade aceita,boa compra!");
            produto.mostraInfo();
            System.out.println("quantidade adquirida: " + produto.quantidade);
        }
        else{
            do {
                System.out.println("Entre com um novo valor, essa quantidade de produtos nao é permitida.");
                produto.quantidade = valorTeclado.nextInt();
            } while (produto.quantidade < 3);
            System.out.println("Quantidade aceita,boa compra!");
            produto.mostraInfo();
            System.out.println("quantidade adquirida: " + produto.quantidade);
        }
    }
}
