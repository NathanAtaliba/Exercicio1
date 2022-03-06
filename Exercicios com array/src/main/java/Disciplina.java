public class Disciplina {
    String professor;
    String nome;
    String sigla;
Aluno[] alunos;
    public Disciplina(String professor,String nome,String sigla){
        this.professor = professor;
        this.nome = nome;
        this.sigla = sigla;
    }

    void mostraInfo() {
        System.out.println("Nome do professor da disciplina: " + nome);
        System.out.println("Nome da disciplina: " + professor);
        System.out.println("Sigla: " + sigla);

        }
    }

