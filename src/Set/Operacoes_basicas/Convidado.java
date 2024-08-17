package Set.Operacoes_basicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigo_convite;

    public Convidado(String nome, int codigo_convite) {
        this.nome = nome;
        this.codigo_convite = codigo_convite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo_convite() {
        return codigo_convite;
    }

    @Override
    public String toString() {
        return "\nConvidado:" +
                "\nNome do convidado= " + nome +
                "\nCódigo do convite= " + codigo_convite +
                "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codigo_convite == convidado.codigo_convite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo_convite);
    }
}
