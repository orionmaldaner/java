
package cadastro_collections;

public class Aluno implements Comparable<Aluno>{
    String nome;
    String numMatricula;
    double media;

    public Aluno(String nome, String numMatricula, double media) {
        this.nome = nome;
        this.numMatricula = numMatricula;
        this.media = media;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumMatricula() {
        return this.numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    public double getMedia() {
        return this.media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    //FUNCIONA SOMENTE COM STRING
    
    //@Override
    //public int compareTo(Aluno o) {
    //    return this.numMatricula.compareTo(o.numMatricula);
    //}
    
        @Override
        public int compareTo(Aluno compareAlu) {
        int compareMed = (int) ((Aluno) compareAlu).getMedia();
        /*for ascending order
        return this.anoContratacao-compareAno;*/
        /*for descending order */
        return (int) (compareMed-this.media);
    }
    /*
    @Override
    public int compareTo(Aluno nom) {
        return this.numMatricula.compareTo(nom.numMatricula);
    }*/

    @Override
    public String toString() {
        return "[ nome= " + nome + ", numMatricula= " + numMatricula + ", media= " + media + " ]\n";
    }
    
}
