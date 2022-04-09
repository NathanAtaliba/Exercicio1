public class Samurai extends Personagem implements Cura{
    private int honra;
    public Samurai(String nome,int vitalidade,int inteligencia,int fe,int honra) {
        super(nome, vitalidade, inteligencia, fe);
    this.honra = honra;
    }
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        passaLevel();
        System.out.println("Honra: "+ honra);
    }

    @Override
    public void passaLevel() {
        super.passaLevel();
        this.honra = honra;
        honra++;
    }

public void ganhaHabilidade(){
    System.out.println(getNome()+ " ganhou uma nova habilidade!");
}
    @Override
    public void aprendeCura() {
        System.out.println(getNome()+" aprendeu a curar");
    }
    @Override
    public void curar() {
        System.out.println(getNome()+" curou");
    }

}

