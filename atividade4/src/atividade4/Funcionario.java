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
public class Funcionario {
    String nome;
    String email;
    float salarioBase;
    String Cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    /*public double calcular() {
        double sal = this.getSalarioBase();
        if(this.getCargo().equalsIgnoreCase("DESENVOLVEDOR")) {
            if(sal >= 3000)
                return sal * 0.8;
            else 
                return sal * 0.9;
        } 
        else if(this.getCargo().equalsIgnoreCase("DBA")) {
            if(sal >= 2000)
                return sal * 0.75;
            else 
                return sal * 0.85;
        } 
        return sal;
    }*/
   
}
