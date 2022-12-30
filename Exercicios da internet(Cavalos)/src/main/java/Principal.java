import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cavalos;
        double massa=0;
        double altura=0;
        double tempo=0;
        System.out.println("Entre com o valor da massa a ser levantada: ");
         massa = input.nextDouble();
         input.nextLine();
        System.out.println("Entre com o valor do tempo: ");
        tempo = input.nextDouble();
        input.nextLine();
        System.out.println("Entre com a altura: ");
        altura = input.nextDouble();
        input.nextLine();
        cavalos =((massa*altura)/tempo)/745.699;
        System.out.println("Vai precisar de :"+ cavalos +" cavalos");

    }
}

