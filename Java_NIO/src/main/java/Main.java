import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        try{
            Map<String,String> configuracoes = new HashMap<>();
           Path arquivo = Paths.get("professores_disciplina.txt");
           List<String> conteudo = Files.readAllLines(arquivo);
conteudo.forEach((linha)->{
String[] linhaQuebrada = linha.split ("=");
configuracoes.put(linhaQuebrada[0],linhaQuebrada[1].strip());
    System.out.println(linha);
            });
       } catch(IOException e){
           System.out.println("Erro");
       }
    }
}
