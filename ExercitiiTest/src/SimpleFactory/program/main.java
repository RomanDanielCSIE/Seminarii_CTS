package SimpleFactory.program;

import SimpleFactory.Factory;
import SimpleFactory.PersonalSpital;
import SimpleFactory.TipPersonal;

public class main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        PersonalSpital brancardier = factory.getPersonalSpital(TipPersonal.BRANCARDIER,"Sebi",5);
        PersonalSpital asistent = factory.getPersonalSpital(TipPersonal.ASISTENT,"Leana",10);
        PersonalSpital medic = factory.getPersonalSpital(TipPersonal.MEDIC, "Grim",50);
        System.out.println(brancardier.toString());
        System.out.println(asistent.toString());
        System.out.println(medic.toString());
    }
}
