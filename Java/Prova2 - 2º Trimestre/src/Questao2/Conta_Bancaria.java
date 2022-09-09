package Questao2;

public abstract class Conta_Bancaria {

    //-------------------------------------[Variáveis]

    protected String cliente;
    protected int numConta;
    protected float saldo;

    //-------------------------------------[Construtores]

    public Conta_Bancaria() {
    }

    public Conta_Bancaria(String cliente, int numConta, float saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    //-------------------------------------[Métodos]

    public void sacar(float quantia){
        if(quantia <= this.saldo){
            this.saldo = this.saldo - quantia;
            System.out.println("Saque Realizado com Sucesso!");
            System.out.println("Seu saldo agora e de: "+ this.saldo);
        }else{
            System.out.println("Saldo Insuficiente!");
        }
    }

    //------------------[]

    public void depositar(int quantia){
        this.saldo += quantia;
        System.out.println("Deposito Realizado!");
        System.out.println("Seu saldo agora e de "+ this.saldo);
    }

    //--------------------------------------[Getter and Setter]


    public String getCliente() {
        return cliente;
    }

    //---------------[]

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    //---------------[]


    public int getNumConta() {
        return numConta;
    }

    //---------------[]


    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    //---------------[]


    public float getSaldo() {
        return saldo;
    }

    //---------------[]


    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}
