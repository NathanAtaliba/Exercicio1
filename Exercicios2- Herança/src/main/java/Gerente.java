public class Gerente extends Funcionario {
    private int bonus;
private double totalSalario;
    public Gerente(String nome, int horasTrabalhadas, double salarioHora, int idade, int bonus) {
        super(nome, horasTrabalhadas, salarioHora, idade);
        this.bonus = bonus;
    }
public void gettotalSalario(){
        totalSalario =bonus+getSalarioHora()*getHorasTrabalhadas();
}
    @Override
    public void apresentar() {
        System.out.println("Eu sou gerente!");
        System.out.println("Meu salario é : " + calculaSalarioMes());
    }

    @Override
    public double calculaSalarioMes() {
gettotalSalario();

        return totalSalario;
    }
}