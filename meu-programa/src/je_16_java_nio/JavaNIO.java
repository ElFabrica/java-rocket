package je_16_java_nio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaNIO {
    public static void main(String[] args) {
        try {
            String conteudo = "Hoje aprendemos sobre Java IO - OutputStream e escrita em arquivos físicos no sistema operacional";
            File aulaFile = new File("/home/dev/Documentos/java-rocket/meu-programa/src/je_26_java_nio/aula-javeira");
            FileOutputStream output = new FileOutputStream(aulaFile);
            char [] caracteres = conteudo.toCharArray();
            int x = 0;
            while (x < conteudo.length()) {
                output.write(caracteres[x++]);
            }
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
