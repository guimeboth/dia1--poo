package br.com.estudos;

public class Pombo extends Ave {

    public Pombo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + ": pru.");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está procurando um alvo para alvejar.");
    }

}
