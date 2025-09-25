package br.com.estudos.collections.set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.estudos.model.Animal;
import br.com.estudos.model.Cachorro;

public class SetTest {

    @DisplayName("Se eu adicionar dois elementos duplicados (com equals/hashcode implementado), a quantidade de elementos na lista deve ser 1.")
    @Test
    void naoDevePermitirDuplicados() {
        // Arrange (prepara cenário)
        Set<Animal> animais = new HashSet<>();
        Cachorro primeiroElemento = new Cachorro("Mirna", 9);
        Cachorro segundoElemento = new Cachorro("Mirna", 9);

        // Act (executa ação)
        animais.add(primeiroElemento);
        animais.add(segundoElemento);

        // Assert (valida resultado)
        assertEquals(1, animais.size());
        assertTrue(animais.contains(primeiroElemento));
    }

}
