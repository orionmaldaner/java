package venda_veiculos;

import java.util.ArrayList;

//semana 05
//Escreva um programa que realize a venda de veículos. Cada veículo possui as seguintes características: modelo, cor, ano de fabricação, tipo de transmissão 
//(manual/automática) e valor. Após selecionar um cliente cadastrado (possui nome, e-mail e cpf) e os itens (veículos) que ele pretende comprar, mostre o valor total 
//da compra e liste os veículos comprados pelo cliente. O programa deve permitir o cadastro de clientes, veículos e vendas.
//Observação: Utilize enumerações

public class Cliente {


    private String nome;
    private String email;
    private String cpf;
    
    public Cliente(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    
    
    //@Override
    //public String toString() {
    //    return nome + ", email: " + email + ", cpf: " + cpf +"\n";
    //}

    
    
    
}
