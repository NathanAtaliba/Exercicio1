public class GerenteRegional extends Funcionario implements Venda,Reuniao{
    private String departamento;

    public GerenteRegional(String nome,int matricula,double salario,String departamento){

        super(nome, matricula, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Departamento: "+ departamento);
        System.out.println( );
    }
    @Override
    public void recebeSalario() {
        System.out.println("Valor recebido: "+salario);
    }
public void promoveFuncionario(){
    System.out.println("O funcionario foi promovido!");
}
public void agendaReuniao(String motivo){
    System.out.println("A reuniao foi agendada!");
}
@Override
    public void fechaVenda(double valorVenda){
    System.out.println("Venda fechada!");
    }
}
