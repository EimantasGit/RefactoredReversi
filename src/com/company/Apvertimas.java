package com.company;

import java.util.ArrayList;

public class Apvertimas {
    private Lenta lenta;
    
    public Apvertimas(Lenta lenta){
        this.lenta = lenta;
    }
    public void apverstiDiskus(char zaidejas, int pirma, int antra, ArrayList<Integer> pazymetiDiskaiX, ArrayList<Integer> pazymetiDiskaiY, int x, int y){
        char[][] zaidimoLenta = lenta.gautiLenta();
        for(int i=0; i<pazymetiDiskaiX.size(); i++){
            zaidimoLenta[pazymetiDiskaiX.get(i)][pazymetiDiskaiY.get(i)] = zaidejas;
        }
    }
}
