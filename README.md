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
javac javac .\br\com\estudos\*.java
java java br.com.estudos.MainList
java java br.com.estudos.MainMap
java java br.com.estudos.MainQueue
java java br.com.estudos.MainSet

```