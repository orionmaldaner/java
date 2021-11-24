
package contabancariaexception;
import java.util.Scanner;
import java.text.DecimalFormat;

public class TesteConta {
    public static void main(String[] args) {

        int comando;
        double valor;
        Conta c1 = new Conta(10000.22);

        System.out.println("Escolha uma opÃ§Ã£o: \n1 - Ver saldo \n2 - Depositar \n3 - Sacar");

        Scanner sc = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat();
        f.applyPattern("R$ #,##0.00");

        comando = sc.nextInt();
        if (comando == 1) {
            System.out.println("Saldo: " + f.format(c1.getSaldo()));

        } else if (comando == 2) {
            System.out.println("Digite o valor de depÃ³sito: ");
            valor = sc.nextDouble();
            try {
                if (valor <= 0) {
                    // exception declared, will be launched if enter in the if
                    throw new IllegalArgumentException();
                } else {

                    c1.deposito(valor);
                    System.out.println("Deposito efetuado! Saldo atual: " + f.format(c1.getSaldo()));
                }
                // "catch" will be executed, if enter in the exception if
            } catch (IllegalArgumentException e) {
                System.out.println("Valor para depÃ³sito invÃ¡lido! Valor deve ser positivo!");
            }

        } else if (comando == 3) {
            System.out.println("Digite o valor para saque: ");
            valor = sc.nextDouble();
            try {
                if (valor <= 0) {
                    throw new IllegalArgumentException();
                } else if (valor > c1.getSaldo()) {
                    throw new NumberFormatException();
                } else {
                    c1.saque(valor);
                    System.out.printf("Saque realizado com sucesso!\n" + "Saldo atual: " + f.format(c1.getSaldo()));
                }
            } catch (NumberFormatException e) {
                System.out.println("Saldo insuficiente, valor disponivel: " + c1.getSaldo());
            } catch (IllegalArgumentException e) {
                System.out.println("Valor para saque invÃ¡lido! Valor deve ser positivo!");
            }

        } else

        {
            System.out.println("Comando invÃ¡lido!!");
        }

    }
}
// throw new RuntimeException(); mae de todas excecoes. Desvantagem de ser muito
// generica