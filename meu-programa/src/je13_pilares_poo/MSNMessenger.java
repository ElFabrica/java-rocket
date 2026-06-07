package je13_pilares_poo;

public class MSNMessenger {

    public void enviarMensagem() {
        validarContectadoInterter();
        System.out.println("Enviando mensagem");
    }
    public void receberMensagem(){
        salvarHistoricoMensagem();
        System.out.println("Recebendo mensagem");
    }
    private void validarContectadoInterter(){
        System.out.println("Validado");
    }
    private  void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem");
    }
}
