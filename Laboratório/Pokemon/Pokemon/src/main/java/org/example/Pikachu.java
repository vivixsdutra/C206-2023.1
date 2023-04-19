package org.example;

public class Pikachu extends Pokemon implements FazerBarulho,AtaqueEspecial{
    //atributos
    private float soltarRaios;
    private float paralisiaEletrica;

    public Pikachu(String nome, String tipo, float soltarRaios, float paralisiaEletrica) {
        super(nome, tipo);
        this.soltarRaios = soltarRaios;
        this.paralisiaEletrica = paralisiaEletrica;
    }

    // metodos

    @Override
    void mostrarInfos() {
        super.mostrarInfos();
        System.out.println("Poder de soltar raios: "+ this.soltarRaios);
        System.out.println("Poder paralisia elétrica: "+this.paralisiaEletrica);
    }

    public void atacar (){
        System.out.println(getNome()+" esta atacando");
    }


    @Override
    public void fazerBarulho() {
        System.out.println(getNome()+" faz barulho");
    }

    @Override
    public void ataqueEspecial() {
        if (soltarRaios > 750) {
            System.out.println(getNome()+"ganha a batalha");
        }
        else
            System.out.println(getNome()+"perdeu a batalha");
    }
}

