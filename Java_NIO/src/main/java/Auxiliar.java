public class Auxiliar {
    private String nomeDisciplina;
    private String nomeProfessor;

    public Auxiliar(String nomeDisciplina,String nomeProfessor){
        this.nomeDisciplina = nomeDisciplina;
        this.nomeProfessor = nomeProfessor;
    }

    public String getNomeDisciplina() {return nomeDisciplina;}

    public void setNomeDisciplina(String nomeDisciplina) {this.nomeDisciplina = nomeDisciplina;}

    public String getNomeProfessor() {return nomeProfessor;}

    public void setNomeProfessor(String nomeProfessor) {this.nomeProfessor = nomeProfessor;}
}
