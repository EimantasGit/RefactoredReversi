package com.company;

public class Baltas extends Zaidejas {
    char spalva = 'B';
    private int baltoTaskai = 2;

    public int skaiciuotiBaltoTaskus(char[][] zaidimoLenta){
        this.baltoTaskai = this.skaiciuotiTaskus(zaidimoLenta, spalva);
        return this.baltoTaskai;
    }
}
