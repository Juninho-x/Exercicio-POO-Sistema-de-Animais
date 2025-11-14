import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Rex"));
        animais.add(new Cachorro("Bob"));
        animais.add(new Gato("Mimi"));
        animais.add(new Gato("Luna"));

        for (Animal animal : animais) {
            animal.dormir();      // método concreto da classe pai
            animal.fazerSom();    // polimorfismo (cada um faz o som diferente)
            System.out.println("-------------------");
        }
    }
}

