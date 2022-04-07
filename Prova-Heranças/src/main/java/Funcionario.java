public abstract class Funcionario {
    public static int contador;
    protected int matricula;
    protected String nome;
    protected double salario;

    public Funcionario(String nome,int matricula,double salario){
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;

    }


   public abstract void recebeSalario();
    public void mostraInfo(){
        System.out.println("Nome do funcionario:"+nome);
        System.out.println("Matricula:"+matricula);
        System.out.println("Salario do individuo:"+salario);
    }

}
