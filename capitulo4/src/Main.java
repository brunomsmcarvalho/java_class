import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int numeroPrimitivo = 10; //Tipo primitivo
        //Integer numeroObjeto = 20; //Objeto wrapper

        //System.out.println(numeroPrimitivo+numeroObjeto);

        //int numero = 10;
        //System.out.println(numero+5);

        //Integer
        //Integer numeroInteger=10;
        //System.out.println(numeroInteger.toString());
        //System.out.println(Integer.parseInt("20")+5);

        //Metodos utilitarios
//        int numero=Integer.parseInt("123");
//        System.out.println(numero+1);
//
//        //converter inteiro em string
//        String texto = Integer.toString(456);
//        System.out.println(texto);
//
//        //Valor máximo e Mínimo que podemos colocar dentro de um integer
//        System.out.println("Máximo: " + Integer.MAX_VALUE);
//        System.out.println("Mínimo: " + Integer.MIN_VALUE);
//        System.out.println("Máximo: " + Short.MAX_VALUE);
//        System.out.println("Máximo: " + Long.MAX_VALUE);
//        //Para numeros maiores que 2.000.000.000 temos de usar um Long -> (Long.MAX_VALUE)
//
//        int resultado=Integer.compare(10,20);
//        System.out.println(resultado); // Os resultados vão variar entre -1,1 e 0. -1 1ºnum menor que o 2º 0 = numeros sao iguais

//        //ArrayList
//        ArrayList<Integer> numeros = new ArrayList<>();
//
//        numeros.add(10);
//        numeros.add(20);
//        numeros.add(30);
//        numeros.add(40);
//
//        System.out.println("Primeiro número: " + numeros.get(0));
//        numeros.remove(Integer.valueOf(20));
//        System.out.println("Todos os números: ");
//        for (Integer n : numeros) {
//            System.out.print(n + " ");
//
//            int[] numberArray=new int[3]; //preciso declarar sempre o tamanho do array
//            //Adicionar
//            numberArray[0]=10;
//            numberArray[1]=20;
//            numberArray[2]=30;
//            System.out.println(numberArray[0]);
//            for(int i=0;i<3;i++){
//                System.out.println(numberArray[i]);
//        }
//    }
//        //Comparação
//        int a = 100;
//        int b = 100;
//        System.out.println(a==b);
//
//        Integer x=100;//vai apenas até 127 porque são os numeros que estão ja guardados no integer caso o numero seja maior diz que é falso
//        Integer y=100;
//        System.out.println(x==y);
//        System.out.println(x.equals(y));
//
//        Integer m=200;
//        Integer n=200;
//        System.out.println(m==n); //vai buscar o endereço de memoria, por isso diz que nao sao iguais, ou seja, o 100 vai estar num espaço de memoria igual
//        System.out.println(m.equals(n));

//        //Genérico
//        ArrayList<Integer> numeros=new ArrayList<>();
//        numeros.add(10);
//        numeros.add(20);
//        numeros.add(30);
//
//        Integer valor;
//        valor = numeros.get(1);
//        System.out.println("Valor na posição 1: "+ valor);
//
//        //Não genérico
//        ArrayList lista =new ArrayList();
//        lista.add(Integer.valueOf(10));
//        lista.add(Integer.valueOf(20));
//
//        Integer valorInicial = (Integer) lista.get(0);
//        System.out.println("Valor na posição 0: "+valorInicial);
//        lista.add("Texto");
//    Integer a=15;
//    Integer b=20;
//    Integer c=15;
//
//        System.out.println("a==b? "+(a==b));
//        System.out.println("a=/=? "+(a!=b));
//        System.out.println("a>b? "+(a>b));
//        System.out.println("a<b? "+(a<b));
//        System.out.println("a>=b? "+(a>=b));
//        System.out.println("a<=b? "+(a<=b));
//        System.out.println("a.equals(b)? "+a.equals(b));
//        System.out.println("a.equals(c)? "+a.equals(c));
//        //Maior
//        System.out.println("a>b? " + (a.compareTo(b)>0));
//        //Menor
//        System.out.println("a<b? " + (a.compareTo(b)<0));
//        //Maior ou igual
//        System.out.println("a>=c? " + (a.compareTo(c)>=0));
//        //Menor ou igual
//        System.out.println("a<=c? " + (a.compareTo(c)<=0));
//     //Lógica
//        Integer idade=20;
//        Boolean estudante = true;
//        if(idade>= 18 && estudante) {
//            System.out.println("Maior de idade e estudante");
//        }else{
//            System.out.println("Não atende as condições");
//        }
//        if(idade< 18 || estudante) {
//            System.out.println("Menor de idade e estudante");
//        }else {
//            System.out.println("Não atende a nenhuma condição");
//        }
//        if(!estudante) {
//            System.out.println("Não é estudante");
//        }else{
//            System.out.println("É estudante");
//        }
        //EStruturas de Controlo
        //if/else
