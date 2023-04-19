package org.example;

public abstract class Personagem {

        //Atributos

        private static int nunPersonagens = 0;
        private int vida;
        private int idPersonagem;

        public Personagem(int vida) {
                this.vida = vida;
                this.idPersonagem = nunPersonagens;
                nunPersonagens++;
        }

        public int getVida() {
                return vida;
        }

        public void setVida(int vida) {
                this.vida = vida;
        }

        public int getIdPersonagem() {
                return idPersonagem;
        }

        public void setIdPersonagem(int idPersonagem) {
                this.idPersonagem = idPersonagem;
        }


        //Métodos

        public void mostrarInfos(){

        }


}
