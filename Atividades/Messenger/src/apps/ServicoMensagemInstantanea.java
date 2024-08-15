package apps;

public abstract class ServicoMensagemInstantanea{
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    // Mais um método que todos os filhos deverão implementar
    protected abstract void salvarHistoricoMensagem();

    // Somente os filhos conhecem este método
    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado com a internet");
    }
}