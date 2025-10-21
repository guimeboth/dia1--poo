# Mini-sistema de POO - Zoológico

Este projeto demonstra os quatro pilares da Programação Orientada a Objetos (POO) em Java(Encapsulamento, Herança, Polimorfismo e Abstração).

## 📌 Dia 1 – Pilares da Programação Orientada a Objetos (POO):
1. **Encapsulamento**
    - Esconder os detalhes internos de uma classe e expor apenas o necessário.
    - Atributos 'nome' e 'idade' são privados em 'Animal' e acessados via getters.
2. **Herança**
    - Uma classe herda características e comportamentos de outra.
    - 'Mamifero' e 'Ave' herdam 'Animal'.
    - 'Cachorro' e 'Gato' herdam de 'Mamifero' e 'Pombo' e 'Galinha' herdam de 'Ave'.
3. **Polimorfismo**
    - Capacidade de um mesmo objeto ou método se comportar de formas diferentes.
    - Método 'emitirSom()' e 'mover()' são sobrescritos em cada animal.
    - Método 'mover()' sobrescritos em situações específicas como as aves que voam nesse método.
4. **Abstração**
    - Focar no que uma classe faz, não em como faz.
    - 'Animal' é uma Classe abstrata que define o contrato de comportamento.

### Execução
```bash
javac javac .\br\com\estudos\*.java
java java br.com.estudos.Main

```

## 📌 Dia 2 – Collections e Generics:
1. **List**
    - Estrutura de dados que armazena elementos, podem ser ordenados e duplicados.
2. **Set**
    - Estrutura de dados que armazena elementos, não garante ordem e não permite duplicados.
3. **Map**
    - Estrutura de dados que armazena pares de chave-valor, onde cada chave é única.
4. **Queue**
    - Estrutura de dados que armazena elementos seguindo o princípio FIFO(First-In, First-Out) ou "Primeiro a Entrar, Primeiro a Sair".
5. **Generics**
    - Permitem que você escreva classes, interfaces e métodos que funcionam com qualquer tipo, mas de forma segura em tempo de compilação.

### Execução
```bash
javac .\br\com\estudos\*.java
java br.com.estudos.MainList
java br.com.estudos.MainMap
java br.com.estudos.MainQueue
java br.com.estudos.MainSet

```


## 📌 Dia 3 - Streams e Lambdas
1. **Streams API**
    - Pipeline de operações para trabalhar com coleções:
        🔹 filter → filtra elementos.
        🔹 map → transforma elementos.
        🔹 sorted → ordena.
        🔹 forEach → percorre.
        🔹 collect → retorna em lista, set, map.
        🔹 reduce → reduz a um único valor (ex: soma, concatenação).
2. **Lambda**
    - Função anônima: (param) -> { corpo }, introduzidas no Java 8 e servem, principalmente, para facilitar a programação funcional.

### 🔹 Exemplo sem vs com Streams
```java
// Sem streams
for (Animal a : animais) {
    if (a instanceof Gato) {
        System.out.println(a);
    }
}

// Com streams
animais.stream()
       .filter(a -> a instanceof Gato)
       .forEach(System.out::println);

```

### Execução
```bash
javac javac .\br\com\estudos\*.java
java java br.com.estudos.MainStream

```

### 📌 Dia 4 – Exceptions e Optional
1. **Exceptions**
    - Uma exception é um evento inesperado que ocorre durante a execução do programa.
    - São divididas entre Checked e Unchecked:
     🔹 Checked → obrigam tratamento (IOException, SQLException).
     🔹 Unchecked (Runtime) → não obrigam tratamento (NullPointerException, IllegalArgumentException).

2. **Optional**
    - Representa um valor que pode existir ou não (substitui null).
    - Métodos principais:
     🔹 of, ofNullable, empty.
     🔹 isPresent, ifPresent.
     🔹 orElse, orElseGet, orElseThrow.
     🔹 map, flatMap.

### Execução
```bash
javac br/com/estudos/*.java
java br.com.estudos.optional.MainOptional

```

### 📌 Dia 5 – Concorrência em Java (Executors, CompletableFuture e Paralelismo)
1. **Thread**
    - Unidade básica de execução dentro de um processo.
    - Cada aplicação Java inicia com a thread principal (main).

2. **ExecutorService**
    - Facilita o gerenciamento de pools de threads.
    - Evita criação/destruição manual de threads com new Thread().
    
    Métodos principais**:
    🔹 submit(Runnable/Callable) → executa tarefa.
    🔹 shutdown() → encerra o pool após concluir tarefas.
    
    Tipos de pools:
    🔹 newFixedThreadPool(n) → número fixo de threads.
    🔹 newSingleThreadExecutor() → apenas uma thread.
    🔹 newCachedThreadPool() → cria threads conforme demanda.

3. **Callable e Future**
    - Callable<T> retorna um valor.
    - Future<T> representa o resultado de uma execução assíncrona.
    - O método get() bloqueia até a conclusão da tarefa.

4. **CompletableFuture**
    - Evolução do Future, com suporte a programação reativa e não bloqueante.
    - Métodos principais:
    🔹 supplyAsync(Supplier) → executa tarefa em outra thread e retorna valor.
    🔹 thenApply(Function) → transforma o resultado.
    🔹 thenAccept(Consumer) → consome o resultado final.
    🔹 thenCombine() → combina dois resultados.
    🔹 allOf() / anyOf() → aguarda múltiplas execuções.
    🔹 exceptionally() → trata erros de forma elegante.

5. **Parallel Streams**
    - Permite processamento paralelo de coleções usando múltiplas threads.
    - Utiliza internamente o ForkJoinPool.
    - Ideal para tarefas CPU-bound (cálculos pesados).
    - Evite em tarefas I/O-bound (como chamadas de rede ou disco).

6. **Boas Práticas**
    - Sempre finalize pools com shutdown().
    - Prefira CompletableFuture para fluxos assíncronos complexos.
    - Evite join() ou get() fora de contextos controlados.
    - Cuide com estado compartilhado — use objetos imutáveis.
    - Monitore o número de threads e ajuste o pool conforme a carga.