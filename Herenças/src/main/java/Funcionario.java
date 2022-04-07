public abstract class Funcionario{
  protected String nome;
  protected int idade;
  protected String funcao;
  protected int horasTrabalhadas;
  protected int valorHora;
  protected int salarioTotal;

  public Funcionario(String nome, int horasTrabalhadas, String funcao, int valorHora,int idade){
    this.nome =nome;
    this.horasTrabalhadas =horasTrabalhadas;
    this.funcao = funcao;
    this.valorHora = valorHora;
    this.idade = idade;
  }

  public void apresentar(){
    System.out.println("Meu nome e:"+nome);
    System.out.println("Minha idade e: "+idade);
    System.out.println("Minha funcao e: "+funcao);
    System.out.println("Meu salario: "+ calculaSalario());

  }
  public int calculaSalario(){
    salarioTotal=(horasTrabalhadas*valorHora);
    return salarioTotal;
  }
}