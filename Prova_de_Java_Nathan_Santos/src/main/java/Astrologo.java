public class Astrologo extends Personagem implements Cura,Magia{
public Astrologo(String nome,int vitalidade,int inteligencia,int fe){
    super(nome,vitalidade,inteligencia,fe);
}

    @Override
    public void mostraInfo() {
        super.mostraInfo();
    }
    @Override
    public void ganhaHabilidade() {
        System.out.println(getNome()+" ganhou uma nova habilidade!");
    }

    @Override
    public void passaLevel() {
        super.passaLevel();
    }
    @Override
    public void aprendeFeitico(){
        System.out.println(getNome()+"aprendeu um novo feitico");
    }
    @Override
    public void usaFeitico(int dano){

        System.out.println("Usou um feitico e tomou dano de :" + dano);
}
    @Override
    public void aprendeCura() {
        System.out.println(getNome()+" aprendeu a curar");
    }

    @Override
    public void curar() {
        System.out.println(getNome()+ " curou");
    }
}
