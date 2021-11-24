
package projectherancalogistica;

public class Aviao extends MeioDeTransporte {
    private double autonomia; //em km
    private int prazo;

    public Aviao(double autonomia, double capacidadeCarga, int prazo) {
        super(capacidadeCarga);
        this.autonomia = autonomia;
        this.prazo = prazo;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    @Override
    public String toString() {
        return "Aviao - autonomia: " + autonomia + ", capacidade kg: " + capacidadeCarga + ", dias estimados para a entrega: " + prazo + "\n";
    }


    
    
    
    
}
