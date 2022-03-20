package br.inatel.org;
import br.inatel.org.inimigo.Asteroide;
import br.inatel.org.Jogador.Nave;
public class Main{
    public static void main(String[] args) {
    Asteroide asteoide1 = new Asteroide("Asteroide1","pequeno");
    Asteroide asteoide2 = new Asteroide("Asteroide2","grande");
    Nave nave1 = new Nave("nave1",200.0,"normal");
    Nave nave2 = new Nave("nave2",150.0,"Explosivo");
nave1.atirar(asteoide1);
nave1.atirar(asteoide2);
nave2.atirar(asteoide1);
nave2.atirar(asteoide2);


    }
}