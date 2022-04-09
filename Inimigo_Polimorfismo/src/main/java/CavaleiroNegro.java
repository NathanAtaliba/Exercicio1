public class CavaleiroNegro extends  Inimigo {
    public CavaleiroNegro(String nome,String poder, int vida ){
        super(nome,poder,vida);

    }

    public void atacar(){
        System.out.println("Cavaleiro negro atacando!");
    }
}
