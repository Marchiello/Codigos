/*
Problema “pagamento”
Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e
a quantidade de horas trabalhadas por ele(a). Ao final, mostrar o valor do pagamento do funcionário
com uma mensagem explicativa, conforme exemplo.

------------------------------------------------------[]

Exemplo 1:
Nome: Joao Silva
Valor por hora: 50.00
Horas trabalhadas: 60
O pagamento para Joao Silva deve ser 3000.00

------------------------------------------------------[]

--------------------------------------------------------------------------------------------------------------[]
*/

package Exercicio1;
import java.util.Scanner;

public class Principal {

    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o nome de um funcionário:");
        String nome = entrada.nextLine();
        System.out.println();

        System.out.println("Agora, insira o valor recebido por hora: ");
        float salario = entrada.nextFloat();
        System.out.println();

        System.out.println("Por fim, insira a quantidade de horas trabalhadas");
        float tempo = entrada.nextFloat();
        System.out.println();

        float salFinal = salario*tempo;

        System.out.println("-----------------------------------------------------------[]\n");
        System.out.println("Nome: " + nome);
        System.out.println("Valor por Hora: " + salario);
        System.out.println("Horas Trabalhadas: " + tempo);
        System.out.println("O Pagamento para " + nome + " Deve ser " + salFinal + "\n");
        System.out.println("-----------------------------------------------------------[]\n");



    }
}
