public class Jogador {
    String nome;
    double salario;
    int nCamisa;
    boolean base;

    public Jogador(String nome,double salario, int nCamisa, boolean base){
        this.nome = nome;
        this.salario = salario;
        this.nCamisa = nCamisa;
        this.base = base;
    }
    void mostraInfo(){
        System.out.println("nome do jogador: "+ nome);
        System.out.println("salario do jogador: "+ salario);
        System.out.println("numero da camisa: "+ nCamisa);
        System.out.println("É  da base : "+ base);
    }

}
