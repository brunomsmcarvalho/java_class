package Animal;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Cachorro("Rolo");
        Animal a2 = new Gato("Coockie");
        Animal a3 = new Cachorro("Gato");
        Animal a4 = new Gato("Lisa");

        a1.apresentar();
        a1.emitirSom();
        System.out.println("----");

        a2.apresentar();
        a2.emitirSom();
        System.out.println("----");

        a3.apresentar();
        a3.emitirSom();
        System.out.println("----");

        a4.apresentar();
        a4.emitirSom();
        System.out.println("----");
    }
}
