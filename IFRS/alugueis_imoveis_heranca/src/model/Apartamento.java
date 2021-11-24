
package model;

public class Apartamento extends Imovel{
    private int quartos;

    public Apartamento(int quartos, String id, String endereco, double aluguel) {
        super(id, endereco, aluguel);
        this.quartos = quartos;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    @Override
    public double calcAluguel() {
        return super.getAluguel() * quartos; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Apartamento: id: "  + id + ", endereço: " + endereco + ", quant quartos: " + quartos + ", aluguel: " + aluguel;
    }
    
    
    
    
    
    
    
}
