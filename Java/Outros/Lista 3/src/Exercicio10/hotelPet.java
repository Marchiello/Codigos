package Exercicio10;

import java.util.Scanner;

public class hotelPet {
    public static void main(String[]args){

        Animal[] animal = new Animal[100];
        Scanner entrada = new Scanner(System.in);
        Cachorro dog = new Cachorro();
        Gato cat = new Gato();

        boolean continuar = true;

        while(continuar){
            System.out.println("----------[ Menu ]----------\n");
            System.out.println("1 - Fazer Check-in");
            System.out.println("2 - Fazer Check-out");
            System.out.println("3 - Sair\n");
            System.out.println("Escolha uma opcao: ");
            int opcao = entrada.nextInt();
            System.out.println();

            switch(opcao){
                case 1:
                    System.out.println("Você deseja cadastrar um cachorro ou um gato?");
                    String especie = entrada.next();
                    if(especie.equals("cachorro") || especie.equals("Cachorro")){
                        System.out.println();
                        for (int i = 0; i < animal.length; i++) {
                            if(animal[i] == null){
                                animal[i] = new Cachorro();

                                System.out.println("Insira os Dados do Animal: \n");
                                System.out.println("Nome:");
                                String nome = entrada.nextLine();
                                entrada.next();
                                animal[i].setNome(nome);
                                System.out.println();

                                System.out.println("Raça: ");
                                String raca = entrada.nextLine();
                                entrada.next();
                                animal[i].setRaca(raca);
                                System.out.println();

                                dog.Late();

                                i = animal.length;

                            }
                        }


                    }else if(especie.equals("Gato") || especie.equals("gato")){
                        System.out.println();
                        for (int i = 0; i < animal.length; i++) {
                            if(animal[i] == null){
                                animal[i] = new Gato();

                                System.out.println("Insira os Dados do Animal: \n");
                                System.out.println("Nome:");
                                String nome = entrada.nextLine();
                                entrada.next();
                                animal[i].setNome(nome);
                                System.out.println();

                                System.out.println("Raça: ");
                                String raca = entrada.nextLine();
                                entrada.next();
                                animal[i].setRaca(raca);
                                System.out.println();

                                cat.mia();

                                i = animal.length;

                            }
                        }

                    }else{
                        System.out.println("Especie Invalida!");
                    }
                    break;

                case 2:
                    System.out.println("Insira o nome do Animal: ");
                    String nome = entrada.nextLine();
                    entrada.next();

                    for (int i = 0; i < animal.length; i++) {
                        if(animal[i] != null){
                            if(animal[i].getNome() == nome) {
                                System.out.println("Obrigado " + animal[i].getNome() + ", Volte Sempre!");
                                animal[i] = null;
                                i = animal.length;
                            }
                        }else if(i == animal.length-1){
                            System.out.println("Hospede Pet não encontrado!");
                        }

                    }
                    break;

                case 3:
                    System.out.println("Até mais! Desliganddo Sistema...");
                    continuar = false;
                    break;




            }
        }



    }
}
