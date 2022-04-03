public abstract class Funcionario {
  protected String nome;
  protected int horasTrabalhadas;
  protected int valorHora;
  protected int totalSalario;
  protected String funcao;
    public Funcionario(String nome,int horasTrabalhadas,int valorHora,String funcao ){
      this.nome=nome;
      this.valorHora=valorHora;
      this.funcao=funcao;
      this.horasTrabalhadas=horasTrabalhadas;
  }
  public int calculaSalario(){
      totalSalario = valorHora*horasTrabalhadas;
      return totalSalario;
  }

  public void apresentar(){
    System.out.println("Meu nome:"+nome);
    System.out.println("Meu salario: "+calculaSalario());
    System.out.println("Minha funcao: "+funcao);
  }

}
