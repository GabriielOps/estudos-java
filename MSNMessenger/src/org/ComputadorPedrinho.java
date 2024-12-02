
import app.FBMessenger;
import app.MSNMessenger;
import app.TelegramMessenger;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        //Iniciando MSN Messenger
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        //Facebook
        FBMessenger fcb = new FBMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        //Telegram
        TelegramMessenger tlg = new TelegramMessenger();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
