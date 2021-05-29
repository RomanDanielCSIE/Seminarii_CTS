package State;

public class Rezervat implements IStareScaun {
    @Override
    public void schimbaStare(Scaun scaun) {
        if(scaun.getStareScaun() instanceof Rezervat){
            scaun.setStareScaun(this);
        }
    }
}
