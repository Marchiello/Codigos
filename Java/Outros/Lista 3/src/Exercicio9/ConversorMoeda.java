package Exercicio9;

public class ConversorMoeda {

    public static double valorReais(double valorDolarReal, double dolarComprado){
        double valorReais = valorDolarReal*dolarComprado;
        return valorReais + (valorReais*0.06);
    }

}
