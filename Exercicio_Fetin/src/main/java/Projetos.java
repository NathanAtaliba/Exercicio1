public class Projetos {
    private double notas;
    private String Nome;

    Projetos(String Nome,double notas){
        this.Nome = Nome;
        this.notas = notas;

    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
