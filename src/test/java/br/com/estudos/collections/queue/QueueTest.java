package br.com.estudos.collections.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayDeque;
import java.util.Queue;

import org.junit.jupiter.api.Test;

import br.com.estudos.model.Animal;
import br.com.estudos.model.Cachorro;
import br.com.estudos.model.Gato;

public class QueueTest {

    @Test
    void deveAtenderNaOrdemDeInsercao() {
        // Arrange (prepara cenário)
        Queue<Animal> fila = new ArrayDeque<>();
        fila.add(new Cachorro("Mirna", 8));
        fila.add(new Gato("Clóvis", 7));

        // Act (executa ação)
        Animal primeiro = fila.poll();
        Animal segundo = fila.poll();

        // Assert (valida resultado)
        assertEquals("Mirna", primeiro.getNome());
        assertEquals("Clóvis", segundo.getNome());
        assertTrue(fila.isEmpty());
    }

}
