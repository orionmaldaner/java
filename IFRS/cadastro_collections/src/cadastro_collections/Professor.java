
package cadastro_collections;

import java.util.ArrayList;

public class Professor implements Comparable<Professor>{
    String nome;
    double salario;
    int anoContratacao;

    public Professor(String nome, double salario, int anoContratacao) {
        this.nome = nome;
        this.salario = salario;
        this.anoContratacao = anoContratacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAnoContratacao() {
        return anoContratacao;
    }

    public void setAnoContratacao(int anoContratacao) {
        this.anoContratacao = anoContratacao;
    }

    @Override
    public String toString() {
        return "Professor [ " + "nome=" + nome + ", salario=" + salario + ", anoContratacao=" + anoContratacao + " ]\n";
    }
    
    //retorna lista ordenada pelo nome, forma simples, só com string
    /*@Override
    public int compareTo(Professor pro) {
        return this.nome.compareTo(pro.nome);
    }*/
    
    //listar == 4   retorna lista ordenada pelo ano
    /*public int compareTo(Professor comparepro) {
        int compareAno = ((Professor) comparepro).getAnoContratacao();
        //for ascending order
        //return this.anoContratacao-compareAno;
        //for descending order 
        return compareAno-this.anoContratacao;
    }*/
    
    //listar == 5   retorna lista ordenada pelo salario
    @Override
        public int compareTo(Professor comparePro) {
        int compareSal = (int) ((Professor) comparePro).getSalario();
        /*for ascending order
        return this.anoContratacao-compareAno;*/
        /*for descending order */
        return (int) (compareSal-this.salario);
    }

}
