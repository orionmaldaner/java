
package metodosjava;

//calcular emprestimo com taxas e parcelas

public class Emprestimo {
    public static void calculoEmprestimo(double valor, int parcelas) {
        
        if (parcelas == 2) {
            double res = valor + (valor * getTaxaDuasParc());
            System.out.println("Total: " + res);
        }
        else if (parcelas == 3) {
            double res = valor + (valor * getTaxaTresParc());
            System.out.println("Total: " + res);
        }
        else {
            System.out.println("Número de parcelas inválido!");
        }
    }
    
    public static double getTaxaDuasParc() {
        return 0.3;
    }
    public static double getTaxaTresParc() {
        return 0.5;
    }
    
    public static int getDuasParcelas() {
        return 2;
    }
}
