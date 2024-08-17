package Lists.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class Catalogo_Livos {

    private List<Livros> livrosList;

    public Catalogo_Livos() {this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro (String nome, String titulo, int ano){
        livrosList.add(new Livros(nome,titulo,ano));
    }

    public List<Livros> pesquisar_Autor(String nome){
        List<Livros> livros_autor= new ArrayList<>();
        if (!livrosList.isEmpty()){
            for (Livros l : livrosList){
                if (l.getNome().equalsIgnoreCase(nome)){
                    livros_autor.add(l);
                }
            }
        }
        return livros_autor;
    }
    public List<Livros> pesquisar_Ano(int ano_inicial, int ano_final){
        List<Livros> livros_Ano= new ArrayList<>();
        if (!livrosList.isEmpty()){
            for (Livros l : livrosList){
                if (l.getAno_publicado() >= ano_inicial && l.getAno_publicado()<= ano_final){
                    livros_Ano.add(l);
                }
            }
        }
        return livros_Ano;
    }
    public Livros pesquisar_Titulo(String titulo){
       Livros livros_Titulo= null;
        if (!livrosList.isEmpty()){
            for (Livros l : livrosList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livros_Titulo = l;
                    break;
                }
            }
        }
        return livros_Titulo;
    }

    public static void main(String[] args) {
        Catalogo_Livos cl = new Catalogo_Livos();

        cl.adicionarLivro("autor1", "livro1", 2003);
        cl.adicionarLivro("autor1", "livro2", 2004);
        cl.adicionarLivro("autor2", "livro1", 2004);
        cl.adicionarLivro("autor2", "livro2", 2005);
        cl.adicionarLivro("autor3", "livro1", 2006);
        System.out.println(cl.pesquisar_Autor("autor1"));

        System.out.println(cl.pesquisar_Autor("autor2"));

        System.out.println(cl.pesquisar_Ano(2004, 2006));

        System.out.println(cl.pesquisar_Ano(2003, 2005));

        System.out.println(cl.pesquisar_Titulo("livro1"));
    }
}
