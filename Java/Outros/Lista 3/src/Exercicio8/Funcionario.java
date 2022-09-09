package Exercicio8;

public class Funcionario {

    private String nome;
    private double salarioBruto;
    private double imposto;

    //--------------------------------------------------------------[]

    public double buscarSalarioLiquido(){
        double salarioLiquido;
        salarioLiquido = this.salarioBruto - this.imposto;
        return salarioLiquido;
    }

    public void aumentarSalario(double porcentagem){
        this.salarioBruto = this.salarioBruto+((porcentagem/100) * this.getSalarioBruto());
        System.out.println("Dados atualizados: " + this.nome + ", R$" +  this.salarioBruto);
    }

    //--------------------------------------------------------------[]


    public Funcionario() {
    }

    public Funcionario(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    //--------------------------------------------------------------[]


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

}
