package Inatel.treino.br;

public class Seriado {
    private String nome;
    private String streaming;
    private int temporadas;
    private int anoCriacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public java.lang.String getStreaming() {
        return streaming;
    }

    public void setStreaming(java.lang.String streaming) {
        this.streaming = streaming;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {

        try {
this.temporadas = temporadas;
        }
        catch(Exception TemporadaException){
            System.out.println(TemporadaException);
        }
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }
}
