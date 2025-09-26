public class ComparaString {
        public static void main(String[] args) {
            // Criação das Strings
            String s1 = "Java";
            String s2 = "java";

            // Comparação com equals()
            System.out.println("s1.equals(s2)? " + s1.equals(s2));

            // Comparação ignorando maiúsculas/minúsculas
            System.out.println("s1.equalsIgnoreCase(s2)? " + s1.equalsIgnoreCase(s2));

            // Comparação lexicográfica
            int resultado = s1.compareTo(s2);
            if (resultado == 0) {
                System.out.println("Strings iguais (ordem alfabética).");
            } else if (resultado < 0) {
                System.out.println("s1 vem antes de s2 na ordem alfabética.");
            } else {
                System.out.println("s1 vem depois de s2 na ordem alfabética.");
            }
        }
    }

