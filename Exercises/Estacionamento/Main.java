public class Main {
    public static void main(String[] args) {
        double valorHora = 10;
        double horasTotal, valorComDesc;

        Estacionamento e1 = new Estacionamento();
        e1.descricao = "Gol branco";
        e1.placa = "abc1234";
        e1.horaEntrada = 10;
        e1.horaSaida = 15;
        horasTotal = e1.horaSaida - e1.horaEntrada;
        e1.valorTotal = 10 + ((horasTotal - 1) * (valorHora / 3));

        if (e1.valorTotal <= 20) {
            valorComDesc = e1.valorTotal * 0.95;
        } else if (e1.valorTotal <= 50) {
            valorComDesc = e1.valorTotal * 0.90;
        } else {
            valorComDesc = e1.valorTotal * 0.80;
        }

        System.out.println("Tipo do veículo: " + e1.descricao);
        System.out.println("Placa: " + e1.placa);
        System.out.println("Hora da entrada: " + e1.horaEntrada);
        System.out.println("Hora da saída: " + e1.horaSaida);
        System.out.printf("Valor total: R$ " + "%.2f", e1.valorTotal);
        System.out.printf("\nValor com desconto aplicado: R$ " + "%.2f", valorComDesc);
    }
}
