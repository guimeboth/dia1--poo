package br.com.estudos.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainCompletableFuture {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> tarefa(1), executor);
        CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(() -> tarefa(2), executor);
        CompletableFuture<Integer> f3 = CompletableFuture.supplyAsync(() -> tarefa(3), executor);

        CompletableFuture<Void> all = CompletableFuture.allOf(f1, f2, f3);

        all.join(); // Espera todas terminarem

        System.out.println("Resultados: " + f1.join() + ", " + f2.join() + ", " + f3.join());

        executor.shutdown();
    }

    private static int tarefa(int n) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        return n * 10;
    }
}
