public class Inimigo {
    private String nome;
    private String poder;
    private int vida;
    Inimigo(String nome, String poder,int vida){
        this.vida = vida;
        this.nome = nome;
        this.poder = poder;
    }

public String getNome(){
        return nome;
}
}
