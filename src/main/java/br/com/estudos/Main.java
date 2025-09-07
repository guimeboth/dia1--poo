package br.com.estudos;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animais = List.of(
                new Cachorro("Mirna", 8),
                new Gato("Clóvis", 6),
                new Pombo("Pombo", 5),
                new Galinha("Galinha", 3, true));

        for (Animal animal : animais) {
            animal.mover();
            animal.emitirSom();
            if (animais instanceof Mamifero m) {
                m.amamentar();
            }
        }

    }
}