/*
Problema “senha_fixa”

Escreva um programa que repita a leitura de uma senha até que ela seja válida.
Para cada leitura de senha incorreta informada, escreva a mensagem "Senha Inválida!
Tente novamente:". Quando a senha for informada corretamente deve ser impressa a mensagem
"Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

*/

package Exercicio6;
import java.util.Scanner;

public class Principal {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        boolean acesso = false;

        while(!acesso){System.out.println();
            System.out.println("Digite a senha: ");
            int senha = entrada.nextInt();
            System.out.println();

            if(senha == 2002){
                System.out.println("Acesso Permitido!");
                acesso = true;
            }else{
                System.out.println("Senha Invalida, Tente Novamente!");
            }
        }


    }
}
