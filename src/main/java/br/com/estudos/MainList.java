package br.com.estudos;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MainList {
    public static void main(String[] args) {

        List<Cachorro> cachorros = List.of(
                new Cachorro("Solphie", 7),
                new Cachorro("Mirna", 8));

        List<Gato> gatos = List.of(
                new Gato("Clóvis", 7),
                new Gato("Olga", 6),
                new Gato("Rebeca", 5),
                new Gato("Alina", 4));

        List<Cachorro> cachorrosOrdenadosPorNome = cachorros.stream().sorted(Comparator.comparing(Animal::getNome))
                .toList();
        List<Gato> gatosOrdenadosPorIdade = gatos.stream().sorted(Comparator.comparing(Animal::getIdade).reversed())
                .toList();

        System.out.println("Ordenados por Nome.");
        imprimirAnimaisComForEach(cachorrosOrdenadosPorNome);
        imprimirAnimaisComForEach(gatosOrdenadosPorIdade);

        System.out.println("Ordenados por Idader.");
        imprimirAnimaISComIterator(gatosOrdenadosPorIdade);
        imprimirAnimaISComIterator(cachorrosOrdenadosPorNome);

    }

    private static <T extends Animal> void imprimirAnimaisComForEach(List<T> lista) {
        lista.forEach(System.out::println);
    }

    private static <T extends Animal> void imprimirAnimaISComIterator(List<T> lista) {
        Iterator<T> iterator = lista.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}