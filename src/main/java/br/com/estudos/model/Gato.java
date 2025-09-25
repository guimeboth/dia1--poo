package br.com.estudos.model;

public class Gato extends Mamifero {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + ": miau.");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está amassando pãozinho.");
    }

}
