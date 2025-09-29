package Animal;

public class Main {
    public static void main(String[] args) {

        Gato gato = new Gato("Kiwi", 4);
        gato.setTipoAnimal("Mamífero");
        gato.apresentacao();
        gato.apresentacaoDetalhada();

        Pato pato = new Pato("Poppy", 2);
        pato.setTipoAnimal("Ave");
        pato.apresentacao();
        pato.apresentacaoDetalhada();

        Cachorro cachorro = new Cachorro("Max", 4, "Mamífero");
        cachorro.apresentacao();
        cachorro.apresentacaoDetalhada();
    }

}
