package br.com.estudos.collections.set;

import java.util.HashSet;
import java.util.Set;

import br.com.estudos.model.Animal;
import br.com.estudos.model.Cachorro;
import br.com.estudos.model.Gato;

public class MainSet {
    public static void main(String[] args) {
        Set<Animal> animais = new HashSet<>();
        animais.add(new Cachorro("Mirna", 9));
        animais.add(new Cachorro("Mirna", 9));
        animais.add(new Gato("Clóvis", 7));
        animais.add(new Gato("Clóvis", 7));

        imprimirAnimais(animais);
    }

    private static <T extends Animal> void imprimirAnimais(Set<T> animais) {
        animais.forEach(System.out::println);
    }
}
