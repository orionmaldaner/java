/*. Escreva um programa que auxilie no controle da produção de cana de açúcar de uma usina. O
programa deve armazenar a quantidade de cana de açúcar estimada para processamento (em
toneladas), a quantidade que foi realmente processada na usina, o custo de produção e o
preço de venda da tonelada. Após isso, um relatório deve ser elaborado, contendo as
seguintes informações:
a) Quantidade de toneladas processadas.
b) Valor da tonelada.
c) Lucro da usina.
d) Capacidade de produção utilizada (processamento real dividido pelo processamento
estimado). */
public class ProducaoCana {
    private float quantEstimada; // toneladas
    private float quantProcessada; // toneladas
    private float custoProducao; // R$
    private float precoVenda; // tonelada

    public void setQuantEstimada(float quantEstimada) {
        this.quantEstimada = quantEstimada;
    }

    public float getQuantEstimada() {
        return quantEstimada;
    }

    public void setQuantProcessada(float quantProcessada) {
        this.quantProcessada = quantProcessada;
    }

    public float getQuantProcessada() {
        return quantProcessada;
    }

    public void setCustoProd(float custoProducao) {
        this.custoProducao = custoProducao;
    }

    public float getCustoProd() {
        return custoProducao;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }
}