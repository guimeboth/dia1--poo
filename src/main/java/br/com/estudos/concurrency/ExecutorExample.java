package br.com.estudos.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    /*
     * O ExecutorService gerencia pool de threads — evitando criar/destruir threads
     * manualmente.
     */
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable tarefa = () -> {
            System.out.println("Executando em: " + Thread.currentThread().getName());
        };

        for (int i = 0; i < 5; i++) {
            executor.submit(tarefa);
        }

        // Sempre chame shutdown() (ou shutdownNow() em emergência).
        executor.shutdown(); // Encerra após as tarefas terminarem
    }
}
