public class Curso {
    String nome;
    String tipo;
    String turno;


 public Curso(String nome,String tipo ,String turno){
 this.nome = nome;
 this.tipo = tipo;
 this.turno = turno;
 }

    void mostraInfo(){
        System.out.println("O nome do curso é: " + nome);
        System.out.println("O tipo do curso é: " + tipo);
        System.out.println("O turno do curso é: " + turno);

    }
}
