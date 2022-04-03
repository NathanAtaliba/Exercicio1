public class Gerente extends Funcionario implements ContrataFuncionario{
    private int bonus;
    public Gerente(String nome,int horasTrabalhadas,int valorHora,String funcao,int bonus){
     super(nome,horasTrabalhadas,valorHora,funcao);
      this.bonus= bonus;
    }

    @Override
    public void apresentar(){
        System.out.println("Eu sou o gerente "+ nome);
        super.apresentar();
    }
    @Override
    public int calculaSalario(){
        totalSalario = bonus+ valorHora*horasTrabalhadas;
        return totalSalario;
    }

    public void criaProcessoSeletivo(){
    System.out.println("Criando processo seletivo");
}

    public void agendaEntrevista() {
        System.out.println("Agendando uma entervista");
    }
public void sofrer(){
    System.out.println("Sofrenfo...");
}

}