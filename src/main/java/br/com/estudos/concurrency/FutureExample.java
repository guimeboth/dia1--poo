package br.com.estudos.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
    /*
     * Callable<T> retorna um valor (ao contrário de Runnable), e Future<T>
     * representa o resultado assíncrono.
     */
    public static void main(String[] args) throws Exception {
        // Runtime.getRuntime().availableProcessors() retorna o número de núcleos lógicos (CPU cores) disponíveis na máquina onde a JVM está rodando.
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> tarefa = () -> {
            Thread.sleep(1000);
            return 42;
        };

        // Assíncrono: “não precisa esperar uma tarefa terminar para começar outra.”
        Future<Integer> futuro = executor.submit(tarefa);
        // Então...segue o código sem esperar o resultado da tarefa

        System.out.println("Fazendo outra coisa...");
        Integer resultado = futuro.get(); // bloqueia até terminar
        System.out.println("Resultado: " + resultado);

        executor.shutdown();
    }
}
