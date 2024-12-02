import app.FBMessenger;
import app.MSNMessenger;
import app.ServicoMensageria;
import app.TelegramMessenger;

public class ComputadorJocaPolimorfico {
    public static void main(String[] args) {
        ServicoMensageria smi = null;

        //Não se sabe qual app, mas qualquer um deve enviar e receber mensagens
        String appEscolhido = "tlg";

        switch (appEscolhido) {
            case "msn" -> smi = new MSNMessenger();
            case "fbm" -> smi = new FBMessenger();
            case "tlg" -> smi = new TelegramMessenger();
            default -> {
            }
        }
        
        enviarMsg(smi);
        receberMsg(smi);
       
    }

    private static void receberMsg(ServicoMensageria smi) {
        smi.receberMensagem();
    }

    private static void enviarMsg(ServicoMensageria smi) {
        smi.enviarMensagem();
    }
}
