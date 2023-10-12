/*
File: Filereader.java
Author: Szinyei Mikes
Copyright: 2023, Szinyei Mikes
Group: Szoft II-2 N
Date: 2023-10-12
Github: https://github.com/MikesSzinyei/
Licenc: GNU GPL 
*/
package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Filereader {
    final String FILENAME = "termes.txt";
    ArrayList<Forage> forageList = new ArrayList<>();

    public void loadData() {
        try {
            tryloadData();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba! A fájl nem található!");
            System.err.println(e.getMessage());
        }
    }

    public void tryloadData() throws FileNotFoundException {
        File file = new File(FILENAME);
        Scanner sc = new Scanner(file, "utf-8");
        sc.nextLine();

        while(sc.hasNext()) {
            String line = sc.nextLine();
            String[] lineArray = line.split(":") ;
            Forage forage = new Forage();
            
            forage.setId(Integer.parseInt(lineArray[0]));
            forage.setNev(lineArray[1]);
            forage.setDulo(lineArray[2]);
            forage.setTermes(Integer.parseInt(lineArray[3]));
            forage.setBetakaritas(lineArray[4]);
            this.forageList.add(forage);
            //System.out.println(forage.getNev());
        }
        sc.close();
    }
}
