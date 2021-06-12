import java.util.Scanner;

//Sobrecarga, Construtor, Estrutura de pacote

/*Você foi contratado para criar um programa que permita a manipulação de três 
impressoras. A impressora A precisa de uma string de caracteres para realizar a 
impressão, e retorna verdadeiro ou falso como resultado. 
A impressora B precisa de uma 
string de caracteres, o número inicial e também o número final das páginas que serão 
impressas. Ela retorna um código que varia entre 1 e 6 para indicar o que ocorreu 
durante o processo de impressão. 
A impressora C envia dois strings de caracteres e o 
total de páginas que será impresso, e retorna um array com dados sobre o processo. De 
acordo com as funcionalidades solicitadas, escreva um programa que permita a escolha 
de uma determinada impressora, especifique os parâmetros necessários para a impressão 
e exiba um log com a saída que a impressora gera. */

public class Main {
    public static void main(String[] args) {
        int retornoImpressoraB, choseImpressora;
        boolean retornoImpressoraA;
        String textImpressao;

        System.out.println("Escolha a impressora desejada:\n1 - Impressora A\n2 - Impressora B\n3 - Impressora C");

        Scanner scanner = new Scanner(System.in);
        choseImpressora = scanner.nextInt();

        Impressora imp1 = new Impressora();
        Impressora imp2 = new Impressora();
        Impressora imp3 = new Impressora();

        // nao funciona
        // System.out.println("Digite o texto para impressão:");
        // textImpressao = scanner.nextLine();

        if (choseImpressora == 1) {
            textImpressao = "text impressora A";
            retornoImpressoraA = imp1.imprimir(textImpressao);
            if (retornoImpressoraA == true) {
                System.out.println("Documento impresso com sucesso!");
            } else {
                System.out.println("Erro na impressão!");
            }
            // System.out.println(retornoImpressoraA); retorna false/true
            // System.out.println(imp1.imprimir("text impressora A"));

        } else if (choseImpressora == 2) {

            retornoImpressoraB = imp2.imprimir("text impressora B", 1, 33);
            System.out.println("Código de processo impressora B: " + retornoImpressoraB);
            // System.out.println(imp2.imprimir("text impressora 2", 1, 33));

        } else if (choseImpressora == 3) {

            System.out.println(imp3.imprimir("texto um", "texto dois", "14"));

        } else {

            System.out.println("Opção inválida!");
        }

    }

}
