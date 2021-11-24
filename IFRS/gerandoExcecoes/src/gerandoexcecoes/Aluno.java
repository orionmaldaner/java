
package gerandoexcecoes;
/*1.   Escreva um programa que armazene as notas dos estudantes para uma determinada disciplina. 
        As seguintes funcionalidades devem ser implementadas:
a)     Armazenar as informações dos estudantes: número de matrícula, nome, email.
b)     Armazenar as notas dos estudantes: nota1 e nota2.
c)     Calcular a média aritmética das notas.
d)     Permitir a busca de um determinado estudante por meio do número de matrícula. 
e)     Exibir as notas e média do aluno.
Observação: O tratamento de exceções deve ser utilizado para garantir que notas negativas não sejam atribuídas aos estudantes. 
Notas acima de 10 também não devem ser permitidas. As exceções devem ser utilizadas também para lidar com buscas que não 
retornem resultados (não encontre um estudante associado ao número de matrícula informado).*/
public class Aluno {
    private int numMatricula;
    private String nome;
    private String email;
    private double nota1;
    private double nota2;
    private double media;

    public Aluno(int numMatricula, String nome, String email) {
        this.numMatricula = numMatricula;
        this.nome = nome;
        this.email = email;
    }

    public Aluno(int numMatricula, String nome, String email, double nota1, double nota2) {
        this.numMatricula = numMatricula;
        this.nome = nome;
        this.email = email;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return "Aluno: " + "Matricula= " + numMatricula + ", nome= " + nome + ", email= " + email + ", nota 1= " + nota1 + ", nota 02= " + nota2 + "\n";
    }

    public double media(int matricula) {
        return (nota1 + nota2) / 2;
    }
    
    
    //getter and setter
    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    
}
