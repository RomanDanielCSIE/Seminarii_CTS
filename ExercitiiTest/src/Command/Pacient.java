package Command;

public class Pacient {
    private String nume;


    public Pacient(String nume) {
        this.nume = nume;
    }

    public void primire(int nivelGravitate){
        System.out.println("Pacientul " + this.nume + " cu nivelul de gravitate" +nivelGravitate + " a fost primit");
    }

    public void internare(int nivelGravitate){
        if(nivelGravitate<5){
            System.out.println("Pacientul" + this.nume + " a fost internat");
        }
        else {
            System.out.println("Pacientul " +this.nume+ "trebuie tratat imediat");
        }
    }

    public void tratare(int nivelGravitate){
        if(nivelGravitate>=5){
            System.out.println("Pacientul " + this.nume + "va fi tratat");
        }
        else{
            System.out.println("Pacientul va fi internat");
        }
    }
}
