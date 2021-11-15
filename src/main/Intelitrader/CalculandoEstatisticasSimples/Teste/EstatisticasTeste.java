package main.Intelitrader.CalculandoEstatisticasSimples.Teste;

import main.Intelitrader.CalculandoEstatisticasSimples.Main.Estatisticas;
import org.junit.Assert;
import org.junit.Test;

public class EstatisticasTeste {

    @Test
    public void MaiorNumeroCasoNormal(){
        Estatisticas stats = new Estatisticas();
        stats.constroiLista(4, -4, 31, 525, -5232);
        stats.maiorNumero();

        Assert.assertEquals(525, stats.maximo);
    }

    @Test
    public void MaiorNumeroComMaxMinInt(){
        Estatisticas stats = new Estatisticas();
        stats.constroiLista(4, Integer.MAX_VALUE, Integer.MIN_VALUE, 525, -5232);
        stats.maiorNumero();

        Assert.assertEquals(Integer.MAX_VALUE, stats.maximo);
    }


    @Test
    public void MenorNumeroCasoNormal(){
        Estatisticas stats = new Estatisticas();
        stats.constroiLista(3134, -534, 3531, 525, -32);
        stats.menorNumero();

        Assert.assertEquals(-534, stats.minimo);
    }

    @Test
    public void MenorNumeroComMaxMinInt(){
        Estatisticas stats = new Estatisticas();
        stats.constroiLista(4, Integer.MAX_VALUE, Integer.MIN_VALUE, 525, -5232);
        stats.menorNumero();

        Assert.assertEquals(Integer.MIN_VALUE, stats.minimo);
    }

    @Test
    public void MediaCasoNormal(){
        Estatisticas stats = new Estatisticas();
        stats.constroiLista(512,-35,25,-5,-135);
        stats.calculaMedia();

        Assert.assertEquals(72.4, stats.media, 0.01);
    }

    @Test
    public void MediaComMaxMinInt(){
        Estatisticas stats = new Estatisticas();
        stats.constroiLista(Integer.MIN_VALUE,-35,25,Integer.MAX_VALUE,-135);
        stats.calculaMedia();

        Assert.assertEquals(-29.2, stats.media, 0.01);
    }

    @Test
    public void Quantidade(){
        Estatisticas stats = new Estatisticas();
        stats.constroiLista(512,-35,25,-5,-135);
        stats.calculaQuantidade();

        Assert.assertEquals(5, stats.quantidadeNumeros);
    }

    @Test
    public void CalculandoTudo() {
        Estatisticas stats = new Estatisticas();
        stats.constroiLista(-213, 9090, -324, 1021, 23);
        stats.calculaTudo();

        Assert.assertEquals(9090, stats.maximo);
        Assert.assertEquals(-324, stats.minimo);
        Assert.assertEquals(1919.4, stats.media, 0.1);
        Assert.assertEquals(5, stats.quantidadeNumeros);

    }
}
