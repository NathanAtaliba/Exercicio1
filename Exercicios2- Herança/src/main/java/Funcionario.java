public class Funcionario {
    protected int idade;
    protected String nome;
    protected double horasTrabalhadas;
    protected double salarioHora;

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    Funcionario(String nome, int horasTrabalhadas, double salarioHora, int idade) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioHora = salarioHora;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Eu sou um funcionario");
    }

    public double calculaSalarioMes() {
        return horasTrabalhadas * salarioHora;
    }

}
