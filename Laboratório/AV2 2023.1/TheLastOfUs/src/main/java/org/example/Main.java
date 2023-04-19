package org.example;

public class Main {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("Santa rita" , new Personagem[50]);

        Zumbi zumbi = new Zumbi(30, 1, 20);
        zumbi.transformacao();

        cidade.adicionarPersonagens(zumbi);

        cidade.listarPersonagens();
    }
}