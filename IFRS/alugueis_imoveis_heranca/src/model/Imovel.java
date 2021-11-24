
package model;
/*Elabore um programa para controlar o aluguel de imóveis. Existem três tipos de imóveis: 
i) loja comercial, 
ii) apartamento e 
iii) chácara para eventos. 
A loja possui uma identificação, endereço e tamanho (em m2). 
O apartamento possui identificação, endereço e a quantidade de quartos. A chácara possui uma identificação, endereço 
e a capacidade (quantidade máxima de pessoas que podem participar de um evento). O aluguel da loja comercial é 
calculado multiplicando-se o tamanho da loja por R$ 300,00. O aluguel do apartamento é calculado de acordo com o 
número de quartos (R$ 400,00 para cada quarto). O aluguel da chácara é calculado utilizando-se um valor padrão de 
R$ 1500,00 e somando-se uma taxa de R$ 60,00 para cada participante do evento. O programa deve cadastrar os imóveis e 
possibilitar que o valor do aluguel seja calculado*/
//aluguel coloco diretamente o valor para calculo, pq já está pre definido
public class Imovel {
    String id;
    String endereco;
    double aluguel;


    public Imovel(String id, String endereco, double aluguel) {
        this.id = id;
        this.endereco = endereco;
        this.aluguel = aluguel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getAluguel() {
        return aluguel;
    }

    public void setAluguel(double aluguel) {
        this.aluguel = aluguel;
    }
    public double calcAluguel() {
        return getAluguel(); 
    }

    @Override
    public String toString() {
        return "Imovel{" + "id=" + id + ", endereco=" + endereco + ", aluguel=" + aluguel + '}';
    }  
    
    
}
