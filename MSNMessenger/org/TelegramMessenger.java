public class TelegramMessenger extends ServicoMensageria{
    
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando Mensagem pelo Telegram");
    }
    
    @Override
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo Telegram");
    }
}
