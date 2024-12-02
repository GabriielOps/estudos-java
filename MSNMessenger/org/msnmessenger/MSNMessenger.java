public class MSNMessenger {
    
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem");
        salvarHistoricoMensagem();
    }
    
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem");
    }
    
   
   //São metodos privados
    private void validarConectadoInternet() {
        System.out.println("Validando Conexão com a Internet...");
    }
    
    private void salvarHistoricoMensagem() {
        System.out.println("Salvando Histórico da Mensagem...");
    }
}
