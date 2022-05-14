package br.inatel.codigo.arquivo;
import br.inatel.codigo.artista.Artista;
import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    public void escrever(Artista a1) {

        OutputStream os = null;
        OutputStreamWriter osr = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try {
            os = new FileOutputStream("Artistas.txt", true); //salvar no arquivo
            osr = new OutputStreamWriter(os); //conversor
            bw = new BufferedWriter(osr); //o q vai digitar

                bw.write("Artista");
                bw.newLine();
                bw.write(a1.getNome() + "\n");
                bw.write(a1.getOuvintesMensais() + "\n");
                bw.write(a1.getMusicasMaisFamosas() + "\n");
                bw.write(a1.isInternacional() + "\n");
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

    public ArrayList<Artista> ler() {

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        ArrayList<Artista> acheiNoArquivo = new ArrayList<>();
        String linhaLer;

        try {

            is = new FileInputStream("Artistas.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while(linhaLer != null) {
                if(linhaLer.contains("Aluno")) {
                    Artista aux = new Artista();
                    aux.setNome(br.readLine());
                    aux.setMusicasMaisFamosas(br.readLine());
                    aux.setOuvintesMensais(Integer.parseInt(br.readLine()));

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

