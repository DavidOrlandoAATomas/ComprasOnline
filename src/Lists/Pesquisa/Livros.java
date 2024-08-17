package Lists.Pesquisa;

public class Livros {
    private String nome;
    private String titulo;
    private int ano_publicado;

    public Livros(String nome, String titulo, int ano_publicado) {
        this.nome = nome;
        this.titulo = titulo;
        this.ano_publicado = ano_publicado;
    }

    public String getNome() {
        return nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno_publicado() {
        return ano_publicado;
    }

    @Override
    public String toString() {
        return "\nLivros:\n" +
                "Autor= " + nome +
                "\nTítulo= " + titulo+
                "\nAno publicado= " + ano_publicado +
                "\n";
    }
}
