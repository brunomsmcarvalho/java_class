public class Pessoa {
    String nome;
    int idade;

    //Construtor
    public Pessoa(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }
    //Método
    public void apresentar(){
        System.out.println("Olá meu nome é: " + nome+" e tenho "+idade+" anos");
    }
    public static int somar(int a, int b){
        return a+b;
    }
}
