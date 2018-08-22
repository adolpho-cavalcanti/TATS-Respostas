package atividade4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author acn20
 */
public class CalcTest {
    
    @Test
    public void calcularSalarioDesenvolvedor() {
        Funcionario f = new Funcionario();
        Calculadora c = new Calculadora();
        f.setNome("Jose");
        f.setEmail("jose@gmail.com");
        f.setSalarioBase(5000.0f);
        f.setCargo("DESENVOLVEDOR");
        assertEquals(4000f, c.calcular(f),0.01);
    }
    
    @Test
    public void calcularSalarioDBA() {
        Funcionario f = new Funcionario();
        Calculadora c = new Calculadora();
        f.setNome("Joao");
        f.setEmail("joao@gmail.com");
        f.setSalarioBase(10000.0f);
        f.setCargo("DBA");
        assertEquals(7500f, c.calcular(f),0.01);
    }
    
    @Test
    public void calcularSalarioTestador() {
        Funcionario f = new Funcionario();
        f.setNome("Dagu");
        f.setEmail("dadu@gmail.com");
        f.setSalarioBase(1000.0f);
        f.setCargo("TESTADOR");
        assertEquals(850f, f.calcular(),0.01);
    }
}
