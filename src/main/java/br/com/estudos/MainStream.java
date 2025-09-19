package br.com.estudos;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class MainStream {
    public static void main(String[] args) {
        List<Animal> animais = List.of(
                new Cachorro("Solphie", 7),
                new Cachorro("Mirna", 8),
                new Gato("Clóvis", 7),
                new Gato("Olga", 6),
                new Gato("Rebeca", 5),
                new Gato("Alina", 4));

        System.out.println("Filtrar todos os gatos da lista:");
        animais.stream().filter(a -> a instanceof Gato).forEach(System.out::println);

        System.out.println("\nMapear nomes para maiúsculo:");
        animais.stream().map(Animal::getNome).map(String::toUpperCase).forEach(System.out::println);

        System.out.println("\nOrdenar por idade (já fez com comparator, agora usando lambda inline):");
        animais.stream().sorted((o1, o2) -> Integer.compare(o1.getIdade(), o2.getIdade())).forEach(System.out::println);

        System.out.println("\nPegar a média de idade dos animais com mapToInt().average():");
        OptionalDouble media = animais.stream().mapToInt(Animal::getIdade).average();
        System.out.println(media.getAsDouble());

        System.out.println("\nCriar uma lista só com os nomes dos animais (map(Animal::getNome)):");
        List<String> nomes = animais.stream().map(Animal::getNome).collect(Collectors.toList());
        System.out.println(nomes);

        System.out.println("\nAgrupar por espécie (Collectors.groupingBy(a -> a.getClass().getSimpleName())):");
        Map<String, List<Animal>> animaisMap = animais.stream()
                .collect(Collectors.groupingBy(t -> t.getClass().getSimpleName()));
        for (Entry<String, List<Animal>> animaisPorEspecie : animaisMap.entrySet()) {
            System.out.println("\nEspécie " + animaisPorEspecie.getKey());
            System.out.println("Animais: ");
            animaisPorEspecie.getValue().stream().forEach(System.out::println);
        }

        System.out.println("\nUsar reduce para concatenar todos os nomes em uma única String.:");
        String nomesConcatenados = animais.stream().map(Animal::getNome).collect(Collectors.joining(", "));
        System.out.println(nomesConcatenados);

        System.out.println("\nProcessamento paralelo:");
        animais.parallelStream()
                .map(Animal::getNome)
                .forEach(System.out::println);
    }
}
