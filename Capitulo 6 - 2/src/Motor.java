public class Motor {
    private String tipoCombustivel;
    private Integer numeroCilindros;
    private Double cilindrada;

    public Motor(String tipoCombustivel, Integer numeroCilindros, Double cilindrada) {
        this.tipoCombustivel = tipoCombustivel;
        this.numeroCilindros = numeroCilindros;
        this.cilindrada = cilindrada;
    }

    public void ligar() {
        System.out.println("Motor ligado.");
    }

    public void desligar() {
        System.out.println("Motor desligado.");
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public Integer getNumeroCilindros() {
        return numeroCilindros;
    }

    public Double getCilindrada() {
        return cilindrada;
    }
}
