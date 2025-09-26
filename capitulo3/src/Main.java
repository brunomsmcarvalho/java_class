public class Main {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa ("Márcia", 43);
        Pessoa p2 = new Pessoa("Cristiane",44);

        p1.apresentar();
        p2.apresentar();
        int resultado= Pessoa.somar(5,10);
        System.out.println("A soma de a + b é: " + resultado);
    }
}
