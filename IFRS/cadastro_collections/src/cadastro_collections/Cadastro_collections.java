
package cadastro_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*Escreva um programa que realize o cadastro de alunos e professores. Os alunos possuem nome, número de matrícula e média geral 
do curso. Os professores possuem nome, salário e ano de contratação. O programa deve fornecer as seguintes funcionalidades:
a) Listar somente os alunos.
b) Listar somente os professores.
c) Listar os professores de acordo com seu salário (ordem decrescente).
d) Listar os alunos de acordo com a média geral (ordem decrescente).
Observação: Utilize Coleções.*/

//como o listar 3 e 5 funcionam corretamente se um possui loop para imprimir e o outro nao. Eh necessaio o loop?

public class Cadastro_collections {

    public static void main(String[] args) {

        int cadastro = 3;
        int listar = 9;
        String nameProf;
        String nameAl;
        double salario;
        int anoContratacao;
        String matricula;
        double media;
        
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();

        Aluno a1 = new Aluno("Ana", "123", 6.5);
        Aluno a2 = new Aluno("Joao", "222", 8.6);
        Aluno a3 = new Aluno("Pedro", "100", 4.2);
        Aluno a4 = new Aluno("Bruna", "423", 9.7);
        Professor p1 = new Professor("Antonio", 3508.9, 2020);
        Professor p2 = new Professor("Joice", 6500, 2019);
        Professor p3 = new Professor("Enio", 8500, 2010);
        Professor p4 = new Professor("Diva", 6600.7, 2015);
        
        alunos.add(a1); 
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        professores.add(p1);
        professores.add(p2);
        professores.add(p3);
        professores.add(p4);
        
        Scanner read = new Scanner(System.in);
        /*lista em forma ordenada cres ou decres, conforme determinado no compareTo */

                
//System.out.println(professores);

        
        while (cadastro != 0) {
            System.out.println("Escolha a funcao desejada: \n1 - Cadastrar novo Professor \n2 - Cadastrar novo Aluno \n0 - Consultar listas");
            cadastro = read.nextInt();
            
            if (cadastro == 1) {
                System.out.println("Digite nome:");
                nameProf = read.next();
                System.out.println("Digite salario:");
                salario = read.nextDouble();
                System.out.println("Digite o ano de contratacao:");
                anoContratacao = read.nextInt();
                Professor p5 = new Professor(nameProf, salario, anoContratacao);
                professores.add(p5);
            }
            else if (cadastro == 2) {
                System.out.println("Digite nome:");
                nameAl = read.next();
                System.out.println("Digite o numero da matricula:");
                matricula = read.next();
                System.out.println("Digite a media:");
                media = read.nextDouble();
                Aluno a5 = new Aluno(nameAl, matricula, media);
                alunos.add(a5);
            }
            else if (cadastro != 0){
                System.out.println("Opção invalida!");
            }
        }
        
        while (listar != 0) {
            
            System.out.println("Escolha uma opcao de impressao:");
            System.out.println("1 - lista dos Alunos \n2 - lista dos Professores");
            System.out.println("3 - lista ordenada dos Alunos pela media");//\n4 - lista ordenada dos Professores pelo ano
            System.out.println("5 - lista decrescente ordenada pelo salario \n0 - Sair");
            listar = read.nextInt();
            if (listar == 1) {
                System.out.println("List as add students:");
                System.out.println(alunos);
            }
            else if (listar == 2) {
                System.out.println("List as add Professors:");
                System.out.println(professores);
            }
            else if (listar == 3) {
                Collections.sort(alunos);
                System.out.println("******* Ranked average of students' grades ********");//Média das notas ordenada dos alunos
                System.out.println(alunos);
            }
            /*else if (listar == 4) {
                Collections.sort(professores);
                System.out.println("****** Ordered of teachers by year ********");
                System.out.println(professores);            
            }*/
            else if (listar == 5) {
                System.out.println("****** Teachers ordered by salary ********");
                Collections.sort(professores);
                for(Professor pro: professores) {
                    System.out.println(pro);
                }
            }
            else if (listar != 0) {
                System.out.println("Opção inválida!");
            }

        }
        
    }

    
}


