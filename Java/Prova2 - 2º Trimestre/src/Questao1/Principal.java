package Questao1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Boolean condicao = true;

        while(condicao == true){

            System.out.print("""
                ---------- CALCULADORA ----------

                1 - Soma
                2 - Subtração
                3 - Multiplicação
                4 - Divisão
                5 - Mod

                Digite a operação desejada: 
                """);
            int opcao = entrada.nextInt();

            System.out.println("Digite o primeiro número: ");
            double numero1 = entrada.nextDouble();

            System.out.println("Digite o segundo número: ");
            double numero2 = entrada.nextDouble();

            switch (opcao) {
                case 1:
                    System.out.println("O resultado da soma é " + Calculadora.somar(numero1, numero2) + ".");
                    break;

                case 2:
                    System.out.println("O resultado da subtração é " + Calculadora.subtrair(numero1, numero2) + ".");
                    break;

                case 3:
                    System.out.println("O resultado da multiplicação é " + Calculadora.multiplicar(numero1, numero2));
                    break;

                case 4:
                    if (numero2 == 0){
                        System.out.println("O denominador não pode ser 0, digite um número válido: ");
                        numero2 = entrada.nextDouble();
                    }
                    System.out.println("O resultado da divisão é " + Calculadora.divisão(numero1, numero2) + ".");
                    break;

                case 5:
                    System.out.println("O mod é " + Calculadora.mod(numero1, numero2) + ".");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }

            System.out.println("Deseja fazer outra operação? 1 - SIM | 2 - NÃO");
            int escolha = entrada.nextInt();

            if(escolha == 2){
                System.out.println("Até mais!");
                condicao = false;
            }

        }

        entrada.close();
    }

}

