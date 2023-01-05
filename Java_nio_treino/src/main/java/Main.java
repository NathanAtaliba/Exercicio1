import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
public class Main
{
    public static void main(String[] args)
    {
        float valorTotal = 0;
        int qtdProdutos;
        String nomeProduto;
        String descProduto;
        float valorProduto;
        Writer writer = null;
        DecimalFormat frmt = new DecimalFormat();
        frmt.setMaximumFractionDigits(2);
        Scanner input = new Scanner(System.in);
        List<Produto> produtosComida = new ArrayList<Produto>();
        List<Produto> produtosLimpeza = new ArrayList<Produto>();
        List<Produto> produtosOutros = new ArrayList<Produto>();
        System.out.println("Entre com a quantidade de produtos: ");
        qtdProdutos = input.nextInt();
        for(int i= 0 ;i<qtdProdutos;i++){
            input.nextLine();
            System.out.print("Entre com o nome do Produto: ");
            nomeProduto = input.nextLine();
            System.out.print("Entre com o valor do produto: ");
            valorProduto = input.nextFloat();
            valorTotal = valorTotal + valorProduto;
            do{
                System.out.print("Entre com a descricao do produto: ");
                descProduto = input.next();
                if(descProduto.equals("comida")){
                    Produto produto = new Produto(nomeProduto,descProduto,valorProduto);
                    produtosComida.add(produto);
                }else if(descProduto.equals("limpeza")){
                    Produto produto = new Produto(nomeProduto,descProduto,valorProduto);
                    produtosLimpeza.add(produto);
                }else if(descProduto.equals("outros")){
                    Produto produto = new Produto(nomeProduto,descProduto,valorProduto);
                    produtosOutros.add(produto);
                }else{
                    System.out.println("DESCRICÃO NÃO EXISTE!");
                }
            }while(!((descProduto.equals("comida")) || (descProduto.equals("limpeza")) || (descProduto.equals("outros"))));
        }
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("filename.txt"), "utf-8"));
            writer.write("COMIDA: "+"\n");
            for (Produto produto: produtosComida){
                writer.write(produto.json());
            }
            writer.write("--------------------------------------------------------------------------------"+"\n");
            writer.write("LIMPEZA: "+"\n");
            for (Produto produto: produtosLimpeza){
                writer.write(produto.json());
            }
            writer.write("--------------------------------------------------------------------------------"+"\n");
            writer.write("OUTROS: "+"\n");
            for (Produto produto: produtosOutros){
                writer.write(produto.json());
            }
            writer.write("--------------------------------------------------------------------------------"+"\n");
            writer.write("Valor total da compra: R$"+ String.valueOf(frmt.format(valorTotal)));
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            try {writer.close();} catch (Exception ex) {
            }
        }
    }
}