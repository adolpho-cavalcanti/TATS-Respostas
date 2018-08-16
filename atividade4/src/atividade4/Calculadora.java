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
    Funcionario f = new Funcionario();
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.setCargo("Desenvolvedor");
        f.setEmail("jose@jose.com");
        f.setNome("jose");
        f.setSalarioBase(100.0f);
    
        if(f.Cargo.equalsIgnoreCase("Desenvolvedor")) {
            double salLiq = f.salarioBase * 0.8;
        }
        System.out.println("salario liquido eh: ", + f.getSalarioBase());
    }
}
