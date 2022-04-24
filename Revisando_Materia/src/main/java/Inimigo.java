public class Inimigo {
    private String nome;
    private int vida;
    private int danoAtaque;
    private int defesa;
     private int vidaTeste;
    public Inimigo(int vidaTeste){

        this.vidaTeste = vidaTeste;
    }

    public int getVidaTeste() {
        return vidaTeste;
    }

    private static int numInimigos;
    public Inimigo(String nome,int vida,int danoAtaque,int defesa){
        this.nome = nome;
        this.vida = vida;
        this.danoAtaque = danoAtaque;
        this.defesa= defesa;
numInimigos++;
    }
public int getnumInimigos(){
        return this.numInimigos;
}
public void setnumInimigos(int numInimigos){
        this.numInimigos = numInimigos;
}
    public void mostraInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Vida: "+vida);
        System.out.println("Dano do ataque: "+danoAtaque);
        System.out.println("Defesa: "+defesa);
        System.out.println("");

    }
public void atacar(){
    System.out.println("Inimigo atacando");
}
private void defender(){

}
}
