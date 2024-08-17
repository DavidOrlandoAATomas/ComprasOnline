package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    Map<Long, Produto> estoqueProduto;

    public EstoqueProduto() {
        this.estoqueProduto = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quant){
        estoqueProduto.put(cod, new Produto(nome,preco,quant));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProduto);
    }

    public double estoqueValorTotal(){
        double estoquetotal = 0.0;
        if (!estoqueProduto.isEmpty()){
            for (Produto p : estoqueProduto.values()){
                estoquetotal += p.getPreco() * p.getQuantidade();
            }
        }
        return estoquetotal;
    }

    public Produto obterProdutoMaiorValor(){
        Produto produtoMaiorValor = null;
        double maiorpreco = 0;
        for (Produto p : estoqueProduto.values()){
            if (!estoqueProduto.isEmpty()){
                if (p.getPreco() >= maiorpreco){
                    produtoMaiorValor = p;
                }
            }
        }
        return produtoMaiorValor;
    }

    public static void main(String[] args) {
        EstoqueProduto ep = new EstoqueProduto();
        ep.adicionarProduto(1, "p1", 2.0, 2);
        ep.adicionarProduto(2, "p2", 5.0, 1);
        ep.adicionarProduto(3, "p3", 40.0, 2);
        ep.adicionarProduto(4, "p4", 12.0, 1);
        ep.adicionarProduto(5, "p5", 20.0, 1);

        ep.exibirProdutos();
        System.out.println(ep.estoqueValorTotal());
        System.out.println(ep.obterProdutoMaiorValor());
    }
}
