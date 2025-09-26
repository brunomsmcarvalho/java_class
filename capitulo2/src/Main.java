public class Main {
    public static void main(String[] args){
        Carro carro = new Carro("Mercedes","Benz",2020);
        carro.exibirInformacoes();
        carro.ligar();

        Carro carro1 = new Carro("Opel","Astra",2011);
        carro1.exibirInformacoes();
        carro1.ligar();
    }
}
