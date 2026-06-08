package je_16_java_nio;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public static void EscreverLayoutDelimitado(List<Cadastro> cadastros){
    System.out.println("***** - LAYOUT DELIMITADO - *****");

    try {
        StringBuilder conteudo = new StringBuilder();

        for (Cadastro cadastro : cadastros) {
            conteudo.append(cadastro.getNome() + ";");
            conteudo.append(cadastro.getSexo() + ";");
            conteudo.append(cadastro.getTelefone() + ";");
            conteudo.append(cadastro.getDataNascimento() + ";");
            conteudo.append(cadastro.getValorSugerido() + ";");
            conteudo.append(cadastro.isCliente());
            conteudo.append(System.lineSeparator());
        }
        System.out.println(conteudo.toString());

        Path arquivoDestino = Paths.get("C:\\arquivos\\lista-contatos-modelo-delimitado.csv");

        Files.write(arquivoDestino, conteudo.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);

    } catch (Exception ex){
        ex.printStackTrace();
    }
}