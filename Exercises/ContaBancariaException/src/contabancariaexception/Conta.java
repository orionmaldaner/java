
package contabancariaexception;
public class Conta {

    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
        // this.valorSaque = valorSaque;
        // this.valorDeposito = valorDeposito;
    }

    public double deposito(double valorDeposito) {
        saldo = saldo + valorDeposito;
        return saldo;
    }

    public double saque(double valorSaque) {
        saldo = saldo - valorSaque;
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    /*
     * public String sacar(double valor) {
     * 
     * double valor = valor; if (valor <= 0) { throw new IllegalArgumentException();
     * } else if (valor > getSaldo()) { throw new NumberFormatException(); } else {
     * return saque(valor); }
     * 
     * }
     */

}
