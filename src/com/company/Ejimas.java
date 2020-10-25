package com.company;

import java.util.ArrayList;

public class Ejimas {
    private Lenta lenta;
    private Zaidejas zaidejas;
    private Apvertimas apvertimas;
    private char tusciasLaukas = '-';
    private ArrayList<Integer> pazymetiDiskaiX = new ArrayList<>();
    private ArrayList<Integer> pazymetiDiskaiY = new ArrayList<>();

    public Ejimas(Lenta lenta, Zaidejas zaidejas, Apvertimas apvertimas) {
        this.lenta = lenta;
        this.zaidejas = zaidejas;
        this.apvertimas = apvertimas;
    }

    public boolean tikrintiAplink(int pirmaKoordinate, int antraKoordinate) {
        char[][] zaidimoLenta = lenta.gautiLenta();
        boolean ejimasGalimas = false;
        if (zaidimoLenta[pirmaKoordinate][antraKoordinate] != tusciasLaukas) {
            return false;
        } else if (zaidimoLenta[pirmaKoordinate - 1][antraKoordinate] == zaidejas.gautiPriesininka()) {
            ejimasGalimas = true;
        } else if (zaidimoLenta[pirmaKoordinate][antraKoordinate - 1] == zaidejas.gautiPriesininka()) {
            ejimasGalimas = true;
        } else if (zaidimoLenta[pirmaKoordinate + 1][antraKoordinate] == zaidejas.gautiPriesininka()) {
            ejimasGalimas = true;
        } else if (zaidimoLenta[pirmaKoordinate][antraKoordinate + 1] == zaidejas.gautiPriesininka()) {
            ejimasGalimas = true;
        }
        if (ejimasGalimas == true) {
            tikrintiVisasPuses(pirmaKoordinate, antraKoordinate, 0, 1);
            tikrintiVisasPuses(pirmaKoordinate, antraKoordinate, 0, -1);
            tikrintiVisasPuses(pirmaKoordinate, antraKoordinate, 1, 0);
            tikrintiVisasPuses(pirmaKoordinate, antraKoordinate, -1, 0);
            zaidimoLenta[pirmaKoordinate][antraKoordinate] = zaidejas.gautiSpalva();
            zaidejas.keistiSpalva();
            lenta.keistiLenta(zaidimoLenta);
        }
        return ejimasGalimas;
    }

   public boolean tikrintiVisasPuses(int pirmaKoordinate, int antraKoordinate, int x, int y){
        int i = pirmaKoordinate;
        int j = antraKoordinate;
       char[][] zaidimoLenta = lenta.gautiLenta();
       while((i >= 1) && (i <= 8) && (j >= 1) && (j<=8)){
            if(zaidimoLenta[i][j] == zaidejas.gautiPriesininka()){
                pazymetiDiskaiX.add(i);
                pazymetiDiskaiY.add(j);
            }
            if(zaidimoLenta[i][j] == zaidejas.gautiSpalva()){
                apvertimas.apverstiDiskus(zaidejas.gautiSpalva(), pirmaKoordinate, antraKoordinate, pazymetiDiskaiX, pazymetiDiskaiY, x, y);
                pazymetiDiskaiX.clear();
                pazymetiDiskaiY.clear();
                return true;
            }
            i += x;
            j += y;
        }
       return false;
    }
}
