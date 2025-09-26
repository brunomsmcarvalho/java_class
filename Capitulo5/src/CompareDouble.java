public class CompareDouble {
        public static void main(String[] args) {
            // Criação das variáveis
            Double nota1 = 8.5;
            Double nota2 = 7.0;

            // Comparação usando compareTo()
            int resultado = nota1.compareTo(nota2);

            if (resultado > 0) {
                System.out.println("Nota1 é maior");
            } else if (resultado < 0) {
                System.out.println("Nota2 é maior");
            } else {
                System.out.println("Notas iguais");
            }
        }
    }

