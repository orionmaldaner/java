
package model;

public class Livro extends Catalogo{
    private String editora;
    private int anoPublicacao;

    public Livro(String id, String descricao, int anoAquisicao, String autores, String editora, int anoPublicacao) {
        super(id, descricao, anoAquisicao, autores);
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro: " + "editora=" + editora + ", anoPublicacao=" + anoPublicacao + ", id=" + getId() + ", descricao=" + getDescricao() + ", anoAquisicao=" + getAnoAquisicao() + ", autores=" + getAutores() ;
    }
    
    
}
