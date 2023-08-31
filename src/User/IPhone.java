package User;

import Browser.NavegadorInternet;
import Musica.ReprodutorMusical;
import Telefone.AparelhoTelefonico;

public class IPhone extends AparelhoTelefonico implements ReprodutorMusical, NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO A PÁGINA");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO UMA NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PAGINA");
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO A MÚSICA");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO UMA MÚSICA");
    }
}
