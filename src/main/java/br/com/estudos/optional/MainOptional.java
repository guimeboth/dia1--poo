package br.com.estudos.optional;

import java.util.List;
import java.util.Optional;

import br.com.estudos.model.Animal;
import br.com.estudos.model.Cachorro;
import br.com.estudos.model.Gato;
import br.com.estudos.model.exceptions.AnimalNaoEncontratoException;

public class MainOptional {
    public static void main(String[] args) {
        List<Animal> animais = List.of(
                new Cachorro("Solphie", 7),
                new Gato("Olga", 6));

        // Exemplo 1: ifPresent
        buscarPorNome(animais, "Olga")
                .ifPresent(System.out::println);

        // Exemplo 2: orElse
        Animal padrao = buscarPorNome(animais, "Rebeca")
                .orElse(new Gato("Gato desconhecido", 0));
        System.out.println(padrao);

        // Exemplo 3: orElseThrow com exceção customizada
        Animal encontrato = buscarPorNome(animais, "Clóvis")
                .orElseThrow(() -> new AnimalNaoEncontratoException("Clóvis"));
        System.out.println(encontrato);
    }

    private static Optional<Animal> buscarPorNome(List<Animal> animais, String nome) {
        return animais.stream().filter(a -> a.getNome().equalsIgnoreCase(nome)).findFirst();
    }
}
