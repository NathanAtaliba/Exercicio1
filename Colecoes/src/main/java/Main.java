import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Produto p1 = new Produto("Manteiga" ,3);
        Produto p2 = new Produto("Margarina",4);
        Produto p3 = new Produto("Caderno",10);
        Produto p4 = new Produto("Lapis",1);
        Produto p5 = new Produto("Borracha",2);
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        produtos.add(p5);

       Collections.sort(produtos);
        for(Produto produto : produtos){
            int auxMaior;
            int auxMenor;
            System.out.println(produto.getNome());
            System.out.println(produto.getPreco());
            System.out.println("");
 auxMaior = produto.getPreco();
 auxMenor = produto.getPreco();
 if(auxMaior > produto.getPreco()){
     auxMaior = produto.getPreco();
 }else {
     auxMaior = auxMaior;
     }
 if(auxMenor> produto.getPreco()){
     auxMenor = auxMenor;
 }else {
     auxMenor = produto.getPreco();
 }
 }
        System.out.println("Produto de maior valor:");
        System.out.println("Produto de maior valor:");
    }}


