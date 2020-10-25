package com.company;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private ArrayList<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }
    public Memento get(int index){
        return mementoList.get(index);
    }
}
