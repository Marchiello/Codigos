package Questao2;

public class ContaEspecial extends Conta_Bancaria{
    private double limite;

    //-------------------------------------------------[Construtores]

    public ContaEspecial() {
    }

    public ContaEspecial(double limite) {
        this.limite = limite;
    }

    public ContaEspecial(String cliente, int numConta, float saldo, double limite) {
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    //-------------------------------------------------[Métodos]

    @Override
    public void sacar(float valor){
        if(valor <= (limite+saldo)){
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado com Sucesso!");
            System.out.println("Seu saldo agora e de: "+ this.saldo);
        }else{
            System.out.println("Saldo e Limite Insuficientes!");
        }

    }

    //------------------------------------------------[Getter and Setter]


    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "limite=" + limite +
                ", cliente='" + cliente + '\'' +
                ", numConta=" + numConta +
                ", saldo=" + saldo +
                '}';
    }
}
