public class Main {
    public static void main(String[] args) {

        float prodUtilizada, lucro;

        ProducaoCana p1 = new ProducaoCana();
        p1.setQuantEstimada(100);
        p1.setQuantProcessada(90);
        p1.setCustoProd(30000);
        p1.setPrecoVenda(500); // preco da tonelada
        // calculos
        lucro = (p1.getQuantProcessada() * p1.getPrecoVenda()) - p1.getCustoProd();
        prodUtilizada = 100 * (p1.getQuantProcessada() / p1.getQuantEstimada());

        System.out.println("Quantidade de toneladas processadas: " + p1.getQuantProcessada());
        System.out.println("Valor da tonelada: R$ " + p1.getPrecoVenda());
        System.out.println("Lucro: R$ " + lucro);
        System.out.println("Capacidade de produção utilizada: " + prodUtilizada + "%");
    }
}
