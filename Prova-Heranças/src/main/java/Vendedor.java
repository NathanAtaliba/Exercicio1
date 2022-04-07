public class Vendedor extends Funcionario implements Venda{
private double totalComissao;
    public Vendedor(String nome,int matricula,double salario,double totalComissao){
        super(nome, matricula, salario);
        this.totalComissao = totalComissao;
    }
    @Override
    public void recebeSalario() {
        System.out.println("Valor recebido: "+salario);
    }


    public double getTotalComissao() {
        return totalComissao;
    }

    public void fechaVenda(double valorVenda){
     valorVenda = valorVenda *0.2;
     totalComissao += valorVenda;
    }
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("valor da comissao:"+getTotalComissao());
        System.out.println( );
    }

}
