package Questao2;

import java.util.ArrayList;
import java.util.List;

public class ContasJava {
    public static void main(String[]args){

        // a) Incluir dados relativos às contas de um cliente:

        ContaPoupanca contaP = new ContaPoupanca("Letuaicia", 1722, 20f, 10);
        ContaEspecial contaE = new ContaEspecial("Letuaicia", 2217, 100f, 150f);

        // b) Sacar um determinado valor das contas:

        System.out.println("-----------------------[Sacando Valores]---------------[]\n");

        System.out.println("---------------[Conta Poupanca]---------------[]\n");

        System.out.println("Deve dar Erro:");
        contaP.sacar(30);
        System.out.println();

        contaP.setSaldo(20f);
        System.out.println("Dar Certo");
        contaP.sacar(20f);
        System.out.println();

        System.out.println("---------------[Conta Especial]--------------[]\n");

        System.out.println("Deve dar Erro:");
        contaE.sacar(260);
        System.out.println();

        System.out.println("Deve dar Certo: ");
        contaE.sacar(250);
        System.out.println();

        System.out.println("----------------------------------------------[]\n");

        // c) Depositar um determinado valor nas suas contas:

        System.out.println("---------------[Depositando Valores]--------------[]\n");
        System.out.println("[Conta Especial]");

        contaE.depositar(200);
        System.out.println();

        System.out.println("[Conta Poupanca]");
        contaP.depositar(150);
        System.out.println();

        // d) Mostrar o novo saldo do cliente, a partir da taxa de rendimento
        // daqueles que possuem uma conta poupança

        System.out.println("---------------[Rendimento]--------------[]\n");


        contaP.calcularNovoSaldo(1.05f);
        System.out.println();

        System.out.println("---------------[Mostra Tudo >:) ]--------------[]\n");

        // e) Mostre os dados das contas de um cliente.

        System.out.println("Conta Poupanca");
        System.out.println(contaP);
        System.out.println();
        System.out.println("Conta Especial");
        System.out.println(contaE);
        ;
    }
}
