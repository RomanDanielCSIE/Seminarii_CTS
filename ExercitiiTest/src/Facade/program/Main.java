package Facade.program;

import Facade.Facade;
import Facade.Suporter;

public class Main {

    public static void main(String[] args) {
        Suporter suporter = new Suporter("1234242233",false,false);
        Suporter suporter1 = new Suporter("1234242233",false,true);
        Suporter suporter2 = new Suporter("1234242233",true,false);
        if(Facade.poateIntraLaMeci(suporter)){
            System.out.println("Bine ati venit la meci");
        }
        else{
           System.out.println("Nu poate intra la meci");
        }

        if(Facade.poateIntraLaMeci(suporter1)){
            System.out.println("Bine ati venit la meci");
        }
        else{
            System.out.println("Nu poate intra la meci");
        }

        if(Facade.poateIntraLaMeci(suporter2)){
            System.out.println("Bine ati venit la meci");
        }
        else{
            System.out.println("Nu poate intra la meci");
        }
    }
}
