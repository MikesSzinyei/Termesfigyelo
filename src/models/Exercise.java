package models;

import java.util.ArrayList;

public class Exercise {
    public double sumBuzaDulo(ArrayList<Forage> forageList) {
        int duloSum=0;
        for(Forage forage : forageList) {
            if (forage.getNev() == "búza") {
                duloSum+=1;
            }
        };
        return duloSum;

    }

    public double sumBuzaTermes(ArrayList<Forage> forageList) {
        int buzaSum=0;
        for(Forage forage : forageList) {
            if (forage.getNev() == "búza") {
                buzaSum+=forage.getTermes();
            }
        };
        return buzaSum;

    }
}
