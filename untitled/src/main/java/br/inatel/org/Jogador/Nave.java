package br.inatel.org.Jogador;

import br.inatel.org.inimigo.Asteroide;

public class Nave{
    private String nome;
    private double vida;
    private String tipoTiro;


    public Nave(String nome,double vida,String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getTipoTiro() {
        return tipoTiro;
    }

    public void setTipoTiro(String tipoTiro) {
        this.tipoTiro = tipoTiro;
    }

    public void Atirar(Asteroide ast){
if(tipoTiro == "Explosivo"){
    ast.destruir();
}else if(ast.getTipoAsteroide() == "pequeno") {
    ast.destruir();
}
    else{
    System.out.println("Asteroide nao destruido");
}
}
}