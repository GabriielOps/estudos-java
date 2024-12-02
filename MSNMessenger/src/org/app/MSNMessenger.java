package app;

public class MSNMessenger extends ServicoMensageria{

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo MSN");
    }
    

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo MSN");
    }
}
