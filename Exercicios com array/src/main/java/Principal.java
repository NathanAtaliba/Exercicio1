import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
Scanner entradaTeclado = new Scanner(System.in);
//////////////////////////////////////////////////////////////////
        Curso[] curso = new Curso[1];  // alocando uma memoria com 1 vetores para curso
        Curso cur0 = new Curso("GEC","graduação","integral");   // criando novos cursos para serem usados de referencia
        curso[0] = cur0;          // apontando o array pro curso 0;
//////////////////////////////////////////////////////////////////
        Disciplina[] disciplina = new Disciplina[1];  //alocando uma memoria com 1 vetores para disciplina
        Disciplina dis0 = new Disciplina("Renzo","S0","C206"); // criando novas disciplinas para serem usados de referencia
        disciplina[0] = dis0;          // apontando o array pra disciplina 0;
///////////////////////////////////////////////////////////////////
        Aluno[] alunos = new Aluno[1]; //alocando uma memoria com 1 vetores para alunos
        Aluno alun0 = new Aluno("Nathan Santos Ataliba",21,1663); // criando novos alunos para serem usados de referencia
        alunos[0] = alun0;          // apontando o array pro aluno 0;
//////////////////////////////////////////////////////////////////
        //mostrando valores:

        cur0.mostraInfo();
        dis0.mostraInfo();
        alun0.mostraInfo();


    }

}
