package iphone;

import iphone.funcionalidade.AparelhoTelefonico;
import iphone.funcionalidade.NavegadorInternet;
import iphone.funcionalidade.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void pausar() {
        System.out.println("MÚSICA PAUSADA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("MÚSICA '" + musica + "' SELECIONADA");
    }

    @Override
    public void tocar() {
        System.out.println("MÚSICA TOCANDO");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO CHAMADA");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA O NÚMERO " + numero);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PÁGINA");
    }
    
}
