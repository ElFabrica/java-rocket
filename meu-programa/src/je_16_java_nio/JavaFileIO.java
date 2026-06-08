package je_16_java_nio;

import java.io.File;
import java.io.IOException;

public class JavaFileIO {
    public static void main(String[] args) {
        File diretorio =new File("/home/dev/Documentos/java-rocket/meu-programa/src/je_26_java_nio");
        System.out.println("Diretorio existe? " + diretorio.exists());
        if(!diretorio.exists()){
            diretorio.mkdir();
            System.out.println("Foi criado com sucesso!");
        }
        try{
            File arquivo =new File(diretorio, "aula javeira");
            System.out.println(arquivo.exists());

            arquivo.createNewFile();
            System.out.println(arquivo.exists());
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
