public class Boss extends Inimigo{
    public Boss(String nome, int vida, int danoAtaque,int defesa){
        super(nome,vida,danoAtaque,defesa);

    }

 @Override
 public void atacar(){
    System.out.println("BOSS atacando");
}
}
