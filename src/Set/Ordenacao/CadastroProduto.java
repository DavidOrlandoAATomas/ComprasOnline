package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long cod, double preco, int quant){
        produtoSet.add(new Produto(nome,cod,quant, preco));
    }

    public Set<Produto> exibirProduto_Nome(){
        Set<Produto> OrdenarP_nome = new TreeSet<>(produtoSet);
        return OrdenarP_nome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> OrdenarP_preco = new TreeSet<>(new ComparatorPorPreco());
        OrdenarP_preco.addAll(produtoSet);
        return OrdenarP_preco;
    }

    public static void main(String[] args) {
        CadastroProduto cp = new CadastroProduto();
         cp.adicionarProduto("Skate", 123,234.7, 2);
         cp.adicionarProduto("T-shirt", 132,45.9, 5);
         cp.adicionarProduto("Bola", 321,24.5, 1);
         cp.adicionarProduto("Escova", 213,7.99, 1);

        System.out.println(cp.exibirProduto_Nome());
        System.out.println(cp.exibirPorPreco());
    }
}
