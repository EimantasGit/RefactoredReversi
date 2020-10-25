package com.company;

public class Main {


    public static void main(String[] args) {
        Zaidejas zaidejas = new Zaidejas();
        Lenta lenta = Lenta.grazintiObjekta(zaidejas);
        Ivestis ivestis = new Ivestis();
        Apvertimas apvertimas = new Apvertimas(lenta);
        Ejimas ejimas = new Ejimas(lenta, zaidejas, apvertimas);
        ZaidimoPabaiga zaidimoPabaiga = new ZaidimoPabaiga(lenta);
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        while(zaidimoPabaiga.baigesiZaidimas()==false){
            originator.setState(lenta);
            careTaker.add(originator.saveStateToMemento());
            lenta.piestiLenta();
            int pirmaKoordinate = ivestis.pirmaKoordinate();
            if(pirmaKoordinate==0){
                originator.getStateFromMemento(careTaker.get(0));
                lenta = originator.getState();
            }
            else {
                int antraKoordinate = ivestis.antraKoordinate();
                ejimas.tikrintiAplink(pirmaKoordinate, antraKoordinate);
            }
        }
    }
}
