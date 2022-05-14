import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int numValores = 100000;
        long tempoInicial, tempoFinal;
        List<Integer> ListaInteiro = new ArrayList<>();
        HashSet<Integer> ConjuntoInteiro = new HashSet<>();
        HashMap<Integer,Integer> mapaInteiro = new HashMap<>();

        //Inserindo na List (ArrayList)
        tempoInicial = System.currentTimeMillis();
        for (int i=0;i<numValores; i++){
            ListaInteiro.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para inserir na lista: "+ (tempoFinal - tempoInicial));

    }
}
