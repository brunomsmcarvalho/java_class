public class Conta {
    private Double saldo; //se for privado so posso buscar a variavel dentro da classe
    //public double saldo;
    //Construtor
    public Conta(Double saldo){
        this.saldo=saldo;
    }
    //Metodo publico para aceder
    public Double getSaldo(){
        return saldo;
    }
}
