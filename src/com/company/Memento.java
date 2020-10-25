package com.company;

public class Memento {
    private Lenta lenta;

    public Memento(Lenta lenta){
        this.lenta = lenta;

    }
    public Lenta getState(){
        return lenta;
    }
}
