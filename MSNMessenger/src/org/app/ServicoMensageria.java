package app;

public abstract class ServicoMensageria {

    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
}
