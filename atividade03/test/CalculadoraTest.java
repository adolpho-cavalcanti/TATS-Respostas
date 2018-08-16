

import TDD.Proposta;
import TDD.Calculadora;
import junit.framework.Assert;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acn20
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {}
    
    @Test
    public void testeLimite1000() {
        Calculadora c = New Calculadora();
        List<Proposta> propostas = c.calcular(800.00f);
        Assert.assertEquals(2, propostas.size());
        
        Proposta p1 = propostas.get(0);
        Proposta p2 = propostas.get(1);
    }
    
    assertEquals(1600f, p1.getTotal(), 0.01);
    assertEquals(2, p1.NumeroParcelas());
    assertEquals(800f, p1.ValorParcela(), 0.01);
    
    assertEquals(1600f, p1.getTotal(), 0.01);
    assertEquals(3, p1.NumeroParcelas());
    assertEquals(533.33f, p1.ValorParcela(), 0.01);
    
}
