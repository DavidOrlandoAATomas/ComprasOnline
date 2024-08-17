package Map.Ordenacao;

import Map.Operacoes_basicas.AgendaContactos;
import Map.Pesquisa.Produto;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    Map<LocalDate, Eventos> agendarEnventos;

    public AgendaEventos() {
        this.agendarEnventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate date, String nome, String atracao){
        agendarEnventos.put(date, new Eventos(nome,atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Eventos> Exibir = new TreeMap<>(agendarEnventos);
        System.out.println(Exibir);
    }

    public void obterProximoEvento(){
        /*Set<LocalDate> dateset = agendarEnventos.keySet();
        Collection<Eventos> values = agendarEnventos.values();*/
        //agendarEnventos.get();

        LocalDate dataAtual = LocalDate.now();
        Eventos ProxEvento = null;
        LocalDate ProxData = null;
        Map<LocalDate, Eventos> Exibir = new TreeMap<>(agendarEnventos);
        for (Map.Entry<LocalDate, Eventos> entry : agendarEnventos.entrySet()){
            if (entry.getKey().isEqual(dataAtual)|| entry.getKey().isAfter(dataAtual)){
                ProxData = entry.getKey();
                ProxEvento = entry.getValue();
                System.out.println("Próximo Evento "+ ProxEvento + "será na data "+ ProxData);
                break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos ae = new AgendaEventos();
        ae.adicionarEvento(LocalDate.of(2024,8, 1), "evento 1", "atracao 1");
        ae.adicionarEvento(LocalDate.of(2024,8, 3), "evento 2", "atracao 2");
        ae.adicionarEvento(LocalDate.of(2024,1, 24), "evento 5", "atracao 3");
        ae.adicionarEvento(LocalDate.of(2024,7, 16), "evento 4", "atracao 5");
        ae.adicionarEvento(LocalDate.of(2024,10, 16), "evento 4", "atracao 5");


        ae.exibirAgenda();

        ae.obterProximoEvento();
    }
}
