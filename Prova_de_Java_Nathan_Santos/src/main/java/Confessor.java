public class Confessor extends Personagem implements Cura{

    public Confessor(String nome,int vitalidade,int inteligencia,int fe) {
        super(nome, vitalidade, inteligencia, fe);
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();

    }@Override
    public void ganhaHabilidade() {
        System.out.println(getNome()+" ganhou uma nova habilidade!");
    }

    @Override
    public void passaLevel() {
        super.passaLevel();
    }
    @Override
    public void aprendeCura() {
        System.out.println(getNome()+" aprendeu a curar");
    }
    @Override
    public void curar() {
        System.out.println(getNome()+"  curou");
    }

}
