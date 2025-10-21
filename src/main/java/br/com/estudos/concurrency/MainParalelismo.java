package br.com.estudos.concurrency;

import java.util.List;

public class MainParalelismo {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        long inicio = System.currentTimeMillis();

        numeros.stream().map(MainParalelismo::processar).forEach(System.out::println);

        long fim = System.currentTimeMillis();
        System.out.println("Tempo sequencial: " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();

        numeros.parallelStream().map(MainParalelismo::processar).forEach(System.out::println);

        fim = System.currentTimeMillis();

        System.out.println("Tempo paralelo: " + (fim - inicio) + " ms");
    }

    private static Integer processar(Integer n) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        return n * 2;
    }
}
