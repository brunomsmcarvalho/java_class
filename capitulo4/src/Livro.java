public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    // Construtor
    public Livro(String titulo, String autor, int anoPublicacao, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel=disponivel;
    }
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
    }

    //Metodos
    public void emprestar() {
        if (!disponivel) {
            System.out.println("ERRO: O livro " + titulo + " não está disponível.");
        } else {
            System.out.println("O livro " + titulo + " foi emprestado com sucesso.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Livro " + titulo + " devolvido com sucesso");
        } else {
            System.out.println("O livro " + titulo + " encontra-se disponível, não precisa ser devolvido.");
        }
    }

    public void exibirInformacoes() {
        String disponibilidade;
        if (disponivel) {
            disponibilidade = "disponível";
        } else {
            disponibilidade = "indisponível";
        }
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Disponível: " + disponibilidade);
    }
    // Getters e Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;


    }
}

