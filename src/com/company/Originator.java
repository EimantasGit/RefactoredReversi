package com.company;

import com.sun.management.VMOption;

public class Originator {
    private Lenta lenta;

    public void setState(Lenta lenta){
        this.lenta = lenta;
    }
    public Lenta getState(){
        return lenta;
    }
    public Memento saveStateToMemento(){
        return new Memento(lenta);
    }
    public void getStateFromMemento(Memento memento){
        lenta = memento.getState();
    }
}
