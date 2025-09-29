public class Veiculo {
    protected String marca;
    protected String modelo;
    protected String cor;
    protected Integer numeroRodas;
    protected Motor motor;

    public Veiculo(String marca, String modelo, String cor, Integer numeroRodas, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.numeroRodas = numeroRodas;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public Integer getNumeroRodas() {
        return numeroRodas;
    }

    public Motor getMotor() {
        return motor;
    }
}
