package org.example;

public class Main {
    public static void main(String[] args) {
        Treinador t1 = new Treinador("vitoria");
        Bulbassaur b1 = new Bulbassaur("bola","planta",45);
        t1.addPokemon(b1);

        Helditem h1 = new Helditem();
        h1.tipo="Oculos invisivel";

        b1.helditem=h1;


        t1.mostraInfo();


    }





}