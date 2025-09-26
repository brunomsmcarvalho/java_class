public class Compare {
        public static void main(String[] args) {
            // Criação das variáveis
            Integer a = 50;
            Integer b = 75;

            // Usando compareTo()
            int resultado = a.compareTo(b);

            // Verificação
            if (resultado > 0) {
                System.out.println("a é maior");
            } else if (resultado < 0) {
                System.out.println("a é menor");
            } else {
                System.out.println("a é igual");
            }
        }
    }

