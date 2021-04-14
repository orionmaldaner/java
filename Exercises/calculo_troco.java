import java.util.Scanner;
import java.util.*;

/*“Uma lanchonete precisa, em um determinado momento, calcular o total da conta de uma mesa e, dado o valor pago pelos clientes,
calcular o troco. Os dados disponíveis, além do valor pago pelos clientes, são o valor total consumido em bebidas e o total consumido em alimentos.
Sabe-se também que, como padrão, também é incluído na conta a gorjeta do garçom, no valor correspondente a 10% do total da conta. É preciso
escrever um algoritmo que reporte o valor total da conta, o valor total pago
pelos clientes e o valor do troco.”. Construção de algoritmos-Jander Moreira-DC-UFSCar */

public class calculo_troco {
    public static void main(String[] args) {
        double totalBebidas, totalAlimentos, totalMesa, totComGorjeta, valorPago, troco;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Total dos alimentos: ");
        totalAlimentos = scanner.nextDouble();
        System.out.println("Total das bebidas: ");
        totalBebidas = scanner.nextDouble();
        System.out.println("Valor pago: ");
        valorPago = scanner.nextDouble();

        totalMesa = totalAlimentos + totalBebidas;
        totComGorjeta = (totalAlimentos + totalBebidas) * 1.1;
        troco = valorPago - totComGorjeta;

        System.out.printf("Valor total consumido: " + "%.2f", totalMesa);
        System.out.println();
        System.out.printf("Valor total da conta: " + "%.2f", totComGorjeta);
        System.out.println();
        System.out.println("Valor pago: " + valorPago);

        if (troco < 0) {
            System.out.println("\nValor pago é insuficiente\n");
        } else {
            System.out.print("Valor do troco: ");
            System.out.printf("%.2f", troco); // imprime com somente duas casas decimais
        }

    }
}
