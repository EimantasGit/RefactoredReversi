package com.company;

public class Zaidejas {
    private char spalva = 'J';
    private char priesininkas = 'B';
    protected int taskai = 2;
    public char gautiPriesininka() {
        return this.priesininkas;
    }

    public char gautiSpalva() {
        return this.spalva;
    }

    public void keistiSpalva() {
        if (this.spalva == 'J') {
            this.spalva = 'B';
            this.priesininkas = 'J';
        } else {
            this.spalva = 'J';
            this.priesininkas = 'B';
        }
    }
    public void nustatytiTaskus(int taskai){
        this.taskai = taskai;
    }
    public int gautiTaskus(){
        return this.taskai;
    }
    public int skaiciuotiTaskus(char[][] zaidimoLenta, char spalva){
        int taskai = 0;
        for(int i = 1; i<=8; i++){
            for(int j= 1; j<= 8; j++){
                if(zaidimoLenta[i][j]==spalva){
                    taskai++;

                }
            }
        }
        return taskai;
    }

}
