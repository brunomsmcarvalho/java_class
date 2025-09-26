public class Carro {
    private String marca;
    private  String modelo;
    private int ano;

    //Construtor
    public Carro(String marca, String modelo, int ano){
        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
    }
    //Metodos
    public void exibirInformacoes(){
        System.out.println("Carro da marca " + marca);
        System.out.println("Modelo " + modelo);
        System.out.println("Do ano " + ano);
    }

    public void ligar(){
        System.out.println("O carro está ligado");
    }
}
