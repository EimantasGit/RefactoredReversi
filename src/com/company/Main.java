package com.company;

public class Main {


    public static void main(String[] args) {
        Zaidejas zaidejas = new Zaidejas();
        Lenta lenta = Lenta.grazintiObjekta(zaidejas);
        Ivestis ivestis = new Ivestis();
        Apvertimas apvertimas = new Apvertimas(lenta);
        Ejimas ejimas = new Ejimas(lenta, zaidejas, apvertimas);
        ZaidimoPabaiga zaidimoPabaiga = new ZaidimoPabaiga(lenta);
        while(zaidimoPabaiga.baigesiZaidimas()==false){
            lenta.piestiLenta();
            int pirmaKoordinate = ivestis.pirmaKoordinate();
            int antraKoordinate = ivestis.antraKoordinate();
            ejimas.tikrintiAplink(pirmaKoordinate, antraKoordinate);
        }
    }
}
