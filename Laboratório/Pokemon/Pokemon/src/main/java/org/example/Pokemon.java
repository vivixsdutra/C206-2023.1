package org.example;

import javax.sound.midi.Soundbank;

public abstract class Pokemon {


    //atributos
    public static int qtdPokemon;
    private String nome;
    private String tipo;
    public Helditem helditem = null;

    public Pokemon(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        qtdPokemon++;
        this.helditem = helditem;
    }

    //métodos
     void mostrarInfos(){

         System.out.println("++++ Esse é o seu Pokemon ++++");
         System.out.println("Nome: "+this.nome);
         System.out.println("Tipo: "+this.tipo);
         if (this.helditem == null) {
             System.out.println("Não tem Helditem");
         }
         else
             System.out.println("Helditem: "+this.helditem.tipo);
     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    abstract void atacar ();
}
