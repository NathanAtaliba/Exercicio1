package br.inatel.org.inimigo;

public class Asteroide {

private String nome;
private String tipoAsteroide;

public Asteroide(String nome,String tipoAsteroide){
    this.nome = nome;
    this.tipoAsteroide= tipoAsteroide;
}
public String gettipoAsteroide(){
    return tipoAsteroide;
}
public void destruir(){
    System.out.println("O asteroide "+ tipoAsteroide +" foi destruido");
}
}