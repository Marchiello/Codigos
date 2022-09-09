/*
Problema “tabuada”
Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10, conforme exemplo.
Exemplo:
Deseja a tabuada para qual valor? 4
4 x 1 = 4
4 x 2 = 8
4 x 3 = 12
4 x 4 = 16
4 x 5 = 20
4 x 6 = 24
4 x 7 = 28
4 x 8 = 32
4 x 9 = 36
4 x 10 = 10


*/

package Exercicio5;
import java.util.Scanner;

public class Principal {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira Um Numero para ver sua tabuada: ");
        int numero = entrada.nextInt();
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + numero*i );
        }

    }
}
