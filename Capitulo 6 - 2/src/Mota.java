public class Mota extends Veiculo {
    private String tipoMota;

    public Mota(String marca, String modelo, String cor, Integer numeroRodas, Motor motor, String tipoMota) {
        super(marca, modelo, cor, numeroRodas, motor);
        this.tipoMota = tipoMota;
    }

    public void iniciar() {
        System.out.println("Mota a iniciar...");
        if (motor != null) {
            motor.ligar();
        }
    }

    public void parar() {
        System.out.println("Mota a parar...");
        if (motor != null) {
            motor.desligar();
        }
    }

    public String getTipoMota() {
        return tipoMota;
    }
}
