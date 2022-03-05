import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
Scanner entradaTeclado = new Scanner(System.in);
//////////////////////////////////////////////////////////////////
        Curso[] curso = new Curso[1];  // alocando uma memoria com 3 vetores para curso
        Curso cur0 = new Curso();   // criando novos cursos para serem usados de referencia
        curso[0] = cur0;          // apontando o array pro curso 0;
//////////////////////////////////////////////////////////////////
        Disciplina[] disciplina = new Disciplina[1];  //alocando uma memoria com 3 vetores para disciplina
        Disciplina dis0 = new Disciplina(); // criando novas disciplinas para serem usados de referencia
        disciplina[0] = dis0;          // apontando o array pra disciplina 0;
///////////////////////////////////////////////////////////////////
        Aluno[] alunos = new Aluno[1]; //alocando uma memoria com 3 vetores para alunos
        Aluno alunO = new Aluno(); // criando novos alunos para serem usados de referencia
        alunos[0] = alunO;          // apontando o array pro aluno 0;
//////////////////////////////////////////////////////////////////
        //Definindo valores:
        curso[0].turno = "manha";
        curso[0].nome = "Engenharia";
        curso[0].tipo = "nenhum";
        disciplina[0].nome = "Matematica";
        disciplina[0].professor = "Matheus";
        disciplina[0].sigla ="PM";
        alunos[0].nome = "Nathan Santos Ataliba";
        alunos[0].idade = 21;
        alunos[0].matricula = 1663;
        cur0.mostraInfo();
        dis0.mostraInfo();
       alunO.mostraInfo();


    }

}
