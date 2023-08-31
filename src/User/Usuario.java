package User;

public class Usuario {

    public static void main(String[] args) {

        System.out.println("Adquirindo um novo iPhone!");
        IPhone phone = new IPhone();

        System.out.println("//////////////////////////////////////////////////////////////////////////////////");
        phone.ligar();

        System.out.println("Recebendo ligação de um número desconhecido!");
        phone.atender();
        System.out.println("Não atendeu a ligação a tempo, nova mensagem no correio de voz!");
        phone.iniciarCorreioVoz();

        System.out.println("//////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Abre o browser para baixar música e um reprodutor de música!");
        phone.exibirPagina();
        phone.adicionarNovaAba();
        System.out.println("Seleciona um reprodutor de música e uma playlist de música para baixar e confirma!");
        phone.atualizarPagina();

        System.out.println("//////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Abre o reprodutor de música!");
        phone.selecionarMusica();
        phone.tocar();
        phone.pausar();
    }
}
