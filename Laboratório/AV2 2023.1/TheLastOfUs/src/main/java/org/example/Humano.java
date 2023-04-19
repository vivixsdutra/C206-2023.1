package org.example;

public class Humano extends Personagem implements Aprimorar,Lutar{

    //Atributos
    private String nome;
    private int idade;
    private boolean vagalume;
    private double energia;
    private double distanciaEscuta;
    public Arma arma = null;

    public Humano(int vida, int idPersonagem, String nome, int idade, boolean vagalume, double energia, double distanciaEscuta, Arma arma) {
        super(vida, idPersonagem);
        this.nome = nome;
        this.idade = idade;
        this.vagalume = vagalume;
        this.energia = energia;
        this.distanciaEscuta = distanciaEscuta;
        this.arma = arma;
    }

    //Métodos


    @Override
    public void mostrarInfos() {
        super.mostrarInfos();
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Energia: "+this.energia);
        System.out.println("Distancia para Escuta: "+this.distanciaEscuta);
    }

    void addArma(Arma arma){
        this.arma = arma;
    }

    @Override
    public void modificarArma() {

    }

    @Override
    public void modificarHabilidade(int qtdPilulas, String tipoHabilidade) {
        if (qtdPilulas < 0 ) {
            System.out.println("Quantidade de pílulas inválidas, favor informar um valor maior que 0");
        }
        else if (0 < qtdPilulas > 10){
            this.energia = this.energia + this.energia * 0.02;
            this.distanciaEscuta * (0,02);
        }
        else if (10 <= qtdPilulas > 15){
            this.energia * 0,4;
            this.distanciaEscuta * (0,05);
        }
    }

    @Override
    public void atacar() {

    }

    @Override
    public void defender() {

    }
}
