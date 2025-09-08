package br.com.estudos;

import java.util.ArrayDeque;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue<Animal> queue = new ArrayDeque<>();
        queue.offer(new Cachorro("Solphie", 7));
        queue.offer(new Cachorro("Mirna", 8));
        queue.offer(new Gato("Clóvis", 7));
        queue.offer(new Gato("Olga", 6));
        queue.offer(new Gato("Rebeca", 5));
        queue.offer(new Gato("Alina", 4));

        imprimirAtendimentos(queue);
        System.out.println("Fim dos atendimentos!");
    }

    private static <T extends Animal> void imprimirAtendimentos(Queue<T> queue) {
        System.out.println("Iniciando atendimentos com " + queue.peek().toString());
        queue.poll();
        queue.forEach(a -> {
            System.out.println("Atendendo " + a.toString());
            queue.poll();
        });
    }
}
