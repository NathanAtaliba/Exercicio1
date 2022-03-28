package br.inatel.cdg.Blocos;
import br.inatel.cdg.Jogador.Jogador;
public class Blocos {
    private static int numBlocos;

public Blocos(){
    numBlocos++;
}

    public static int getNumBlocos() {
        return numBlocos;
    }
public static void  blocoDestruido(){
    System.out.println("O bloco esta sendo destruido! "+" numero de blocos: "+getNumBlocos());

    }

}

