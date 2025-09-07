package br.com.estudos;

public class Cachorro extends Mamifero {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + ": auau");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + "está correndo atrás do rabo.");
    }

}
