package Lists.operacoes_basicas;

import Lists.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void AdicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void RemoverTarefa(String descricao){
        List<Tarefa> tarefa_remover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if (t.getDescricao().equals(descricao)){
                tarefa_remover.add(t);
            }
        }
        tarefaList.removeAll(tarefa_remover);
    }

    public int ObterNumero_Tarefa(){
        return tarefaList.size();
    }

    public void ObterDescricao_Tarefa(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa lt = new ListaTarefa();

        lt.ObterNumero_Tarefa();

        lt.AdicionarTarefa("Tarefa 1");
        lt.AdicionarTarefa("Tarefa 1");
        lt.AdicionarTarefa("Tarefa 2");
        lt.AdicionarTarefa("Tarefa 3");

        lt.ObterNumero_Tarefa();

        lt.RemoverTarefa("Tarefa 1");
        lt.ObterNumero_Tarefa();

        lt.ObterDescricao_Tarefa();
    }
}
