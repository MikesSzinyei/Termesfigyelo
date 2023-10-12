/*
File: App.java
Author: Szinyei Mikes
Copyright: 2023, Szinyei Mikes
Group: Szoft II-2 N
Date: 2023-10-12
Github: https://github.com/MikesSzinyei/
Licenc: GNU GPL 
*/
import controllers.MainController;
import models.Filereader;



public class App {
    public static void main(String[] args) throws Exception {
        new MainController();
        new Filereader().loadData();
    }
}
