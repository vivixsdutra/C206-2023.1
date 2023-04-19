package org.example;

public class Squirtle extends Pokemon implements FazerBarulho{

    //atributos
    private float multiplicadorAgua;

    public Squirtle(String nome, String tipo, float multiplicadorAgua) {
        super(nome, tipo);
        this.multiplicadorAgua = multiplicadorAgua;
    }

    //metodos


    @Override
    void mostrarInfos() {
        super.mostrarInfos();
        System.out.println("Multiplicador de água: "+multiplicadorAgua);
    }

    public void atacar(){
        System.out.println(getNome()+" esta atacando");
    }

    @Override
    public void fazerBarulho() {
        System.out.println(getNome()+" faz barulho");
    }
}
