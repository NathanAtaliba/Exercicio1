public class Principal {
    public static void main(String[] args) {
        double soma = 0;
Produto[] produto = new Produto[2];

Produto prod0 = new Produto();
produto[0] = prod0;
prod0.nome = "caderno";
prod0.descrição = "90 folhas";
prod0.fabricante = "fabercastel";
prod0.preco = 14;

        Produto prod1 = new Produto();
       produto[1]= prod1;
        prod1.preco = 10;
        prod1.nome = "Macarrao";
        prod1.fabricante = "desconhecido";
        prod1.descrição = "miojo instantaneo";
        for(int i=0;i<2;i++){
            soma = soma + produto[i].preco;
        }
        System.out.println("Total a pagar: ");
        System.out.println(soma);
        System.out.println("Descriçaõ dos produtos: ");
        produto[0].mostraInfo();
        System.out.println("");
        produto[1].mostraInfo();
    }
}
