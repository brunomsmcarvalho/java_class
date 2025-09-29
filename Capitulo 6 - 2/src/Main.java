public class Main {
    public static void main(String[] args) {
        Motor motorCarro = new Motor
                ("Gasolina", 4, 1.6);
        Carro carro = new Carro
                ("Toyota", "Corolla", "Preto", 4, motorCarro, 4);

        Motor motorMota = new Motor
                ("Gasolina", 2, 0.6);
        Mota mota = new Mota
                ("Yamaha", "MT-07", "Azul", 2, motorMota, "Desportiva");

        System.out.println("--- Teste Carro ---");
        carro.iniciar();
        carro.parar();

        System.out.println("--- Teste Mota ---");
        mota.iniciar();
        mota.parar();
    }
}
