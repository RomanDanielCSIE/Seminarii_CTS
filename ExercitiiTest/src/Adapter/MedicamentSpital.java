package Adapter;

public class MedicamentSpital extends MedicamentFarmacie implements MedicamentAbstract {

    private boolean areReteta;
    public MedicamentSpital(int pretMedicament,boolean areReteta) {
        super(pretMedicament);
        this.areReteta=areReteta;
    }

    private boolean prezintaReteta(){
        return this.areReteta==true;
    }

    @Override
    public void achizitioneazaMedicament() {
        super.cumparaMedicament();
        if(prezintaReteta()==true){
            System.out.println("A fost achizitionat medicamentul cu reteta cu pretul de "+ this.getPretMedicament());
        }
        else{
            System.out.println("Nu are reteta");
        }
    }
}
