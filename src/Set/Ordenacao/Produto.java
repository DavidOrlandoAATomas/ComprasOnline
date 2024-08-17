package Set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private String nome;
    private long cod;
    private double preco;
    private int quantidade;

    public Produto(String nome, long cod, int quantidade, double preco) {
        this.nome = nome;
        this.cod = cod;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareTo(p.getNome());
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }


    @Override
    public String toString() {
        return "\nProduto:" +
                "\nnome=" + nome+
                "\ncod= " + cod +
                "\npreco= " + preco +
                "\nquantidade=" + quantidade +
                "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return cod == produto.cod;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cod);
    }
}
class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}