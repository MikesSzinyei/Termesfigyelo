/*
File: mainConsole.java
Author: Szinyei Mikes
Copyright: 2023, Szinyei Mikes
Group: Szoft II-2 N
Date: 2023-10-12
Github: https://github.com/MikesSzinyei/
Licenc: GNU GPL 
*/
package views;
import java.util.ArrayList;
import models.Forage;

public class MainConsole {

    public void showData(ArrayList<Forage> forageList){
        for(Forage forage : forageList){
            System.out.print(forage.getId()+", ");
            System.out.print(forage.getNev()+", ");
            System.out.print(forage.getDulo()+", ");
            System.out.print(forage.getTermes()+", ");
            System.out.print(forage.getBetakaritas());
            
        }
    }
}