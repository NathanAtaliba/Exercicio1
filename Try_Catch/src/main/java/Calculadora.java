public class Calculadora {
    private int numero1;
    private int numero2;
    private int op;

    public int getOp() {
        return op;
    }

    public Calculadora(int numero1, int numero2,int op){
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.op = op;
    }
    public void soma(){
        System.out.println((numero1+numero2));
    }
    public void multiplicar(){
        System.out.println((numero1*numero2));
    }

    public void dividir(){
        try{
            System.out.println(numero1/0);
        }catch (ArithmeticException erro){
            System.out.println("Erro chamado: "+ erro);

        }

        System.out.println(numero1/numero2);
    }
    public void subtracao(){
        System.out.println((numero1-numero2));
    }
}
