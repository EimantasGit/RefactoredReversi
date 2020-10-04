package com.company;

import java.util.ArrayList;

public class Apvertimas {
    private Lenta lenta;
    
    public Apvertimas(Lenta lenta){
        this.lenta = lenta;
    }
    public void apverstiEilute(int pirmaKoordinate, int antraKoordinate, ArrayList<Integer> pazymetiDiskai, char zaidejoSimbolis){
        char[][] zaidimoLenta = lenta.gautiLenta();
        for(Integer diskas: pazymetiDiskai){
            zaidimoLenta[pirmaKoordinate][diskas] = zaidejoSimbolis;
        }
        lenta.keistiLenta(zaidimoLenta);
    }
    public void apverstiStulpeli(int pirmaKoordinate, int antraKoordinate, ArrayList<Integer> pazymetiDiskai, char zaidejoSimbolis){
        char[][] zaidimoLenta = lenta.gautiLenta();
        for(Integer diskas: pazymetiDiskai){
            zaidimoLenta[diskas][antraKoordinate] = zaidejoSimbolis;
        }
        lenta.keistiLenta(zaidimoLenta);
    }
}
