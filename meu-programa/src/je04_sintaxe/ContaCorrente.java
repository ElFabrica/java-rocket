package je04_sintaxe;

import java.time.LocalDate;
import java.util.List;

public class ContaCorrente {
    Integer number;
    Integer agencia;
    String Nameclient;
    LocalDate dataNascimento;
    Double salt;
    Boolean active;

    Double consultSalt(Double salt){
        return salt;
    }

    void consultExtract(LocalDate InitialData, LocalDate FinishData){

    }

    void cancelAccount(String justify){
        //Algoritmo irá manipular atributo ativo
    }

    void transferValue(ContaCorrente contaDestino, Double valorTransferido){

    }

    void sacar(Double value ){
        //Não solicitei logica
    }


}
