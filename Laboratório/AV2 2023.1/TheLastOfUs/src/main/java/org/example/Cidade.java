package org.example;

public class Cidade {

    //Atributos
    private String nome;
    private Personagem personagens[] = new Personagem[10];

    public Cidade(String nome, Personagem[] personagens) {
        this.nome = nome;
        this.personagens = personagens;
    }

    //Métodos

    public void adicionarPersonagens(Personagem p) {

        for (int i = 0; i < personagens.length; i++) {
            if (personagens[i] == null) {
                personagens[i] = p;
                break;
            }
        }
    }

    public void listarPersonagens() {
        System.out.println("------ Personagens ------");
        for (Personagem personagens : personagens) {
            if (personagens != null) {
                if (personagens instanceof Humano humano) {

                    System.out.println("-------------------------");
                } else if (personagens instanceof Zumbi zumbi) {

                    System.out.println("-------------------------");
                }
            }
        }
    }
}