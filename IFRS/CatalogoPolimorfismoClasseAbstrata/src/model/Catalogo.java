
package model;
/*Elabore um programa para catalogar livros, CDs e DVDs. Os dados comuns dos itens são: identificação única, descrição, 
ano de aquisição e lista de autores. É necessário que os dados específicos sejam armazenados também, da seguinte maneira:
- Para livros, a editora e o ano de publicação.
- Para CDs, o gênero musical e a identificação das faixas.
- Para DVDs, o tipo (musical ou filme) e se existem extras.
Utilize Classes Abstratas.*/
public abstract class Catalogo {
    private String id;
    private String descricao;
    private int anoAquisicao;
    private String autores;

    public Catalogo(String id, String descricao, int anoAquisicao, String autores) {
        this.id = id;
        this.descricao = descricao;
        this.anoAquisicao = anoAquisicao;
        this.autores = autores;
    }

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getAnoAquisicao() {
        return anoAquisicao;
    }

    public String getAutores() {
        return autores;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAnoAquisicao(int anoAquisicao) {
        this.anoAquisicao = anoAquisicao;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    //posso ter um metodo abstract, mas esse nao pode ter corpo
    
    @Override
    public String toString() {
        return "Catalogo{" + "id=" + id + ", descricao=" + descricao + ", anoAquisicao=" + anoAquisicao + ", autores=" + autores + '}';
    }
    
}
