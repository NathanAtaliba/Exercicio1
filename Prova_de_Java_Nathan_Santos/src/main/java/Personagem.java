public abstract class Personagem {
    public static int contador;
    private String nome;
    private int vitalidade;
    private int inteligencia;
    private int fe;
    public Arma arma;
public Personagem(String nome,int vitalidade,int inteligencia,int fe)
    {
    this.nome = nome;
    this.inteligencia = inteligencia;
    this.vitalidade = vitalidade;
    this.fe = fe;
    contador++;
    arma = new Arma();
    }

    public String getNome() {
        return nome;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }

    public int getVitalidade() {
        return vitalidade;
    }

    public int getFe() {
        return fe;
    }

    public void mostraInfo(){
    System.out.println("Nome: "+nome);
    System.out.println("Vitalidade: "+vitalidade);
    System.out.println("Inteligencia: "+inteligencia);
    System.out.println("Fe:"+ fe);

}
public void passaLevel(){
vitalidade++;
inteligencia++;
fe++;
}
public abstract void ganhaHabilidade();
}
