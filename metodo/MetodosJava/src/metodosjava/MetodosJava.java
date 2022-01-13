
package metodosjava;
import java.util.Scanner;

public class MetodosJava {

    public static void main(String[] args) {
        
//calculadora
        double n3, n4, n5, n6;
        Scanner sc = new Scanner(System.in);

        Calculadora.soma(10, 20);

        System.out.println("Digite os valores para subtração: ");
        n3 = sc.nextDouble();
        n4 = sc.nextDouble();
        Calculadora.sub(n3, n4);
        
        System.out.println("Digite os valores para divisão: ");
        n5 = sc.nextDouble();
        n6 = sc.nextDouble();
        Calculadora.div(n5, n6);
        
        Calculadora.mult(4, 7);
        
        
        //hora
        Mensagem.mensagemHora(3);
        Mensagem.mensagemHora(14);
        Mensagem.mensagemHora(21);
        
        
        //emprestimo
        Emprestimo.calculoEmprestimo(500, Emprestimo.getDuasParcelas());
        Emprestimo.calculoEmprestimo(1000, 3);
        Emprestimo.calculoEmprestimo(1000, 5);
        
    }
    
}
