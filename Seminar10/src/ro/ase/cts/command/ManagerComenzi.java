package ro.ase.cts.command;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {

    private List<ComandaAbstracta> lista;

    public ManagerComenzi() {
        this.lista = new ArrayList<ComandaAbstracta>();
    }

    public void invocaComanda(ComandaAbstracta comanda){
        lista.add(comanda);
    }

    public void executaComanda(){
        if(lista.size()>0){
            lista.get(0).executa();
            lista.remove(0);
        }
    }
}
