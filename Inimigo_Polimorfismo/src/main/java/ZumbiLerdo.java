public class ZumbiLerdo extends Inimigo{
    public ZumbiLerdo(String nome,String poder, int vida ){
        super(nome,poder,vida);

    }

    public void atacar(){
        System.out.println("zumbi lerdo atacando!");
    }
}
