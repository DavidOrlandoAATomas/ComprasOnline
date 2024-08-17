package Set.Pesquisa;

import java.util.Objects;

public class Contacto {
    private String nome;
    private int numero_tel;

    public Contacto(String nome, int numero_tel) {
        this.nome = nome;
        this.numero_tel = numero_tel;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero_tel() {
        return numero_tel;
    }

    public void setNumero_tel(int numero_tel) {
        this.numero_tel = numero_tel;
    }

    @Override
    public String toString() {
        return "\nContacto:" +
                "\nNome= " + nome +
                "\nNúmero de telefone= " + numero_tel +
                "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(nome, contacto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
