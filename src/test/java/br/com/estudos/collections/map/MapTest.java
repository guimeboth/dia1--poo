package br.com.estudos.collections.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.estudos.model.Animal;
import br.com.estudos.model.Cachorro;
import br.com.estudos.model.Gato;

public class MapTest {

    @DisplayName("Um Map pode armazenar vários elementos associados a uma mesma chave através de uma lista")
    @Test
    void devePermitirVariosElementosPorTipoDeAnimal() {
        Cachorro mirna = new Cachorro("Mirna", 8);
        Cachorro solphie = new Cachorro("Solphie", 7);

        Gato olga = new Gato("Olga", 6);
        Gato alina = new Gato("Alina", 4);
        Gato clovis = new Gato("Clóvis", 4);
        Gato rebeca = new Gato("Rebeca", 4);

        Map<String, List<Animal>> mapAnimais = Map.of(
                "Cachorros", List.of(mirna, solphie),
                "Gatos", List.of(olga, alina, clovis, rebeca));

        assertEquals(2, mapAnimais.get("Cachorros").size());
        assertEquals(4, mapAnimais.get("Gatos").size());

        assertTrue(mapAnimais.get("Cachorros").containsAll(List.of(mirna, solphie)));
        assertTrue(mapAnimais.get("Gatos").containsAll(List.of(olga, alina, clovis, rebeca)));
    }

}
