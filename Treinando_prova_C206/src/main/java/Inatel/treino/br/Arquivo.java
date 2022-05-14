package Inatel.treino.br;
import java.io.*;
import java.util.ArrayList;
import Inatel.treino.br.Seriado;
public class Arquivo {
    public void escrever(Seriado seriado) {

        OutputStream os = null;
        OutputStreamWriter osr = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try {
            os = new FileOutputStream("Seriado.txt", true); //salvar no arquivo
            osr = new OutputStreamWriter(os); //conversor
            bw = new BufferedWriter(osr); //o q vai digitar

            bw.write("Seriado");
            bw.newLine();
            bw.write( seriado.getNome()+ "\n");
            bw.write(seriado.getTemporadas() + "\n");
            bw.write(seriado.getAnoCriacao() + "\n");
            bw.write(seriado.getStreaming()+"\n");

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

    public ArrayList<Seriado> ler() {

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        ArrayList<Seriado> acheiNoArquivo = new ArrayList<>();
        String linhaLer;

        try {

            is = new FileInputStream("Seriado.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while(linhaLer != null) {
                if(linhaLer.contains("Seriado")) {
                    Seriado aux = new Seriado();
                    aux.setNome(br.readLine());
                    aux.setAnoCriacao(Integer.parseInt(br.readLine()));
                    acheiNoArquivo.add(aux);
                }
                linhaLer = br.readLine();
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return acheiNoArquivo;
    }
}
