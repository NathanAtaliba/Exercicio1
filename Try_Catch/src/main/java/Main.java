import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com os valores desejados para operacao (1-Divisao|2-Soma|3-Multiplicacao|4-Subtracao) ");
        System.out.println("Operacao desejada: ");
        int op = input.nextInt();
        System.out.println("Numero 1: ");
        int num1 = input.nextInt();
        System.out.println("Numero 2: ");
        int num2 = input.nextInt();

        try
        {
            System.out.println((num1/num2));
        }
        catch(ArithmeticException erro){
            System.out.println("Divisao por zero nao existe, erro chamado : "+erro);
        }
 Calculadora calc = new Calculadora(num1,num2,op);

switch (calc.getOp())
{

    case 1:
    calc.dividir();
    break;

    case 2:
    calc.soma();
    break;

    case 3:
    calc.multiplicar();
    break;

    case 4:
    calc.subtracao();
    break;

    default:
        System.out.println("Operacao nao existe!");
}
        try
        {
            calc.dividir();
        }
        catch(ArithmeticException erro){
            System.out.println("Divisao por zero nao existe, erro chamado : "+erro);
        }
    }}
