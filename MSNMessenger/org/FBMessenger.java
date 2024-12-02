public class FBMessenger extends ServicoMensageria {
    
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando Mensagem pelo Facebook");
    }
    
    @Override
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo Facebook");
    }
}
