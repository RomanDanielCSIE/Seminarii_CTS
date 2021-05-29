package Proxy;

public class OperatorBilete implements IOperatorBilete {
    public String meci;

    public OperatorBilete(String meci) {
        this.meci = meci;
    }

    @Override
    public void cumparaBilet(int varsta) {
        System.out.println("Suporterul in varsta de "+varsta+ "ani a cumparat un bilet la meciul "+ meci);
    }
}
