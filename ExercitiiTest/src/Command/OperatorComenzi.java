package Command;

import java.util.ArrayList;
import java.util.List;

public class OperatorComenzi {
    private List<ComandaAbstracta> lista;
    public OperatorComenzi(){
        super();
        this.lista= new ArrayList<>();
    }

    public  void invocaComanda(ComandaAbstracta comanda){
        lista.add(comanda);
    }
    public void executaComanda(){
        if(!lista.isEmpty()){
            lista.get(0).executa();
            lista.remove(0);
        }
    }

}
