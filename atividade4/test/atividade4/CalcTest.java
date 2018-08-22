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
    public void calcularSalario() {
        Funcionario f = new Funcionario();
        f.setNome("Jose");
        f.setEmail("jose@gmail.com");
        f.setSalarioBase(5000.0f);
        f.setCargo("DESENVOLVEDOR");
        assertEquals(4000f, f.calcular(),0.01);
    }
}
