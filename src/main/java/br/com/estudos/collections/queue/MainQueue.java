package br.com.estudos.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

import br.com.estudos.model.Animal;
import br.com.estudos.model.Cachorro;
import br.com.estudos.model.Gato;

public class MainQueue {
    public static void main(String[] args) {
        Queue<Animal> fila = new ArrayDeque<>();
        fila.offer(new Cachorro("Solphie", 7));
        fila.offer(new Cachorro("Mirna", 8));
        fila.offer(new Gato("Clóvis", 7));
        fila.offer(new Gato("Olga", 6));
        fila.offer(new Gato("Rebeca", 5));
        fila.offer(new Gato("Alina", 4));

        imprimirAtendimentos(fila);
    }

    private static <T extends Animal> void imprimirAtendimentos(Queue<T> queue) {
        System.out.println("Iniciando atendimentos");
        while (!queue.isEmpty()) {
            System.out.println("Paciente: " + queue.poll().toString());
        }
        System.out.println("Fim de atendimentos!");
    }
}
