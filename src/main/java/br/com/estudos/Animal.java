package br.com.estudos;

public abstract class Animal {

    private final String nome;
    private final int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void emitirSom();

    public abstract void mover();

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
