public class Aluno {
    String nome;
    int idade;
    int matricula;

    public Aluno(String nome,int idade,int matricula){
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;


    }


void mostraInfo(){
    System.out.println("Nome do aluno: " + nome);
    System.out.println("Matricula: " + matricula );
    System.out.println("Idade: " + idade);

}


}
