package Exercicio9;
import java.util.Scanner;

public class Principal {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o valor do dolar?");
        double valor = entrada.nextDouble();
        System.out.println();

        System.out.println("Quantos dólares serão comprados?");
        double valorDolares = entrada.nextDouble();
        System.out.println();

        System.out.println("Funcionario: Valor a ser pago em reais: R$" + ConversorMoeda.valorReais(valor,valorDolares));

    }
}
