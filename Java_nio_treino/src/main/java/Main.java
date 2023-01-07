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
        int compra = 0;
        String nomeProduto;
        String descProduto;
        float valorProduto = 0;
        int quantProduto = 0;
        int produtosTotais = 0;
        Writer writer = null;
        DecimalFormat frmt = new DecimalFormat();
        frmt.setMaximumFractionDigits(2);
        Scanner input = new Scanner(System.in);
        List<Produto> produtosComida = new ArrayList<Produto>();
        List<Produto> produtosLimpeza = new ArrayList<Produto>();
        List<Produto> produtosOutros = new ArrayList<Produto>();
        do{
        System.out.println("Quer adicionar produtos? ");
        System.out.println("1 - Sim");
        System.out.println("2 - Nao");
        System.out.print("Escolha: ");
        compra = input.nextInt();
        if(compra == 1) {
            do {
                input.nextLine();
                System.out.print("Entre com o nome do Produto: ");
                nomeProduto = input.next();
                input.nextLine();
                System.out.print("Entre com o valor do produto: ");
                valorProduto = input.nextFloat();
                System.out.print("Entre com a descricao do produto: ");
                descProduto = input.next();
                if (descProduto.equals("comida")) {
                    System.out.print("Entre com a quantidade desse produto: ");
                    quantProduto = input.nextInt();
                    produtosTotais = produtosTotais + quantProduto;
                    for (int z = 0; z < quantProduto; z++) {
                        Produto produto = new Produto(nomeProduto, descProduto, valorProduto, quantProduto);
                        valorTotal = valorTotal + valorProduto;
                        produtosComida.add(produto);
                    }
                } else if (descProduto.equals("limpeza")) {
                    System.out.print("Entre com a quantidade desse produto: ");
                    quantProduto = input.nextInt();
                    produtosTotais = produtosTotais + quantProduto;
                    for (int z = 0; z < quantProduto; z++) {
                        Produto produto = new Produto(nomeProduto, descProduto, valorProduto, quantProduto);
                        valorTotal = valorTotal + valorProduto;
                        produtosLimpeza.add(produto);
                    }
                } else if (descProduto.equals("outros")) {
                    System.out.print("Entre com a quantidade desse produto: ");
                    quantProduto = input.nextInt();
                    produtosTotais = produtosTotais + quantProduto;
                    for (int z = 0; z < quantProduto; z++) {
                        Produto produto = new Produto(nomeProduto, descProduto, valorProduto, quantProduto);
                        valorTotal = valorTotal + valorProduto;
                        produtosOutros.add(produto);
                    }
                } else {
                    System.out.println("DESCRICÃO NÃO EXISTE!");
                }
            } while (!((descProduto.equals("comida")) || (descProduto.equals("limpeza")) || (descProduto.equals("outros"))));
        }
        else{
            System.out.println("BOA COMPRA!");
        }
        }while(!(compra == 2));
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