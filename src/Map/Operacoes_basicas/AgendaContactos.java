package Map.Operacoes_basicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContactos {
    private Map<String, Integer> agendaContacto;

    public AgendaContactos() {
        this.agendaContacto = new HashMap<>();
    }

    public void adicionarContacto(String nome, Integer n){
        agendaContacto.put(nome, n);
    }

    public void removerContacto_Nome(String nome){
        if (!agendaContacto.isEmpty()) {
            agendaContacto.remove(nome);
        }
    }

    public void exibirContacto(){
        System.out.println(agendaContacto);
    }

    public Integer pesquisar_Nome(String nome){
        Integer Numero_Nome = null;
        Numero_Nome = agendaContacto.get(nome);
        return Numero_Nome;
    }

    public static void main(String[] args) {
        AgendaContactos ac = new AgendaContactos();

        ac.adicionarContacto("Camila", 923904);
        ac.adicionarContacto("Francisco", 923564);
        ac.adicionarContacto("Francisco Bernabé", 920904);
        ac.adicionarContacto("Camila", 923904);

        ac.exibirContacto();
        //ac.removerContacto_Nome("Camila");
        System.out.println(ac.pesquisar_Nome("Francisco"));
    }
}
