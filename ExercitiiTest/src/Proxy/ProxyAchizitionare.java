package Proxy;

public class ProxyAchizitionare implements IOperatorBilete {
    private OperatorBilete operatorBilete;
    private int limita;

    public ProxyAchizitionare(OperatorBilete operatorBilete, int limita) {
        this.operatorBilete = operatorBilete;
        this.limita = limita;
    }

    @Override
    public void cumparaBilet(int varsta) {
        if(varsta>=limita){
            operatorBilete.cumparaBilet(varsta);
        }
        else {
            System.out.println("Nu poate cumpara bilet");
        }
    }
}
