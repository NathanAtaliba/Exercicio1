package br.inatel.org;
import br.inatel.org.Jogador.Nave;
import br.inatel.org.inimigo.Asteroide;


public class Main{
    public static void main(String[] args) {
        Asteroide asteroide1 = new Asteroide("Asteroide 1", "pequeno");
        Asteroide asteroide2 = new Asteroide("Asteroide 2", "Grande");

        Nave nave1 = new Nave("nave1", 120.0, "Normal");
        Nave nave2 = new Nave("nave2", 250.0, "Explosivo");

nave1.Atirar(asteroide1);
    nave1.Atirar(asteroide2);
    nave2.Atirar(asteroide1);
        nave2.Atirar(asteroide2);

    }}

