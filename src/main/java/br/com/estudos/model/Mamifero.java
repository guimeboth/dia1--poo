package br.com.estudos.model;

public abstract class Mamifero extends Animal {
    public Mamifero(String nome, int idade) {
        super(nome, idade);
    }

    public void amamentar() {
        System.out.println(getNome() + " está amamentando.");
    }

}
