package Iphone;

import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorDeInternet.NavegadorDeInternet;
import ReprodutorMusical.ReprodutorMusical;
import ReprodutorMusical.Tocar;

public class Iphone implements ReprodutorMusical, NavegadorDeInternet, AparelhoTelefonico {

    @Override
    public void Reprodutor() {
        System.out.println("Iniciado reprodutor musical no iphone");
    }

    @Override
    public void Navegador() {
        System.out.println("Iniciado navegador de internet");
    }

    @Override
    public void Telefone() {
        System.out.println("Iniciado aparelho telefonico");
    }

    public static void main(String[] args) {

        Tocar tocador = new Tocar();

        tocador.Reprodutor();
    }

}
