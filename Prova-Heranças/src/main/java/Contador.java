public class Contador extends Funcionario implements Despesa{
    private int ramal;
    public Contador(String nome,int matricula,double salario,int ramal){
        super(nome, matricula, salario);
        this.ramal = ramal;
    }
    @Override
    public void recebeSalario() {
        System.out.println("Valor recebido: "+salario);
    }
@Override
public void cadastrarDespesa(String despesa){
    System.out.println("Foi cadastrado uma nova empresa");

}
    @Override
    public void mostraInfo(){
super.mostraInfo();
System.out.println("Valor do ramal:"+ramal);
        System.out.println( );
    }
}
