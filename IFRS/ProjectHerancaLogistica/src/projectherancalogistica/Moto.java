/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectherancalogistica;

/**
 *
 * @author knowdive
 */
public class Moto extends MeioDeTransporte {
    private int prazo;
    
    public Moto(double capacidadeCarga, int prazo) {
        super(capacidadeCarga);
        this.prazo = prazo;
    }
    
        @Override
    public String toString() {
        return "Moto - capacidade: " + capacidadeCarga + ", dias estimados para a entrega: " + prazo +  "\n";
    }
    
    
    
}
