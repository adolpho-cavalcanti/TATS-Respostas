package TDD;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acn20
 */
class Calculadora {
   public List<Proposta> calcular(float f) {
       ArrayList<Proposta> propostas = new ArrayList<>();
       Proposta p1 = new Proposta;
       p1.setTotal(2 * f);
       p1.setNumeroParcelas(2);
       p1.setValorParcela(800);
       propostas.add(p1);
   }
   
      public List<Proposta> calcular(float f) {
       Proposta p2 = new Proposta;
       p2.setTotal(2 * f);
       p2.setNumeroParcelas(3);
       p2.setValorParcela(533.33f);
       propostas.add(p2);
       
       return propostas;
      }
   

}
