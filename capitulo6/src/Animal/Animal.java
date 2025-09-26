package Animal;

class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("Som de animal");
    }

    public void apresentar() {
        System.out.println("Meu nome é " + nome);
    }
}