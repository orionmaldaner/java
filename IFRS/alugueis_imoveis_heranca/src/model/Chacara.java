
package model;

public class Chacara extends Imovel{
    private int participantes;
    

    public Chacara(int participantes, String id, String endereco, double aluguel) {
        super(id, endereco, aluguel);
        this.participantes = participantes;
    }

    public int getParticipantes() {
        return participantes;
    }

    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }

    @Override
    public double calcAluguel() {
        return super.getAluguel() + (participantes * 60); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Chacara: id: "  + id + ", endereço: " + endereco + ", participantes: " + participantes + ", aluguel: " + aluguel;
    }
    
    
}
