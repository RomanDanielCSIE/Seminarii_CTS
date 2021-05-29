package Facade;

public class Facade {
    public static boolean poateIntraLaMeci(Suporter suporter){
        OperatorBilete operatorBilete = new OperatorBilete("Remi");
        if(operatorBilete.areBilet(suporter)){
            if(operatorBilete.nuAreCazier(suporter)==false) {
                if (operatorBilete.nuEsteRecidivist(suporter) == false) {
                    return true;
                } else {
                    return false;
                }
            }
                else{
                    return false;
                }
            }
        else {
            return false;
        }
    }


}
