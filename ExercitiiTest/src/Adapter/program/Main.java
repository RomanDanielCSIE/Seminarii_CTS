package Adapter.program;

import Adapter.MedicamentFarmacie;
import Adapter.MedicamentSpital;

public class Main {
    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie(100);
        medicamentFarmacie.cumparaMedicament();
        MedicamentSpital medicamentSpital = new MedicamentSpital(40,false);
        medicamentSpital.achizitioneazaMedicament();

    }
}
