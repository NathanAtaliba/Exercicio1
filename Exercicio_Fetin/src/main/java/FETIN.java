import Exceptions.NotaException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;
import java.io.*;
public class FETIN {

    public void addProjeto(Projetos projeto){
        OutputStream os = null;
        OutputStreamWriter osr = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try {
            os = new FileOutputStream("arquivo", true); //salvar no arquivo
            osr = new OutputStreamWriter(os); //conversor
            bw = new BufferedWriter(osr); //o q vai digitar
            bw.write(projeto.getNome()+ " = ");
            bw.write(String.valueOf(projeto.getNotas()));
            bw.newLine();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                bw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
public void AvaliarProjetos(){
    try{
        Path arquivos = Paths.get("arquivo");
        List<String> conteudo = Files.readAllLines(arquivos);
        Map<String,Double> projetos = new HashMap<>();

        conteudo.forEach((linha) -> {
            String[] linhaQuebrada = linha.split("=");
            projetos.put(linhaQuebrada[0], Double.valueOf(linhaQuebrada[1].strip()));
        });

        projetos.forEach((Nome, nota) -> {
if(nota>=60) {
    System.out.println("Nome: " + Nome);
    System.out.println("Nota: " + nota);
    System.out.println("");
}
    else{throw new NotaException("Nota insuficiente");}
});
    } catch(IOException e) {e.printStackTrace();}
    finally {
        System.out.println("cheguei");
    }
}
}

