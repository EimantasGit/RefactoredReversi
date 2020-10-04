package com.company;

import java.util.ArrayList;

public class Ejimas {
    private Lenta lenta;
    private Zaidejas zaidejas;
    private Apvertimas apvertimas;
    private char tusciasLaukas = '-';
    private ArrayList<Integer> pazymetiDiskai = new ArrayList<>();

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
            ejimasGalimas = tikrintiVisasPuses(pirmaKoordinate, antraKoordinate);
        } else if (zaidimoLenta[pirmaKoordinate][antraKoordinate - 1] == zaidejas.gautiPriesininka()) {
            ejimasGalimas = tikrintiVisasPuses(pirmaKoordinate, antraKoordinate);
        } else if (zaidimoLenta[pirmaKoordinate + 1][antraKoordinate] == zaidejas.gautiPriesininka()) {
            ejimasGalimas = tikrintiVisasPuses(pirmaKoordinate, antraKoordinate);
        } else if (zaidimoLenta[pirmaKoordinate][antraKoordinate + 1] == zaidejas.gautiPriesininka()) {
            ejimasGalimas = tikrintiVisasPuses(pirmaKoordinate, antraKoordinate);

        }
        if (ejimasGalimas == true) {
            zaidimoLenta[pirmaKoordinate][antraKoordinate] = zaidejas.gautiSpalva();
            lenta.keistiLenta(zaidimoLenta);
            zaidejas.keistiSpalva();
        }
        return ejimasGalimas;
    }

    public boolean tikrintiVisasPuses(int pirmaKoordinate, int antraKoordinate) {
        int tinkamiEjimai = 0;
        if (this.tikrintiDesine(pirmaKoordinate, antraKoordinate) == true) {
            tinkamiEjimai++;
        }
       if (this.tikrintiKaire(pirmaKoordinate, antraKoordinate) == true) {
           tinkamiEjimai++;
       }
        if (this.tikrintiVirsu(pirmaKoordinate, antraKoordinate) == true) {
            tinkamiEjimai++;
        }
        if (this.tikrintiApacia(pirmaKoordinate, antraKoordinate) == true) {
            tinkamiEjimai++;
        }
        if (tinkamiEjimai > 0) {
            return true;
        }
        return false;
    }

    public boolean tikrintiDesine(int pirmaKoordinate, int antraKoordinate) {
        pazymetiDiskai.clear();
        char[][] zaidimoLenta = lenta.gautiLenta();
        for (int i = antraKoordinate; i <= 8; i++) {
            if (zaidimoLenta[pirmaKoordinate][i] == zaidejas.gautiPriesininka()) {
                pazymetiDiskai.add(i);
            } else if (zaidimoLenta[pirmaKoordinate][i] == zaidejas.gautiSpalva() && pazymetiDiskai.isEmpty() == false) {
                apvertimas.apverstiEilute(pirmaKoordinate, antraKoordinate, pazymetiDiskai, zaidejas.gautiSpalva());
                return true;
            }
        }
        return false;
    }
    public boolean tikrintiKaire(int pirmaKoordinate, int antraKoordinate) {
        pazymetiDiskai.clear();
        char[][] zaidimoLenta = lenta.gautiLenta();
        for (int i = antraKoordinate; i >= 1; i--) {
            if (zaidimoLenta[pirmaKoordinate][i] == zaidejas.gautiPriesininka()) {
                pazymetiDiskai.add(i);
            } else if (zaidimoLenta[pirmaKoordinate][i] == zaidejas.gautiSpalva() && pazymetiDiskai.isEmpty() == false) {
                apvertimas.apverstiEilute(pirmaKoordinate, antraKoordinate, pazymetiDiskai, zaidejas.gautiSpalva());
                return true;
            }
        }
        return false;
    }
    public boolean tikrintiVirsu(int pirmaKoordinate, int antraKoordinate) {
        pazymetiDiskai.clear();
        char[][] zaidimoLenta = lenta.gautiLenta();
        for (int i = pirmaKoordinate; i >= 1; i--) {
            if (zaidimoLenta[i][antraKoordinate] == zaidejas.gautiPriesininka()) {
                pazymetiDiskai.add(i);
            } else if (zaidimoLenta[i][antraKoordinate] == zaidejas.gautiSpalva() && pazymetiDiskai.isEmpty() == false) {
                apvertimas.apverstiStulpeli(pirmaKoordinate, antraKoordinate, pazymetiDiskai, zaidejas.gautiSpalva());
                return true;
            }
        }
        return false;
    }
    public boolean tikrintiApacia(int pirmaKoordinate, int antraKoordinate) {
        pazymetiDiskai.clear();
        char[][] zaidimoLenta = lenta.gautiLenta();
        for (int i = pirmaKoordinate; i <= 8; i++) {
            if (zaidimoLenta[i][antraKoordinate] == zaidejas.gautiPriesininka()) {
                pazymetiDiskai.add(i);
            } else if (zaidimoLenta[i][antraKoordinate] == zaidejas.gautiSpalva() && pazymetiDiskai.isEmpty() == false) {
                apvertimas.apverstiStulpeli(pirmaKoordinate, antraKoordinate, pazymetiDiskai, zaidejas.gautiSpalva());
                return true;
            }
        }
        return false;
    }
}
