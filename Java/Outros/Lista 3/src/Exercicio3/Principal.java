/*
Problema “idades”

Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os
nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo.

-----------------------------------------------------------------[]

Exemplo:
Dados da primeira pessoa:
Nome: Maria Silva
Idade: 19
Dados da segunda pessoa:
Nome: Joao Melo
Idade 20
A idade média de Maria Silva e Joao Melo é de 19.5 anos

-----------------------------------------------------------------[]

*/

package Exercicio3;
import java.util.Scanner;


public class Principal {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o nome de uma pessoa: ");
        String nome = entrada.nextLine();
        System.out.println();

        System.out.println("Agora, Insira a idade dessa pessoa: ");
        int idade = entrada.nextInt();
        System.out.println();

        System.out.println("Agora, Insira o nome de outra pessoa: ");
        String nome1 = entrada.nextLine();
        entrada.nextLine();
        System.out.println();

        System.out.println("Por fim, insira a idade dessa pessoa: ");
        int idade1 = entrada.nextInt();
        System.out.println();

        Pessoa p1 = new Pessoa(nome,idade);
        Pessoa p2 = new Pessoa(nome1,idade1);

        float mediaIdade = (p1.getIdade() + p2.getIdade()) / 2;

        System.out.println("----------------------------------------------------------------------[]\n");

        System.out.println("Dados da primeira pessoa:");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade() + "\n");
        System.out.println("Dados da segunda pessoa:");
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Idade: " + p2.getIdade() + "\n");
        System.out.println("A idade média de Maria Silva e Joao Melo é de "+ mediaIdade + "\n");
        System.out.println("----------------------------------------------------------------------[]\n");



    }
}
