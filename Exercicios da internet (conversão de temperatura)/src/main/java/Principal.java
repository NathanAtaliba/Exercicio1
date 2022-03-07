import java.util.Scanner;

public class Principal {
    static void mostraInfo(float C){
        double K, Re, Ra, F;
        F = ((C * 1.8) + 32);
        K = C + 273.15;
        Re = C * 0.8;
        Ra = C * 1.8 + 32 + 459.67;
        System.out.println("Em fahrenheit: "+ F);
        System.out.println("Em Kelvin: "+ K);
        System.out.println("Em Réaumur: "+ Re);
        System.out.println("Em Rankine: "+ Ra);

    }
    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Entre com o valor da temperatura em celsius: ");
        float c = entradaTeclado.nextFloat();
       mostraInfo(c);
    }
    }
