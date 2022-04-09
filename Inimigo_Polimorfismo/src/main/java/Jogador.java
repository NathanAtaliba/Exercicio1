public class Jogador {
    private String nome;
    private String poder;
    private int vida;

    public void atacar(Inimigo inimigo){
        System.out.println("Atacando o " + inimigo.getNome());
    }

}
