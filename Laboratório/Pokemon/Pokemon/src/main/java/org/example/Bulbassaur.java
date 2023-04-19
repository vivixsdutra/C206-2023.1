package org.example;

public class Bulbassaur extends Pokemon implements FazerBarulho,AtaqueEspecial{
    //atributos
    private float luminosidadeAmbiente;

    public Bulbassaur(String nome, String tipo, float luminosidadeAmbiente) {
        super(nome, tipo);
        this.luminosidadeAmbiente = luminosidadeAmbiente;
    }

    //métodos

    @Override
    void mostrarInfos() {
        super.mostrarInfos();
        System.out.println("Luminosidade Ambiente: "+ luminosidadeAmbiente);
    }

    public void atacar(){
        System.out.println(getNome()+" esta atacando");
    }


    @Override
    public void fazerBarulho() {
        System.out.println(getNome()+" faz barulho");
    }

    @Override
    public void ataqueEspecial() {
        if (luminosidadeAmbiente > 650) {
            System.out.println(getNome()+"ganha a batalha");
        }
        else
            System.out.println(getNome()+"perdeu a batalha");
    }
}
