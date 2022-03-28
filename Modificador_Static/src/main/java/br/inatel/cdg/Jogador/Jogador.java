package br.inatel.cdg.Jogador;

import br.inatel.cdg.Blocos.Blocos;

public class Jogador {
    private static double pontuacao;
    Blocos bloco;

public static void destruirBloco(Blocos bloco){
Blocos.blocoDestruido();
pontuacao--;
    System.out.println("Pontuacao do jogador"+pontuacao);
}
}
