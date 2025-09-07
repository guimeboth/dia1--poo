# Mini-sistema de POO - Zoológico

Este projeto demonstra os quatro pilares da Programação Orientada a Objetos (POO) em Java(Encapsulamento, Herança, Polimorfismo e Abstração).

### Pilares aplicados:

1. **Encapsulamento**
    - Esconder os detalhes internos de uma classe e expor apenas o necessário.
    - Atributos 'nome' e 'idade' são privados em 'Animal' e acessados via getters.
2. **Herança**
    - Uma classe herda características e comportamentos de outra.
    - 'Mamifero' e 'Ave' herdam 'Animal'.
    - 'Cachorro' e 'Gato' herdam de 'Mamifero' e 'Pombo' e 'Galinha' herdam de 'Ave'.
3. **Polimorfismo**
    - Capacidade de um mesmo método se comportar de formas diferentes.
    - Método 'emitirSom()' e 'mover()' são sobrescritos em cada animal.
    - Método 'mover()' sobrescritos em situações específicas como as aves que voam nesse método.
4. **Abstração**
    - Focar no que uma classe faz, não em como faz.
    - 'Animal' é uma Classe abstrata que define o contrato de comportamento.

### Execução
```bash
javac zoo/*.java
java zoo.Main