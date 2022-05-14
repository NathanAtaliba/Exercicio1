package Inatel.treino.br;
import Inatel.treino.br.Seriado;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Arquivo arquivo = new Arquivo();
Seriado s1 = new Seriado();
s1.setNome("The walking Dead1");
s1.setAnoCriacao(2000);
s1.setStreaming("nenhum");
s1.setTemporadas(5);
Seriado s2 = new Seriado();
        s2.setNome("The walking Dead2");
        s2.setAnoCriacao(2000);
        s2.setStreaming("nenhum");
        s2.setTemporadas(6);
Seriado s3 = new Seriado();
        s3.setNome("The walking Dead3");
        s3.setAnoCriacao(2000);
        s3.setStreaming("nenhum");
        s3.setTemporadas(7);
Seriado s4 = new Seriado();
        s4.setNome("The walking Dead4");
        s4.setAnoCriacao(2000);
        s4.setStreaming("nenhum");
        s4.setTemporadas(8);
        arquivo.escrever(s1);
        arquivo.escrever(s2);
        arquivo.escrever(s3);
        arquivo.escrever(s4);


    }
}
