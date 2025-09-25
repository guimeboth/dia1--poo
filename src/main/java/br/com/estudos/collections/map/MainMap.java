package br.com.estudos.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import br.com.estudos.model.Animal;
import br.com.estudos.model.Cachorro;
import br.com.estudos.model.Gato;

public class MainMap {
    public static void main(String[] args) {
        Map<String, List<Animal>> animais = new HashMap<String, List<Animal>>();
        animais.put("Cachorros", List.of(new Cachorro("Mirna", 8), new Cachorro("Solphie", 7)));
        animais.put("Gatos", List.of(new Gato("Clóvis", 7), new Gato("Olga", 6)));
        imprimirAnimais(animais);
    }

    private static <T extends Animal> void imprimirAnimais(Map<String, List<T>> map) {
        for (Entry<String, List<T>> entry : map.entrySet()) {
            List<T> animais = entry.getValue();
            System.out.println(entry.getKey() + ":");
            animais.forEach(System.out::println);
        }
    }

}