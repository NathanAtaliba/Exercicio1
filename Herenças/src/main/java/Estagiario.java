public class Estagiario extends Funcionario {

    Estagiario(String nome,int horasTrabalhadas,int valorHora,String funcao){
        super(nome,horasTrabalhadas,valorHora,funcao);
       super.calculaSalario();
       super.apresentar();
    }

}
