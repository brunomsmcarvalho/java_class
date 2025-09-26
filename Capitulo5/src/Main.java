public class Main {
    public static void main(String[] args){
    Pessoa p = new Pessoa();
    p.setNome("Ana");
        System.out.println(p.getNome());

        Conta c = new Conta(5d);
        System.out.println(c.getSaldo());

        Cachorro cao=new Cachorro("Poppy "); //cao é o objeto
        cao.latir();
    }
}
