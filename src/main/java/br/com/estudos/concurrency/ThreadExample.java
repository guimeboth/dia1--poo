package br.com.estudos.concurrency;

public class ThreadExample {
    /**
     * 🧵 Thread
     * É a menor unidade de execução dentro de um processo.
     * Cada aplicação Java tem pelo menos uma thread principal: a que roda o main().
     */
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("Rodando em: " + Thread.currentThread().getName()));
        t.start();
        System.out.println("Main rodando em: " + Thread.currentThread().getName());
    }
}
