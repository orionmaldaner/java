
package projectherancalogistica;

public class Caminhao extends MeioDeTransporte {
    private int numeroEixos;
    private String placa;
    private String cor;
    private int prazo;

    public Caminhao(int numeroEixos, String placa, String cor, double capacidadeCarga, int prazo) {
        super(capacidadeCarga);
        this.numeroEixos = numeroEixos;
        this.placa = placa;
        this.cor = cor;
        this.prazo = prazo;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    @Override
    public String toString() {
        return "Caminhao - numeroEixos: " + numeroEixos + ", placa: " + placa + ", cor: " + cor + ", capacidade: " + capacidadeCarga +  ", dias estimados para a entrega: " + prazo + "\n";
    }
    
    
    
    
    
}
