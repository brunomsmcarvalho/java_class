public class Iqualidade {
        public static void main(String[] args) {
            // Criação das variáveis wrapper
            Integer x = 100;
            Integer y = 100;

            // Comparação inicial
            System.out.println("x = " + x + ", y = " + y);
            System.out.println("x.equals(y)? " + x.equals(y)); // true, pois 100 == 100

            // Mudando o valor de y
            y = 200;
            System.out.println("\nAgora, y = " + y);
            System.out.println("x.equals(y)? " + x.equals(y)); // false, pois 100 != 200
        }
    }

