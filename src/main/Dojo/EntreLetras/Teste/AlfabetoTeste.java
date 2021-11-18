package main.Dojo.EntreLetras.Teste;


import main.Dojo.EntreLetras.Main.Alfabeto;
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
    public void ordemNormal() {
        Alfabeto alfabeto = new Alfabeto();
        alfabeto.constroiMapa();
        alfabeto.calculoEntreLetras('a', 'z');
    }

    @Test
    public void ordemNormal2() {
        Alfabeto alfabeto = new Alfabeto();
        alfabeto.constroiMapa();
        alfabeto.calculoEntreLetras('f', 'r');
        Assert.assertEquals(11, alfabeto.dif);
    }

    @Test
    public void duasLetrasEmCapslock() {
        Alfabeto alfabeto = new Alfabeto();
        alfabeto.constroiMapa();
        alfabeto.calculoEntreLetras('D', 'v');
        Assert.assertEquals(17, alfabeto.dif);
    }

    @Test
    public void umaLetraEmCapslock() {
        Alfabeto alfabeto = new Alfabeto();
        alfabeto.constroiMapa();
        alfabeto.calculoEntreLetras('G', 'p');
        Assert.assertEquals(8, alfabeto.dif);
    }

    @Test
    public void foraDaOrdemAlfabetica() {
        Alfabeto alfabeto = new Alfabeto();
        alfabeto.constroiMapa();
        alfabeto.calculoEntreLetras('d', 'a');
        Assert.assertEquals(2, alfabeto.dif);
    }

    @Test
    public void foraDaOrdemAlfabetica2() {
        Alfabeto alfabeto = new Alfabeto();
        alfabeto.constroiMapa();
        alfabeto.calculoEntreLetras('d', 'c');
        Assert.assertEquals(0, alfabeto.dif);
    }

    @Test
    public void letrasIguais() {
        Alfabeto alfabeto = new Alfabeto();
        alfabeto.constroiMapa();
        alfabeto.calculoEntreLetras('g', 'g');
        Assert.assertEquals(0, alfabeto.dif);
    }

}
