import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int qtdProdutos = 0;
        int valorProduto = 0;
        String nomeProduto;
        System.out.println("Entre com a quantidade de produtos desejada: ");
        qtdProdutos = input.nextInt();
        for(int i=0;i<qtdProdutos;i++){
            System.out.println("Entre com o nome do produto:");
            nomeProduto = input.next();
            System.out.println("Entre com o preço do produto:");
            valorProduto = input.nextInt();
        Produto produto = new Produto(nomeProduto,valorProduto);
        produtos.add(produto);
        }
//Para ordenar em ordem alfabetica, apenas utilizar Collections.sort(produtos);
        Collections.sort(produtos);

        for(Produto produto : produtos){
            System.out.println(produto.getNome());
            System.out.println(produto.getPreco());

    }}}


