public class Socia {
    private String nome;
    private int idade;

    public Socia(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void mostraInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("idade: "+ idade);
    }
}
