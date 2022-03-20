package br.inatel.org.inimigo;

public class Asteroide {

private String nome;
private String tipoAsteroide;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAsteroide() {
        return tipoAsteroide;
    }

    public void setTipoAsteroide(String tipoAsteroide) {
        this.tipoAsteroide = tipoAsteroide;
    }

    public Asteroide(String nome, String tipoAsteroide){
        this.nome=nome;
        this.tipoAsteroide=tipoAsteroide;
}
    public void destruir(){
        System.out.println("Asteroide "+ getTipoAsteroide() + " destruido");

    }

}

