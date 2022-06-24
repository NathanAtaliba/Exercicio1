import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
    List<Classe> lista = new ArrayList<>();

    Classe c1 = new Classef1("H",1);
    Classe c2 = new Classef1("A",10);
    Classe c3 = new Classef1("M",6);
    Classe c4 = new Classef1("B",9);
    Classe c5 = new Classef1("O",3);
    Classe c6 = new Classef1("P",2);
lista.add(c1);
lista.add(c2);
lista.add(c3);
lista.add(c4);
lista.add(c5);
lista.add(c6);
        Collections.sort(lista);
for(Classe clas: lista){
    System.out.println(clas.getNum());
}
    }}