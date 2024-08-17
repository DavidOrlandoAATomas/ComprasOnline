package Set.Operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int cod){
        convidadoSet.add(new Convidado(nome, cod));
    }

    public void removerConvidado_Convite(int cod){
        Convidado Convidado_Remover = null;
        for (Convidado c : convidadoSet){
            if(c.getCodigo_convite() == cod){
                Convidado_Remover = c;
                break;
            }
        }
        convidadoSet.remove(Convidado_Remover);
    }

    public int contarConvidado(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado cc = new ConjuntoConvidado();

        cc.adicionarConvidado("Eri", 1);
        cc.adicionarConvidado("Diddy", 2);
        cc.adicionarConvidado("Rui", 3);
        cc.adicionarConvidado("Eri", 4);

        System.out.println(cc.contarConvidado());
        cc.exibirConvidados();

        cc.removerConvidado_Convite(3);
        cc.exibirConvidados();
    }
}
