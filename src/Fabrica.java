import AparelhoTelefonico.AparelhoTelefonico;
import Iphone.Iphone;
import NavegadorDeInternet.NavegadorDeInternet;
import ReprodutorMusical.ReprodutorMusical;

public class Fabrica {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        ReprodutorMusical reprodutor = iphone;
        NavegadorDeInternet navegador = iphone;
        AparelhoTelefonico telefone = iphone;

        reprodutor.Reprodutor();
        navegador.Navegador();
        telefone.Telefone();

    }
}
