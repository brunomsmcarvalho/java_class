public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    //Construtor
    public Aluno(String nome, String matricula, String curso){
        this.nome=nome;
        this.matricula=matricula;
        this.curso=curso;
    }
    //Métodos
    public void exibirinfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Nº Matricula: "+matricula);
        System.out.println("Curso: "+curso);
    }
    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = "Não atribuído"; // valor padrão inicial
    }
    public void alterarCurso(String novoCurso){
        this.curso = novoCurso;


    }
}
