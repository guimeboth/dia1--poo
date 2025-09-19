import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.estudos.Animal;
import br.com.estudos.Cachorro;
import br.com.estudos.Gato;

public class ListTest {

    @DisplayName("Se eu adicionar animais com nomes iniciando com Z, O e A e ordernar essa lista, o resultado da ordenação deve ser os animais na seguinte ordem de nome: A O e Z")
    @Test
    void deveOrdenarElementosPorNome() {
        // Arrange (prepara cenário)
        Cachorro zeus = new Cachorro("Zeus", 2);
        Gato olga = new Gato("Olga", 6);
        Gato alina = new Gato("Alina", 4);
        Gato clovis = new Gato("Clóvis", 8);
        Gato rebeca = new Gato("Rebeca", 7);

        // Act (executa ação)
        List<Animal> animais = List.of(zeus, olga, alina, clovis, rebeca);

        // Assert (valida resultado)
        assertEquals(List.of(alina, olga, zeus),
                animais.stream().sorted(Comparator.comparing(Animal::getNome)).toList());

    }

    @DisplayName("Se eu adicionar animais com idades entre 8,6 e 2 e ordernar essa lista, o resultado da ordenação deve ser os animais na seguinte ordem de idade: 2, 6 e 8")
    @Test
    void deveOrdenarElementosPorIdade() {
        // Arrange (prepara cenário)
        Cachorro zeus = new Cachorro("Zeus", 8);
        Gato olga = new Gato("Olga", 6);
        Gato rebeca = new Gato("Rebeca", 2);

        // Act (executa ação)
        List<Animal> animais = List.of(zeus, olga, rebeca);

        // Assert (valida resultado)
        assertEquals(List.of(rebeca, olga, zeus),
                animais.stream().sorted(Comparator.comparing(Animal::getIdade)).toList());

    }

    @DisplayName("Se eu adicionar dois elementos duplicados (com equals/hashcode implementado), a quantidade de elementos na lista deve ser 2.")
    @Test
    void devePermitirDuplicados() {
        List<Animal> animais = List.of(new Gato("Olga", 6), new Gato("Olga", 6));

        assertEquals(2, animais.size());
    }

}
