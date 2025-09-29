package Animal;

public class Pato extends Animal {

    //construtor
    public Pato(String nome, Integer numeroPatas){
        super(nome, numeroPatas);
    }
    public Pato(String nome,
                Integer numeroPatas,
                String tipoAnimal) {
        super(nome, numeroPatas, tipoAnimal);
    }

    @Override
    public void apresentacao() {
        super.apresentacao();
    }

    @Override
    public void apresentacaoDetalhada() {
        System.out.println("Meu nome é " + nome +
                ", tenho " + numeroPatas + " patas" +
                ", sou da classe: " + getTipoAnimal() +
                ", vertebrado: " + vertebrado + ". Quak Quak");
    }
}
