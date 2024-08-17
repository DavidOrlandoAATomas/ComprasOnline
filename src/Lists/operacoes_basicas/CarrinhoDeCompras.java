package Lists.operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> ListaItem;

    public CarrinhoDeCompras() {
        this.ListaItem = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){

        ListaItem.add(new Item(nome, preco, quantidade));

    }

    public void removerItem(String nome){
        List<Item> ListaItem_remover = new ArrayList<>();
        for(Item t : ListaItem){
            if(t.getNome().equalsIgnoreCase(nome)){
                ListaItem_remover.add(t);
            }
        }
        ListaItem.removeAll(ListaItem_remover);
    }

    public double calcularValorTotal(){
        double total=0;
        for(Item t: ListaItem){
            total += t.getPreco() * t.getQuantidade();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(ListaItem);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras cc = new CarrinhoDeCompras();
       cc.adicionarItem("Anel", 123.0,1);
       cc.adicionarItem("Relógio", 345.0,1);
       cc.adicionarItem("Ténis", 250.0,2);
       cc.exibirItens();
        System.out.println(cc.calcularValorTotal());

        cc.removerItem("Relógio");
        cc.exibirItens();

    }
}
