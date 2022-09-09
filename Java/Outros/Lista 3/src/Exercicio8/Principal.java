package Exercicio8;
import java.util.Scanner;

public class Principal {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o nome do funcionario: ");
        String nome = entrada.nextLine();
        System.out.println();

        System.out.println("Insira o Salário Bruto do Funcionario: ");
        double money = entrada.nextDouble();
        System.out.println();

        System.out.println("Insira o imposto do Funcionario: ");
        double imposto = entrada.nextDouble();
        System.out.println();

        Funcionario func = new Funcionario(nome,money,imposto);

        System.out.println("---------------------------------------------------------[]\n");

        System.out.println("Nome: " + func.getNome());
        System.out.println("Salário Bruto: " + func.getSalarioBruto());
        System.out.println("Imposto: " + func.getImposto());
        System.out.println(func.getNome() + ", Salario Liquido: R$" + func.buscarSalarioLiquido());
        System.out.println("Qual a porcentagem para aumentar o salario? ");
        double porc = entrada.nextDouble();
        func.aumentarSalario(porc);

        System.out.println("---------------------------------------------------------[]\n");
    }
}
