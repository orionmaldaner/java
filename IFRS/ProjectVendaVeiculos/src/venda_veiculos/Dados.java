
package venda_veiculos;

import java.util.ArrayList;

public class Dados {
    
    
    ArrayList<Cliente> clientes = new ArrayList();

    ArrayList<Veiculo> veiculos = new ArrayList();
    
    public void criarClientes(){                                                //metodo cria clientes ao iniciar programa
        Cliente cliente1 = new Cliente("Alan","alan@gmail.com", "1258469755");
        Cliente cliente2 = new Cliente("Bruna","bruna@gmail.com", "3338469755");
        Cliente cliente3 = new Cliente("Anna","alan@gmail.com", "5558469755");
        Cliente cliente4 = new Cliente("Jose","jose@gmail.com", "9998469755");

        cadastrarCliente(cliente1);
        cadastrarCliente(cliente2);
        cadastrarCliente(cliente3); 
        cadastrarCliente(cliente4);
    }
    
    public void criarVeiculos() {
        Veiculo veiculo1 = new Veiculo("Gol", "2018", "Manual", 30000, CorEnum.BRANCO);
        Veiculo veiculo2 = new Veiculo("Ka", "2020", "Automatico", 40000, CorEnum.VERMELHO);
        Veiculo veiculo3 = new Veiculo("Civic", "2021", "Automatico", 100000, CorEnum.PRETO);
        
        veiculos.add(veiculo1);
        veiculos.add(veiculo2);
        veiculos.add(veiculo3);
    }
    
    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    public void cadastrarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public String numeroClientes() {
        return clientes.size() + "";
    }

    public String numeroVeiculos() {
        return veiculos.size() + "";
    }

    @Override                   //imprime quando chama System.out.println(dados.clientes); ou dados.veiculos
    public String toString() {
        return "Dados{" + "clientes=" + clientes + ", veiculos=" + veiculos + '}';
    }



    




    
    
    

}
