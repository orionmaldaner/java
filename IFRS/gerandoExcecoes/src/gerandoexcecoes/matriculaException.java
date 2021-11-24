
package gerandoexcecoes;

public class matriculaException extends Exception {
    protected double n1;
    protected double n2;
    
    public matriculaException(double n1, double n2) {
        super();
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return "Um ou mais valores inválidos: " + "nota 1 = " + n1 + " e nota 2 = " + n2 + " não está entre 0 e 10";
    }
    

    
}
//faco varias exceptions separadas, cada uma em uma classe ou posso colocar todas numa mesma classe?