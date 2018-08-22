/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade4;

/**
 *
 * @author acn20
 */
public class Calculadora {
    public static double calcular(Funcionario f) {
        double sal = f.getSalarioBase();
        if(f.getCargo().equalsIgnoreCase("DESENVOLVEDOR")) {
            if(sal >= 3000)
                return sal * 0.8;
            else 
                return sal * 0.9;
        } else if(f.getCargo().equalsIgnoreCase("DBA")) {
            if(sal >= 2000)
                return sal * 0.75;
            else 
                return sal * 0.85;
        } else if(f.getCargo().equalsIgnoreCase("TESTADOR")) {
            if(sal >= 2000)
                return sal * 0.75;
            else 
                return sal * 0.85;
        } else if(f.getCargo().equalsIgnoreCase("GERENTE")) {
            if(sal >= 2000)
                return sal * 0.70;
            else 
                return sal * 0.80;
        }
        return sal;

    }
}
