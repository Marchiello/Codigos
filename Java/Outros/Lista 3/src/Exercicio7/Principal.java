/*
Fazer um programa para ler a quantidade de glicose no sangue de uma pessoa e depois mostrar na tela
a  classificação desta glicose de acordo com a tabela de referência ao lado.

Classificação
Glicose
Normal
Até 100 mg/dl
Elevado
Maior que 100 até 140 mg/dl
Diabetes
Maio de 140 mg/dl


Exemplo 1:
Digite a medida da glicose: 90.0
Classificacao: normal


Exemplo 2:
Digite a medida da glicose: 140.0
Classificacao: elevado


Exemplo 3:
Digite a medida da glicose: 143.0
Classificacao: diabetes


*/

package Exercicio7;
import java.util.Scanner;

public class Principal {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a medida da glicose: ");
        int glic = entrada.nextInt();

        if(glic > 0 && glic <= 100){
            System.out.println("Classificação: normal");
        }else if(glic > 100 && glic <= 140){
            System.out.println("Classificação: elevado");
        } else if (glic > 140) {
            System.out.println("Classificação: diabetes");
        }else{
            System.out.println("Valor Inválido!");
        }

    }
}
