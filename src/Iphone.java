import java.sql.SQLOutput;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public Iphone() {
    }

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO COM IPHONE");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO COM IPHONE");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ COM IPHONE");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PAGINA COM IPHONE");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA COM IPHONE");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA COM IPHONE");
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA COM IPHONE");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANOD MUSICA COM IPHONE");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MUSICA COM IPHONE");
    }

    public static void main(String[] args) {
        Iphone iphone_cel = new Iphone();
        iphone_cel.adicionarNovaAba();
        iphone_cel.atualizarPagina();
        iphone_cel.exibirPagina("https.app.com");

        iphone_cel.atender();
        iphone_cel.ligar("999999999");
        iphone_cel.iniciarCorreioVoz();

        iphone_cel.tocar();
        iphone_cel.pausar();
        iphone_cel.selecionarMusica("Love");
    }
}
