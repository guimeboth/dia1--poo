package br.com.estudos.concurrency;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    /*
     * O CompletableFuture melhora o Future permitindo encadeamento, tratamento de
     * erros e composição de tarefas.
     * 
     * Destaques:
     * 
     * supplyAsync(Supplier) → executa em outra thread e retorna um valor.
     * thenApply → transforma o resultado.
     * thenAccept → consome o resultado.
     * exceptionally → trata exceções.
     */
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            System.out.println("Buscando dados...");
            return "Dados carregados";
        }).thenApply(dados -> dados.toUpperCase())
                .thenAccept(System.out::println)
                .join(); // aguarda o final da cadeia

        CompletableFuture.supplyAsync(() -> {
            if (true) {
                throw new RuntimeException("Falha na requisição!");
            }
            return "Sucesso";
        }).exceptionally(ex -> {
            System.out.println("Erro: " + ex.getMessage());
            return "Valor padrão";
        }).thenAccept(System.out::println);
    }
}
