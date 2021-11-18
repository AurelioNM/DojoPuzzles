package main.Dojo.CaixaEletronico.Teste;

import main.Dojo.CaixaEletronico.Main.Caixa;
import org.junit.Assert;
import org.junit.Test;

public class CaixaTeste {

    @Test
    public void saqueNormal() {
         Caixa testando = new Caixa();
         testando.sacar(100);
        Assert.assertTrue(testando.notasEQuantidades.containsKey(100));
        Assert.assertTrue(testando.notasEQuantidades.containsValue(1));
    }

    @Test
    public void todasNotas() {
         Caixa testando = new Caixa();
         testando.sacar(3480);
        Assert.assertTrue(testando.notasEQuantidades.containsKey(100));
        Assert.assertTrue(testando.notasEQuantidades.containsKey(50));
        Assert.assertTrue(testando.notasEQuantidades.containsKey(20));
        Assert.assertTrue(testando.notasEQuantidades.containsKey(10));
    }

    @Test
    public void notasEQuantidades() {
         Caixa testando = new Caixa();
         testando.sacar(1080);
        Assert.assertEquals(10, testando.notasEQuantidades.get(100).intValue());
        Assert.assertEquals(1, testando.notasEQuantidades.get(50).intValue());
        Assert.assertEquals(1, testando.notasEQuantidades.get(20).intValue());
        Assert.assertEquals(1, testando.notasEQuantidades.get(10).intValue());
    }
}
