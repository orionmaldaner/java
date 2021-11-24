
package model;

public class LojaComercial extends Imovel{
    private double metros;
    
    public LojaComercial(String id, String endereco, double metros, double aluguel) {
        super(id, endereco, aluguel);
        this.metros = metros;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    /**
     *
     * @return
     */
    @Override
    public double calcAluguel() {
        return super.getAluguel() * metros; 
    }

    @Override
    public String toString() {
        return "Loja comercial: id: "  + id + ", endereço: " + endereco + ", m²: " + metros + ", aluguel: " + aluguel;
    }

    


    
    
    
    
    
    
    
    
    
}
