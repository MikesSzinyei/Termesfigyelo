/*
File: Forage.java
Author: Szinyei Mikes
Copyright: 2023, Szinyei Mikes
Group: Szoft II-2 N
Date: 2023-10-12
Github: https://github.com/MikesSzinyei/
Licenc: GNU GPL 
*/
package models;

public class Forage {
    int id;
    String nev;
    String dulo;
    int termes;
    String betakaritas;
    public Forage(int id, String nev, String dulo, int termes, String betakaritas) {
        this.id = id;
        this.nev = nev;
        this.dulo = dulo;
        this.termes = termes;
        this.betakaritas = betakaritas;
    }
    public Forage() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNev() {
        return nev;
    }
    public void setNev(String nev) {
        this.nev = nev;
    }
    public String getDulo() {
        return dulo;
    }
    public void setDulo(String dulo) {
        this.dulo = dulo;
    }
    public int getTermes() {
        return termes;
    }
    public void setTermes(int termes) {
        this.termes = termes;
    }
    public String getBetakaritas() {
        return betakaritas;
    }
    public void setBetakaritas(String betakaritas) {
        this.betakaritas = betakaritas;
    }



}



