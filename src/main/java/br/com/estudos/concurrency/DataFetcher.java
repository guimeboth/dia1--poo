package br.com.estudos.concurrency;

import java.util.concurrent.CompletableFuture;

public class DataFetcher {
    public static void main(String[] args) {
        CompletableFuture<String> api = CompletableFuture.supplyAsync(() -> {
            delay(1000);
            return "API";
        });

        CompletableFuture db = CompletableFuture.supplyAsync(() -> {
            delay(5000);
            return "Banco";
        });

        CompletableFuture cache = CompletableFuture.supplyAsync(() -> {
            delay(500);
            return "cache";
        });

        CompletableFuture.allOf(api, db, cache).thenRun(() -> System.out.println("Todos os dados carregados!")).join();
    }

    private static void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
