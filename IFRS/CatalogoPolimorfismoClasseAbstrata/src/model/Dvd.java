
package model;

public class Dvd extends Catalogo {
    String tipo;
    String extra;

    public Dvd(String tipo, String Extra, String id, String descricao, int anoAquisicao, String autores) {
        super(id, descricao, anoAquisicao, autores);
        this.tipo = tipo;
        this.extra = Extra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        
        return "DVD: " + "tipo=" + tipo + ", extra=" + extra + ", id=" + getId() + ", descricao=" + getDescricao() + ", anoAquisicao=" + getAnoAquisicao() + ", autores=" + getAutores() +"\n";

    }
    
    
    
}
