/*Crie um programa que gerencie um estacionamento rotativo de carros. O programa deve
armazenar a descrição do carro, a placa, o horário de entrada e o horário de saída (despreze
os minutos). O estacionamento cobra X reais pela primeira hora de permanência com o
automóvel e X/3 pelas demais horas. Além disso, é fornecido um desconto para o pagamento
de acordo com a tabela abaixo: 
Valor Desconto (%)
Até R$ 20 (inclusive) 5
Entre R$ 20 e R$ 50 (inclusive) 10
Acima de R$ 50 20
O programa deve exibir um relatório contendo as seguintes informações:
a) Tipo do carro.
b) Placa.
c) Hora da Entrada.
d) Hora da Saída.
e) Valor Pago. */

public class Estacionamento {
    String descricao, placa;
    int horaEntrada, horaSaida;
    double valorTotal;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(int horaSaida) {
        this.horaSaida = horaSaida;
    }

    public double getValor() {
        return valorTotal;
    }

    public void setValor(double valor) {
        this.valorTotal = valor;
    }
}