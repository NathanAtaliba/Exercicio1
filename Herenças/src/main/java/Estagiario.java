public class Estagiario extends Funcionario implements Sofre{
    public Estagiario(String nome,int horasTrabalhadas,String funcao,int valorHora,int idade){
        super(nome, horasTrabalhadas, funcao, valorHora, idade);
    super.apresentar();
    super.calculaSalario();
    }
    public void sofrer(){

    }
}