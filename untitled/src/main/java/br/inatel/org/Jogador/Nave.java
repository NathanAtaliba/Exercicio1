package br.inatel.org.Jogador;
import br.inatel.org.inimigo.Asteroide;
public class Nave{
private String nome;
private double vida;
private String tipoTiro;
public Nave(String nome,double vida,String tipoTiro){
    this.nome = nome;
    this.tipoTiro= tipoTiro;
    this.vida = vida;
}
public void atirar(Asteroide ast){
if(tipoTiro=="Explosivo"){
    ast.destruir();
}else if(ast.gettipoAsteroide()=="pequeno"){
    ast.destruir();
}else{
    System.out.println("O asteroide nao pode ser destruido");
}
}
}
