
package projectherancalogistica;

public class Barco extends MeioDeTransporte {
    private int comprimento;    //metros
    private int largura;        //metros
    private String bandeira;
    private int numTripulantes;
    private int prazo;

    public Barco(int comprimento, int largura, String bandeira, int numTripulantes, double capacidadeCarga, int prazo) {
        super(capacidadeCarga);
        this.comprimento = comprimento;
        this.largura = largura;
        this.bandeira = bandeira;
        this.numTripulantes = numTripulantes;
        this.prazo = prazo;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public int getNumTripulantes() {
        return numTripulantes;
    }

    public void setNumTripulantes(int numTripulantes) {
        this.numTripulantes = numTripulantes;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    @Override
    public String toString() {
        return "Barco - comprimento: " + comprimento + ", largura: " + largura + ", bandeira: " + bandeira + ", numTripulantes: " + numTripulantes + ", capacidade: " + capacidadeCarga +  ", dias estimados para a entrega: " + prazo + "\n";
    }
    
    
    
    
}
