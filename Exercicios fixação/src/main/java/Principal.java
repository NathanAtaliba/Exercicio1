import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        //De acordo com a opção do usuário imprima a tabela verdade do operador desejado. ( E ou OU).
        System.out.println("(1-E 2-OU)Escolha a tabela da verdade desejada: ");
        int opcao = entrada.nextInt();
        switch(opcao)
        {
            case 1:
                System.out.println("logica E: 00=0 01=0 10=0 11=1");
                break;
            case 2:
                System.out.println("logica OU: 00=0 01=1 10=1 11=1");
                break;
        }


//Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores naoaceitos"

        System.out.println("Entre com os valores de A,B,C,D em sequencia: ");
        int A= entrada.nextInt();
        int B= entrada.nextInt();
        int C= entrada.nextInt();
        int D= entrada.nextInt();
        if(B>C){
            if(D>A){
                if((C+D)>(A+B)){
                    if(C>0 && D>0){
                        if(A%2==00){
                            System.out.println("Valores aceitos!");
                        }else System.out.println("valores nao aceitos!");

                    }else System.out.println("valores nao aceitos!");
                }else System.out.println("valores nao aceitos!");
            }else System.out.println("valores nao aceitos!");
        }else System.out.println("valores nao aceitos!");

//Crie um programa que calcule o IMC (Índice de Massa Corporal) e mostre o grau de obesidade de acordo com o resultado. Fórmula do imc= ( peso / altura² ). Dica: pesquise sobre a Tabela IMC para saber os graus de obesidade.

        System.out.println("Entre com a altura da pessoa: ");
        float altura = entrada.nextFloat();
        System.out.println("Entre com o peso em kg: ");
        float peso = entrada.nextFloat();

        float IMC ;
        IMC = peso/(altura*altura);
        if(IMC<18.5){
            System.out.println("Magreza");
        }else if((IMC>=18.5) && (IMC<=24.9)){
            System.out.println("Indice normal");
        }else if((IMC>=24.901) && (IMC<=29.9)){
            System.out.println("Sobrepeso");
        }else if(IMC>=30 && IMC<=39.99){
            System.out.println("Obesidade");
        }else if(IMC>40){
            System.out.println("Obesidade grave");
        }
        System.out.println("Seu indice é: "+IMC );

    }
}
