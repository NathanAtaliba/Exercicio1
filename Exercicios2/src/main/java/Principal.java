import java.util.Scanner;
public class Principal {
    static void calculaArea(double hp,double lp,double ha,double la){
double retangulop=0;
double retanguloa=0;
double nAzulejos=0;
retangulop = hp * lp;
retanguloa = ha * la;


nAzulejos = (retangulop/retanguloa);
        System.out.println(nAzulejos);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
double alturaParede,larguraParede,alturaAzulejo,larguraAzulejo;
        System.out.println("Entre com a altura da parede: ");
        alturaParede = input.nextDouble();
        input.nextLine();
        System.out.println("Entre com a largura da parede: ");
        larguraParede = input.nextDouble();
        input.nextLine();
        System.out.println("Entre com a altura do azulejo: ");
        alturaAzulejo = input.nextDouble();
        input.nextLine();
        System.out.println("Entre com a largura do azulejo: ");
        larguraAzulejo = input.nextDouble();
        input.nextLine();

        calculaArea(alturaParede,larguraParede,alturaAzulejo,larguraAzulejo);
    }
}
