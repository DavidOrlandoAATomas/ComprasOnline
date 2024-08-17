package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContactos {
    private Set<Contacto> contactoSet;

    public AgendaContactos() {
        this.contactoSet = new HashSet<>();
    }

    public void adicionarContacto(String nome, int n){
        contactoSet.add(new Contacto(nome,n));
    }

    public void exibirContacto(){
        System.out.println(contactoSet);
    }

    public Set<Contacto> pesquisarContacto_Nome(String nome){
        Set<Contacto> Contacto_Nome = new HashSet<>();
        for(Contacto c : contactoSet){
            if(c.getNome().startsWith(nome)){
                Contacto_Nome.add(c);
            }
        }
        return Contacto_Nome;
    }

    public Contacto atualizarContacto(String nome, int n){
        Contacto Contacto_Atualizado = null;
        for (Contacto c : contactoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero_tel(n);
                Contacto_Atualizado = c;
                break;
            }
        }
        return Contacto_Atualizado;
    }

    public static void main(String[] args) {
        AgendaContactos ac = new AgendaContactos();

        ac.adicionarContacto("Camila", 91203);
        ac.adicionarContacto("Camila Zeref", 91223);
        ac.adicionarContacto("Dámares", 91247);
        ac.adicionarContacto("Camila", 91209);

        System.out.println(ac.pesquisarContacto_Nome("Camila"));
    }
}
