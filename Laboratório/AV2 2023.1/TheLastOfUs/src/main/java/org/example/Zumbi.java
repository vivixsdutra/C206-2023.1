package org.example;

public class Zumbi extends Personagem implements Lutar,Infectar {

    //Atributos
    private int diasInfeccao;
    private boolean cego;

    public Zumbi(int vida, int idPersonagem, int diasInfeccao) {
        super(vida, idPersonagem);
        this.diasInfeccao = diasInfeccao;
    }

    //Métodos

    @Override
    public void mostrarInfos() {
        super.mostrarInfos();
        System.out.println("Dias de infecção: "+diasInfeccao);

    }

    public void transformacao(){
        if (diasInfeccao >= 2){
            System.out.println("Não é cego");
            this.cego = false;
        }
        else if (diasInfeccao >= 14){
            System.out.println("Não é cego");
            this.cego = false;
        }
        else if (diasInfeccao >=365) {
            System.out.println("É cego");
            this.cego = true;
        }
    }


    @Override
    public void infectou() {
        System.out.println("O zumbi mordou e infectou um Humano");
    }

    @Override
    public void atacar() {

    }

    @Override
    public void defender() {

    }
}
