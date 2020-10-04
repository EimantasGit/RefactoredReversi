package com.company;

public class Juodas extends Zaidejas{
    private char spalva = 'J';
    private int juodoTaskai = 2;
    public int skaiciuotiJuodoTaskus(char[][] zaidimoLenta){
        this.juodoTaskai = this.skaiciuotiTaskus(zaidimoLenta, spalva);
        return this.juodoTaskai;
    }
}
