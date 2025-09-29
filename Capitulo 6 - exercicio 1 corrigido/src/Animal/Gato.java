package Animal;

public class Gato extends Animal {

    //construtor
    public Gato(String nome, Integer numeroPatas) {
        super(nome, numeroPatas);
    }
    //construtor
    public Gato(String nome,
                Integer numeroPatas,
                String tipoAnimal) {
        super(nome, numeroPatas, tipoAnimal);
    }

    @Override
    public void apresentacao() {
        super.apresentacao();
    }

    // Sobrescrita com mensagem diferenciada
    @Override
    public void apresentacaoDetalhada() {
        System.out.println("Meu nome é " + nome +
                ", tenho " + numeroPatas + " patas" +
                ", sou da classe: " + getTipoAnimal() +
                ", e vertebrado: " + vertebrado +
                ". Miau!");
    }

}
