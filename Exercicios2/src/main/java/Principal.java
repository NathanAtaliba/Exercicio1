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
        alturaParede = input.nextDouble();
        larguraParede = input.nextDouble();
        alturaAzulejo = input.nextDouble();
        larguraAzulejo = input.nextDouble();
        calculaArea(alturaParede,larguraParede,alturaAzulejo,larguraAzulejo);
    }
}
