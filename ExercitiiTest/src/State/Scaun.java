package State;

public class Scaun {
    private int numarScaun;
    private IStareScaun stareScaun;

    public Scaun(int numarScaun) {
        this.numarScaun = numarScaun;
        this.stareScaun = new Liber();
    }

    public int getNumarScaun() {
        return numarScaun;
    }

    public void setNumarScaun(int numarScaun) {
        this.numarScaun = numarScaun;
    }

    public IStareScaun getStareScaun() {
        return stareScaun;
    }

    public void setStareScaun(IStareScaun stareScaun) {
        this.stareScaun = stareScaun;
    }

    public void rezervaScaun(String nume){
        if(stareScaun instanceof Liber){
            System.out.println(nume+" a rezervat scaunul "+this.numarScaun);
            this.setStareScaun(new Rezervat());
        }
        else{
            System.out.println("Daca scaunul " + this.numarScaun+ "nu este liber nu se poate ocupa");
        }
    }

    public void ocupaScaun(String nume){
        if(!(stareScaun instanceof Ocupat)){
            System.out.println(nume+ "a ocupat scaunul "+this.numarScaun);
            this.setStareScaun(new Ocupat());
        }
        else{
            System.out.println("Daca scaunul "+this.numarScaun+ "nu este liber nu se poate ocupa");
        }
    }

    public void elibereazaScaun(String nume){
        if(stareScaun instanceof Ocupat){
            System.out.println("Scaunul" + this.numarScaun+ "a fost eliberat");
        }
        else{
            System.out.println(nume+"a ocupat scaunul"+this.numarScaun);
            this.setStareScaun(new Ocupat());
        }

    }

}
