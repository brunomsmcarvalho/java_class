public class Carro extends Veiculo {
    private Integer numeroPortas;

    public Carro(String marca, String modelo, String cor, Integer numeroRodas, Motor motor, Integer numeroPortas) {
        super(marca, modelo, cor, numeroRodas, motor);
        this.numeroPortas = numeroPortas;
    }

    public void iniciar() {
        System.out.println("Carro a iniciar...");
        if (motor != null) {
            motor.ligar();
        }
    }

    public void parar() {
        System.out.println("Carro a parar...");
        if (motor != null) {
            motor.desligar();
        }
    }

    public Integer getNumeroPortas() {
        return numeroPortas;
    }
}
