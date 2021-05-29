package State;

public class Ocupat implements IStareScaun {
    @Override
    public void schimbaStare(Scaun scaun) {
            if(scaun.getStareScaun() instanceof Ocupat){
                scaun.setStareScaun(this);
            }
    }
}
