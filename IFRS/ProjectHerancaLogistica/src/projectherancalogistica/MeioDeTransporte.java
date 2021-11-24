
package projectherancalogistica;

public class MeioDeTransporte {
    public double capacidadeCarga;
    //private int dias;

    public MeioDeTransporte(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    /*public int prazoEntrega(int dias) {
        this.dias = dias;
        return dias + 2;
    }
    */
    
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    //@Override
   // public String toString() {
   //     return "Meio de Transporte - capacidadeCarga kg: " + capacidadeCarga + "\n" ;
   // }
    
    
    
    
    
}
