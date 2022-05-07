import java.util.ArrayList;
import  java.util.Collections;
import java.util.Scanner;
import java.util.Random;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Entre com o nome dos zumbis : ");
    ArrayList<String> nomes = new ArrayList<>();
    for(int i=0;i<=5;i++){
      System.out.println("Entre com o " +(i+1) + " nome:");
      nomes.add(input.next());
    }
    ZumbiFraco zumbiFraco1 = new ZumbiFraco(nomes.get(0), new Random().nextDouble()*100);
    ZumbiFraco zumbiFraco2 = new ZumbiFraco(nomes.get(1),new Random().nextDouble()*100);
    ZumbiMedio zumbiMedio1 = new ZumbiMedio(nomes.get(2),new Random().nextDouble()*100);
    ZumbiMedio zumbiMedio2 = new ZumbiMedio(nomes.get(3),new Random().nextDouble()*100);
    ZumbiForte zumbiForte1 = new ZumbiForte(nomes.get(4),new Random().nextDouble()*100);
    ZumbiForte zumbiForte2 = new ZumbiForte(nomes.get(5),new Random().nextDouble()*100);

    ArrayList<Inimigo> inimigos = new ArrayList<>();
inimigos.add(zumbiFraco1);
inimigos.add(zumbiFraco2);
inimigos.add(zumbiMedio1);
inimigos.add(zumbiMedio2);
inimigos.add(zumbiForte1);
inimigos.add(zumbiForte2);
    System.out.println("Array desordenado:");
for (Inimigo inimigo: inimigos){
  System.out.println(inimigo.getNome() +" "+inimigo.getDano());
}
    System.out.println("///////////////////////");

Collections.sort(inimigos);
Collections.reverse(inimigos);
    System.out.println("Array ordenado em ordem decrescente: ");
for(Inimigo inimigo: inimigos){
  System.out.println(inimigo.getNome()+" "+inimigo.getDano());

}}}
