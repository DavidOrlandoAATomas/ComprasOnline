package Lists.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenacao_Pessoas {

    private List<Pessoas> pessoasList;

    public Ordenacao_Pessoas() {
        this.pessoasList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoasList.add(new Pessoas(nome, idade, altura));
    }

    public List<Pessoas> ordenar_Idade() {
        List<Pessoas> Ordenar_Idade = new ArrayList<>(pessoasList);
        Collections.sort(Ordenar_Idade);
        return Ordenar_Idade;
    }
    public List<Pessoas> ordenar_altura(){
        List<Pessoas> Ordenar_Altura = new ArrayList<>(pessoasList);
        Collections.sort(Ordenar_Altura, new CompararPorAltura());
        return Ordenar_Altura;
    }

    public static void main(String[] args) {
        Ordenacao_Pessoas op = new Ordenacao_Pessoas();

        op.adicionarPessoa("p1", 20, 1.60);
        op.adicionarPessoa("p3", 24, 1.80);
        op.adicionarPessoa("p1", 19, 1.78);
        op.adicionarPessoa("p1", 34, 1.71);

        System.out.println(op.ordenar_Idade());
        System.out.println(op.ordenar_altura());
    }

}
