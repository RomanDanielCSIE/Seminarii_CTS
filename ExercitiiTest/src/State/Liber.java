package State;

public class Liber implements IStareScaun {

    @Override
    public void schimbaStare(Scaun scaun) {
        if(scaun.getStareScaun() instanceof Liber){
            scaun.setStareScaun(this);
        }
    }
}