//        int idade = 18;
//        if(idade>=18) {
//            System.out.println("Maior de idade");
//        }else{
//            System.out.println("Menor de idade");

//Switch case - Caso não usarmos break ele vai imprimir tudo o que está por baixo do caso onde ele vai entrar
//        int dia = 3;
//        switch(dia){
//            case 1:
//                System.out.println("Segunda");
//                break;
//            case 2:
//                System.out.println("Terça");
//                break;
//            case 3:
//                System.out.println("Quarta");
//                break;
//            default:
//                System.out.println("Outro dia");
//    }
//        //while
//        int contador=1;
//        while(contador<=5) {
//            System.out.println("Contador: " + contador);
//            contador++;
//         }
//        //for
//        for(int i=0;i<5;i++){
//            System.out.println("i= "+i);
//        }
//        String[] nomes={"Ana","João","Maria"};
//        for(String nome:nomes){
//            System.out.println("Nome: "+nome);
//        }
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Escreva um número: ");
//        float numF=sc.nextFloat();
//        System.out.println("O número introduzido foi "+numF);
//
//        Scanner scanner = new Scanner(System.in);
//
//        double[] notas = new double[5];
//        double soma = 0.0;
//
//        for (int i = 0; i < notas.length; i++) {
//            System.out.print("Nota do aluno " + (i + 1) + ": ");
//            notas[i] = scanner.nextDouble();
//            soma += notas[i];
//        }
//
//        double media = soma / notas.length;
//
//        String classificacao;
//        if (media >= 9.0) {
//            classificacao = "Excelente";
//        } else if (media >= 7.0) {
//            classificacao = "Bom";
//        } else if (media >= 5.0) {
//            classificacao = "Regular";
//        } else {
//            classificacao = "Insuficiente";
//        }
//
//        System.out.printf("Média da turma: %.2f%n", media);
//        System.out.println("Classificação: " + classificacao);
//
        //        scanner.close();
//        Double[] notas={6.5,9.0,6.5,7.2,8.6};
//        Double soma=0.0;
//
//        for(int i=0;i<5;i++){
//            soma = notas[i] + soma;
//
//        }
//        Double media;
//        media = soma/5;
//            System.out.println("A m+edia da turma é de: " + media);
//        if(media>=9) {
//            System.out.println("Excelente");
//        } else if (media >=7) {
//            System.out.println("Bom");
//        } else if (media >=5) {
//            System.out.println("Regular");
//        }else {
//            System.out.println("Insuficiente");
//
//        }
//        }

        Livro livro1 = new Livro("Senhor dos Anéis", "J.R.R.Token", 1954, false);
        Livro livro2 = new Livro("Conversas Corajosas", "Elisama Santos", 2022);

        livro2.exibirInformacoes();
        livro2.devolver();
        livro2.emprestar();
        livro1.exibirInformacoes();
        livro1.emprestar();
        livro1.devolver();
        livro1.setTitulo("Cecal");
        livro1.exibirInformacoes();
        System.out.println(livro2.getTitulo());
    }
}






