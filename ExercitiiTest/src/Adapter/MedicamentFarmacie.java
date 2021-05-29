package Adapter;

public class MedicamentFarmacie {
    private int pretMedicament;


    public MedicamentFarmacie(int pretMedicament) {
        this.pretMedicament = pretMedicament;

    }

    public int getPretMedicament() {
        return pretMedicament;
    }



    public void cumparaMedicament(){
        System.out.println("A fost cumparat fara reteta medicamentul cu pretul " + pretMedicament);
    }
}
