import java.util.Date;

public class ContaBancaria {
    private String titular;
    private Double saldo;
    private Date dataAbertura;

    // Construtor
    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0.0; // começa zerado
        this.dataAbertura = new Date(); // data e hora atuais
    }

    // Método para depositar
    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Método para sacar
    public void sacar(double valor){
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido: "+ saldo+"R$");
        }
    }

    // Exibir informações da conta
    public void getInfoConta(){
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Data de abertura: " + dataAbertura);
    }

    // Método para consultar saldo
    public double getSaldo(){

        return saldo;
    }
}



