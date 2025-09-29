package Animal;

public class Animal {
    protected String nome;
    protected Integer numeroPatas;
    protected Boolean vertebrado;
    private String tipoAnimal;

    //construtor
    public Animal(String nome, Integer numeroPatas){
        this.nome=nome;
        this.numeroPatas=numeroPatas;
        this.vertebrado=true;
    }
    //construtor
    public Animal(String nome,
                  Integer numeroPatas,
                  String tipoAnimal){
        this.nome=nome;
        this.numeroPatas=numeroPatas;
        this.vertebrado=true;
        this.tipoAnimal=tipoAnimal;
    }
    public Animal(String nome,
                  Integer numeroPatas,
                  Boolean vertebrado,
                  String tipoAnimal){
        this.nome=nome;
        this.numeroPatas=numeroPatas;
        this.vertebrado=vertebrado;
        this.tipoAnimal=tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public Integer getNumeroPatas(){
        return numeroPatas;
    }

    public String getTipoAnimal(){
        return tipoAnimal;
    }

    // Métodos de apresentação padronizados
    public void apresentacao() {
        System.out.println("Meu nome é " + nome +
                " e tenho " + numeroPatas + " patas");
    }

    public void apresentacaoDetalhada() {
        System.out.println("Meu nome é " + nome +
                " e tenho " + numeroPatas + " patas" +
                ", tipo: " + getTipoAnimal() +
                ", vertebrado: " + vertebrado);
    }

}
