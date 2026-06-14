package je_19_arrays;

import java.util.*;

public class Mapas {
    public static void main(String[] args) {
        //Map<String, String> estadosBrasileiro = new HashMap<>();
        Map<String, String> estadosBrasileiro = new LinkedHashMap<>();
        //Map<String, String> estadosBrasileiro = new TreeMap<>();
        estadosBrasileiro.put("SP","SAO PAULO");
        estadosBrasileiro.put("PI","PIAUI");
        estadosBrasileiro.put("MA","MARANHAO");
        estadosBrasileiro.put("MA","MARANHAO");
        estadosBrasileiro.put("AM","AMAZONAS");
        estadosBrasileiro.put("BA","BAHIA");
        estadosBrasileiro.put("GO","GOIAS");

        Iterator ufsIterator = estadosBrasileiro.keySet().iterator();
        while (ufsIterator.hasNext()) {
            Object key = ufsIterator.next();
            Object value = estadosBrasileiro.get(key);
            System.out.println("Sigla: " + key + " Nome: " + value);
        }
        System.out.println("O estado que etá na chave PI é: " + estadosBrasileiro.get("PI"));

        Map estadosCivil = new HashMap<String, String>();
        estadosCivil.put("S","SOLTEIRO(A)");
        estadosCivil.put("C","CASADO(A)");
        estadosCivil.put("D","DIVORCIADO(A)");
        estadosCivil.put("V","VIUVO(A)");
    }
}
