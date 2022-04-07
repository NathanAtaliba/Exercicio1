public class Gerente extends Funcionario implements ContrataFuncionario, Sofre {
    public int bonus;
    public Gerente(String nome,int horasTrabalhadas,String funcao,int valorHora,int idade,int bonus) {
        super(nome, horasTrabalhadas, funcao, valorHora, idade);
        this.bonus= bonus;
    }

    @Override
    public int calculaSalario(){
        salarioTotal = bonus+(horasTrabalhadas*valorHora);
        return salarioTotal;
    }

    @Override
    public void apresentar() {
        System.out.println("Eu sou o gerente!");
        System.out.println("Meu nome e:"+nome);
        System.out.println("Minha idade e: "+idade);
        System.out.println("Minha funcao e: "+funcao);
        System.out.println("Meu salario: "+ calculaSalario());
    }

    public void criaProcessoSeletivo(){

    }
    public void agendaEntrevista(){

    }
    public void sofrer(){

    }
}