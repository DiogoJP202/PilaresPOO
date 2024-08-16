package usuarios;

import dispositivos.smart_phone.Iphone;

public class IphoneDiogo {
    public static void main(String[] args) {
        Iphone celular = new Iphone();

        System.out.println("------------------------");
        celular.tocarMusica();
        celular.selecionarMusica("ROCK AND ROLL");
        celular.tocarMusica();
        celular.pausarMusica();
        System.out.println("------------------------");
        celular.iniciaCorreioVoz();
        celular.ligar("(11) 9939-0312");
        celular.atender();
        System.out.println("------------------------");
        celular.exibirPagina("www.google.com");
        celular.atualizarPagina();
        celular.adicionarNovaAba();
        System.out.println("------------------------");
    }
}
