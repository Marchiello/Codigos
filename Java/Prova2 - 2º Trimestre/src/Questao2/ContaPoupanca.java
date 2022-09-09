package Questao2;

public class ContaPoupanca extends Conta_Bancaria{

    public ContaPoupanca() {
    }

    public ContaPoupanca(String cliente, int numConta, float saldo) {
        super(cliente, numConta, saldo);
    }

    public ContaPoupanca(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }

    public ContaPoupanca(String cliente, int numConta, float saldo, int diaDeRendimento) {
        super(cliente, numConta, saldo);
        this.diaDeRendimento = diaDeRendimento;
    }

    private int diaDeRendimento;

    //------------------------------[]

    public void calcularNovoSaldo(float taxa){
        this.saldo *= taxa;
        System.out.println("Seu novo saldo e de "+ this.saldo);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "diaDeRendimento=" + diaDeRendimento +
                ", cliente='" + cliente + '\'' +
                ", numConta=" + numConta +
                ", saldo=" + saldo +
                '}';
    }
}
