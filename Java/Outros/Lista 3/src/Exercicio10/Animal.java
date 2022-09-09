package Exercicio10;

public abstract class Animal {

    private String nome;
    private String raca;

    //-------------------------[]

    public void Animal(){

    }

    public void Animal(String nome){

    }

    public void Caminha(){
        System.out.println("O Animal está caminhando");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
