package main.Intelitrader.EntreLetras.Teste;


import main.Intelitrader.EntreLetras.Main.Alfabeto;
import org.junit.Assert;
import org.junit.Test;

public class AlfabetoTeste {

    @Test
    public void tamanhoDoMapa() {
        Alfabeto alfabeto = new Alfabeto();
        alfabeto.constroiMapa();
        Assert.assertEquals(26, alfabeto.mapa.size());
    }

    @Test
    public void comparandoMapa() {
        Alfabeto alfabeto = new Alfabeto();
        alfabeto.constroiMapa();
        Alfabeto alfabetoEsperado = new Alfabeto();
        alfabetoEsperado.constroiMapa();
        Assert.assertEquals(alfabetoEsperado.mapa, alfabeto.mapa);
    }

    @Test
    public void sadsadsd() {
        Alfabeto alfabeto = new Alfabeto();
        alfabeto.constroiMapa();
        Alfabeto alfabetoEsperado = new Alfabeto();
        alfabetoEsperado.constroiMapa();

        Assert.assertEquals(alfabetoEsperado.mapa, alfabeto.mapa);
    }

    @Test
    public void duasLetrasNormais() {
        Alfabeto alfabeto = new Alfabeto();
        alfabeto.constroiMapa();
        alfabeto.recebeLetras('g', 'a');
    }

}
