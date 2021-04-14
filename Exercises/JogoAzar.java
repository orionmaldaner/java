import java.util.Random;
import java.util.Scanner;
import java.util.*;

/*Elabore um programa que simule um jogo de azar. Assim que o jogo é iniciado,
dois dados devem ser lançados e a sua soma armazenada. A partir disso, o usuário poderá jogar e terá
três chances para acertar a soma dos dados. Caso o usuário acerte o valor, ou caso as chances sejam
esgotadas, o jogo deverá ser encerrado. Para jogar novamente, outro jogo deverá ser iniciado.*/

public class JogoAzar {

    public static void main(String[] args) {

        System.out.println("Jogo do azar!\n");
        System.out.println("Descubra a soma dos dois valores sorteados");
        System.out.println("Digite um valor entre 2 a 12:");

        // valor de entarada
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();

        int ran1 = 0;
        int ran2 = 0;
        int soma = 0;

        if (n1 > 12 | n1 < 2) {
            System.out.println("Valor invalido!");

            // se o num estiver dentro do intervalos validos, faca
        } else {
            for (int i = 0; i < 3 & soma != n1; i++) {

                // numeros sorteados
                Random random = new Random();

                ran1 = random.nextInt(5);
                ran2 = random.nextInt(5);

                // +2 para o resultado ser entre 2 e 12
                soma = ran1 + ran2 + 2;
                System.out.println("Resultado: " + soma);
                // System.out.println(i); //quantidade de repeticoes
            }
        }
        if (soma == n1 & soma != 0) {
            System.out.println("Parabens, voce acertou o numero!");
        } else if (soma != 0) {
            System.out.println("Valor errado!");
        }
    }
}
