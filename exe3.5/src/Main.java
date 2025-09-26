public class Main {
    public static void main(String[] args){
        Aluno aluno = new Aluno("João","001-25","PI" );
        aluno.exibirinfo();
        aluno.alterarCurso("WD");
        aluno.exibirinfo();
        System.out.println("");
        Aluno aluno1 = new Aluno("Maria","002-25","WD");
        aluno1.exibirinfo();
        System.out.println("");
        Aluno aluno2 = new Aluno("José","003-25","PI");
        aluno2.exibirinfo();
        aluno2.alterarCurso("WD");
        aluno2.exibirinfo();
        System.out.println("");
        Aluno aluno3 = new Aluno("António","004-25","WD");
        aluno3.exibirinfo();
        aluno3.alterarCurso("PI");
        aluno3.exibirinfo();
        System.out.println("");
        Aluno aluno4 = new Aluno("Teresa","005-25","WD");
        aluno4.exibirinfo();
        System.out.println("");
        Aluno aluno5 = new Aluno("Mariana","006-25","PI");
        aluno5.exibirinfo();
        aluno5.alterarCurso("WD");
        aluno5.exibirinfo();
        System.out.println("");
        Aluno aluno6 = new Aluno("Carla","007-25");
        aluno6.exibirinfo();
        aluno6.alterarCurso("PI");
        aluno6.exibirinfo();
    }
}
