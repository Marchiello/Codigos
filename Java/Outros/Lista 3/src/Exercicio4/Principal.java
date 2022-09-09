/*

Problema “crescente”


Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente. O programa deve finalizar quando forem digitados dois valores iguais.

Exemplo 1:
Digite dois números:
5
4
DECRESCENTE!
Digite outros dois números:
3
8
CRESCENTE!
Digite outros dois números:
2
2


*/

package Exercicio4;
import java.util.Scanner;

public class Principal {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        int numero1 = 1;
        int numero2 = 2;

        while (numero1 != numero2){
            System.out.println();
            System.out.println("Digite dois numeros: ");
            numero1 = entrada.nextInt();
            numero2 = entrada.nextInt();

            if(numero1 > numero2){
                System.out.println("DECRESCENTE");
            }else if(numero2 > numero1){
                System.out.println("CRESCENTE");
            }else{
                System.out.println();
            }
        }

    }
}
