package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaSuporter {
    public Map<String,Suporter> suporteri;

    public FabricaSuporter() {
        super();
        this.suporteri = new HashMap<String, Suporter>();
    }

    public Suporter getSuporter(String nume,int inaltime, int latime, String culoareTricou){
        if(suporteri.containsKey(nume)){
            return suporteri.get(nume);
        }
        else{
            Suporter suporter = new Suporter(inaltime,latime,culoareTricou,nume);
            suporteri.put(nume,suporter);
            return suporter;
        }
    }
}
