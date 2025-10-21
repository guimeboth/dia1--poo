package br.com.estudos.concurrency;

import java.util.List;

public class ParallelStreamExample {
    /*
     * Usa múltiplas threads para processar coleções em paralelo — simples e
     * poderoso.
     */
    public static void main(String[] args) {
        List<String> nomes = List.of("Ana", "Bruno", "Clóvis", "Denilson");

        nomes.parallelStream().map(nome -> {
            System.out.println("Processando " + nome + " em " + Thread.currentThread().getName());
            return nome.toUpperCase();
        }).forEach(System.out::println);
    }
}
