package org.example;

public class Arma {

    //Atributos
    private int forca;
    private String TipoArma;

    public Arma(int forca, String tipoArma) {
        this.forca = forca;
        TipoArma = tipoArma;
    }

    //Métodos
    public void mostrarInfos(){
        System.out.println("+++++ ARMA +++++");
        System.out.println(this.forca);
        System.out.println(this.TipoArma);
    }

}
