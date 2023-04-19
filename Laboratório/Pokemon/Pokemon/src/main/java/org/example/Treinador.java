package org.example;

public class Treinador {

    //atributos

    private String nome;
    private Pokemon pokemons [] = new Pokemon[10];

    //metodos

    void addPokemon (Pokemon p ){
        for (int i = 0; i < pokemons.length; i++) {
            if (pokemons[i] == null) {
                pokemons[i] = p;
                break;
            }
        }
    }

    public Treinador(String nome) {
        this.nome = nome;
    }

    public void mostraInfo(){
        System.out.println("------ Treinador ------");
        System.out.println("Nome: " + nome);

        System.out.println("------ Pokemons ------");
        for (Pokemon pokemon: pokemons){
            if (pokemon != null){
                if (pokemon instanceof Squirtle squirtle) {
                    squirtle.fazerBarulho();
                    squirtle.atacar();
                    squirtle.mostrarInfos();
                    System.out.println("-------------------------");
                } else if (pokemon instanceof Bulbassaur bulbassaur){
                    bulbassaur.fazerBarulho();
                    bulbassaur.ataqueEspecial();
                    bulbassaur.atacar();
                    bulbassaur.mostrarInfos();
                    System.out.println("-------------------------");
                } else if (pokemon instanceof Pikachu pikachu){
                    pikachu.fazerBarulho();
                    pikachu.ataqueEspecial();
                    pikachu.atacar();
                    pikachu.mostrarInfos();
                    System.out.println("-------------------------");
                }
            }
        }

        System.out.println("Qtd de pokemons: "  + Pokemon.qtdPokemon);
    }
}
