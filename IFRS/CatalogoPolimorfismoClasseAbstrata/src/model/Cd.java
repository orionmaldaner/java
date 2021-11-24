
package model;

public class Cd extends Catalogo{
    private String genero;
    private String faixas;

    public Cd(String genero, String faixas, String id, String descricao, int anoAquisicao, String autores) {
        super(id, descricao, anoAquisicao, autores);
        this.genero = genero;
        this.faixas = faixas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFaixas() {
        return faixas;
    }

    public void setFaixas(String faixas) {
        this.faixas = faixas;
    }

    @Override
    public String toString() {
        return "Cd: " + "genero=" + genero + ", faixas=" + faixas + ", id=" + getId() + ", descricao=" + getDescricao() + ", anoAquisicao=" + getAnoAquisicao() + ", autores=" + getAutores();
    }
    
}
