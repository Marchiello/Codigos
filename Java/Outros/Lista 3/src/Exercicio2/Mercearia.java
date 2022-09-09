/*
Problema “troco”

Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto, e
o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve mostrar
o valor do troco a ser devolvido ao cliente.

---------------------------------------------[]

Exemplo 1:
Preço unitário do produto: 8.00
Quantidade comprada: 2
Dinheiro recebido: 20.00
TROCO = 4.00

---------------------------------------------[]

*/

package Exercicio2;
import java.util.Scanner;


public class Mercearia {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o preço unitário de um produto: ");
        float preco = entrada.nextFloat();
        System.out.println();

        System.out.println("Insira a quantidade de produtos: ");
        int quantidade = entrada.nextInt();
        System.out.println();

        System.out.println("Insira o valor dado pelo cliente: ");
        float dinheiro = entrada.nextFloat();
        System.out.println();

        float troco = dinheiro - (preco*quantidade);

        System.out.println("----------------------------------------------------------[]\n");

        System.out.println("Preço unitário do produto: R$" + preco);
        System.out.println("Quantidade comprada: " + quantidade);
        System.out.println("Dinheiro recebido: R$" + dinheiro);
        System.out.println("TROCO = " + troco);
        System.out.println();

        System.out.println("----------------------------------------------------------[]\n");


    }
}
