public class Estagiario extends Funcionario {
int merdas;
public Estagiario(String nome,int horasTrabalhadas,double salarioHora,int idade) {
    super(nome, horasTrabalhadas, salarioHora, idade);
}

public void fazMerda(){
    merdas++;
}
@Override
    public void apresentar(){
        System.out.println("Eu sou estagiario!");
        System.out.println("Meu salario e : "+(getSalarioHora()*getHorasTrabalhadas()));
}}