public class ParImpar {
        public static void main(String[] args) {
            Integer numero = 3;
            // Verificar se é par ou ímpar
            if (numero % 2 == 0) {
                System.out.println(numero + " é par");
            } else {
                System.out.println(numero + " é ímpar");
            }

            // Usar switch com intValue()
            switch (numero.intValue()) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("Um");
                    break;
                default:
                    System.out.println("Não é 1 nem 0, outro número");
                    break;
            }
        }
    }

