package dispositivos.smart_phone;

import dispositivos.audio.ReprodutorMusical;
import dispositivos.navegador.NavegadorInternet;
import dispositivos.telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    private String musicaAtual = "N/A";

    private String getMusicaAtual(){
        return this.musicaAtual;
    }

    private void setMusicaAtual(String musicaAtual){
        this.musicaAtual = musicaAtual;
    }

    public void exibirPagina(String url){
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova página.");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando páginas...");
    }

    public void tocarMusica(){
        System.out.println("Tocando musica: " + getMusicaAtual());
    }

    public void pausarMusica(){
        System.out.println("Música Pausada.");
    }

    public void selecionarMusica(String musica){
        setMusicaAtual(musica);
        System.out.println("Música selecionada: " + getMusicaAtual());
    }

    public void ligar(String numero){
        System.out.println("Ligando para o número " + numero);
    }

    public void atender(){
        System.out.println("Atendendo telefone.");
    }

    public void iniciaCorreioVoz(){
        System.out.println("Iniciando correio de voz.");
    }
}
