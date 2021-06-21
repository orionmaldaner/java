
package projectherancalogistica;
import java.util.ArrayList;
import java.util.Scanner;
//Escreva um programa para efetuar o controle do transporte de cargas realizado por uma empresa. São utilizados aviões, caminhões, motos e barcos. 
//Cada um deles possui uma capacidade de carga. Além disso, os aviões possuem a autonomia (em Km). Os caminhões possuem número de eixos, placa e cor. 
//Os barcos possuem tamanho (comprimento x largura, em metros), bandeira do país e número de tripulantes. 
//A partir dessas informações, o programa 
//deve permitir a escolha do tipo de transporte e a definição da quantidade estimada de dias para que a carga seja entregue. Após a escolha, deve 
//ser impresso um relatório contendo o tipo de transporte, o peso da carga e a quantidade de dias estimada para que a entrega seja realizada.
public class ProjectHerancaLogistica {

    public static void main(String[] args) {
        
        ArrayList<MeioDeTransporte> transportes = new ArrayList<>();        
        
        int transporte, prazo, autonomia, capacidade, eixos, comprimento, largura, tripulantes;
        String placa, cor, bandeira;
        Scanner sc = new Scanner(System.in);  
        
        System.out.println("Informe o transporte desejado: ");
        System.out.println(" 1 - Avião \n 2 - Caminhão \n 3 - Moto \n 4 - Barco");
        transporte = sc.nextInt();                 //seleciona o meio de transporte
        
        //add tranporte na lista
        //Aviao a1 = new Aviao(2100, 3000);
        //transportes.add(a1);
        //System.out.println(a1.getAutonomia() + "    " + a1.getCapacidadeCarga());
        
        
            //do{
                  
                switch (transporte) {
                    case 1:
                        System.out.println("Digite a autonomia em km e a capacidade em kg do aviao: ");
                        autonomia = sc.nextInt();
                        capacidade = sc.nextInt();
                        System.out.println("Digite os dias estimados para a entrega: ");
                        prazo = sc.nextInt();
                        Aviao avi = new Aviao(autonomia, capacidade, prazo);   //cria obj
                        transportes.add(avi);                                   //add na arryalist
                        break;
                    case 2:
                        System.out.println("Digite qtd de eixos: ");
                        eixos = sc.nextInt();
                        System.out.println("Digite a placa: ");
                        placa = sc.next();
                        System.out.println("Digite a cor: ");
                        cor = sc.next();
                        System.out.println("Digite a capacidade em kg: ");
                        capacidade = sc.nextInt();
                        System.out.println("Digite os dias estimados para a entrega: ");
                        prazo = sc.nextInt();
                        Caminhao c1 = new Caminhao(eixos, placa, cor, capacidade, prazo);
                        transportes.add(c1);
                        break;
                    case 3:
                        System.out.println("Digite a capacidade em kg: ");
                        capacidade = sc.nextInt();
                        System.out.println("Digite os dias estimados para a entrega: ");
                        prazo = sc.nextInt();
                        Moto mot = new Moto(capacidade, prazo);
                        transportes.add(mot);
                        break;
                    case 4:
                        System.out.println("Digite o comprimento do barco: ");
                        comprimento = sc.nextInt();
                        System.out.println("Digite a largura do barco: ");
                        largura = sc.nextInt();
                        System.out.println("Digite a bandeira do barco: ");
                        bandeira = sc.next();
                        System.out.println("Digite o número de tripulantes do barco: ");
                        tripulantes = sc.nextInt();
                        System.out.println("Digite a capacidade em kg: ");
                        capacidade = sc.nextInt();
                        System.out.println("Digite os dias estimados para a entrega: ");
                        prazo = sc.nextInt();
                        Barco b1 = new Barco(comprimento, largura, bandeira, tripulantes, capacidade, prazo);
                        transportes.add(b1);
                        break;
                    default:
                        System.out.println("comando inválido!");
                        //throw new IllegalArgumentException();
                }
                //System.out.println(" 1 - Avião \n 2 - Caminhão \n 3 - Moto \n 4 - Barco \n 5 - Finalizar");
                //transporte = sc.nextInt();
            //} while (transporte > 0 && transporte < 5); {
            
        //}
            //System.out.println("Prazo para entrega em dias: ");       //prazo para a entrega
            //prazo = sc.nextInt();
                    
        
        /*catch (IllegalArgumentException e) {
            System.out.println("Erro! Valor inválido!");
        }*/
        System.out.println("Relatório detalhado:");
        System.out.println(transportes.toString());
        
    }
    
}













