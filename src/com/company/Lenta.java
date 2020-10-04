package com.company;

public class Lenta {
    private final int eilutes = 10;
    private final int stulpeliai = 10;
    private final String raides = "*abcdefgh*";
    private final String skaiciai = "*12345678*";

    private char[][] zaidimoLenta = new char[eilutes][stulpeliai];
    private int pirmaKoordinate = 0;
    private int antraKoordinate = 0;
    private static Lenta objektas;
    private Zaidejas zaidejas;
    private Baltas baltas = new Baltas();
    private Juodas juodas = new Juodas();

    private Lenta(Zaidejas zaidejas) {
        this.zaidejas = zaidejas;
        for (int i = 0; i < eilutes; i++) {
            for (int j = 0; j < stulpeliai; j++) {
                zaidimoLenta[i][j] = '-';
                zaidimoLenta[0][j] = raides.charAt(j);
                zaidimoLenta[9][j] = raides.charAt(j);
                zaidimoLenta[j][0] = skaiciai.charAt(j);
                zaidimoLenta[j][9] = skaiciai.charAt(j);
            }
        }
        zaidimoLenta[5][5] = 'J';
        zaidimoLenta[4][5] = 'B';
        zaidimoLenta[4][4] = 'J';
        zaidimoLenta[5][4] = 'B';
    }

    public void piestiLenta() {
        System.out.println("Įveskite norimas koordinates - pirma skaičius, tada raidė");
        for (int i = 0; i < eilutes; i++) {
            for (int j = 0; j < stulpeliai; j++) {
                System.out.print(zaidimoLenta[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Žaidėjo - " + zaidejas.gautiSpalva() + " eilė");
        System.out.println("Balto žaidėjo taškai: " + baltas.skaiciuotiBaltoTaskus(zaidimoLenta));
        System.out.println("Balto žaidėjo taškai: " + juodas.skaiciuotiJuodoTaskus(zaidimoLenta));
    }

    public static Lenta grazintiObjekta(Zaidejas zaidejas) {
        if (objektas == null) {
            objektas = new Lenta(zaidejas);
        }
        return objektas;
    }
    public char[][] gautiLenta() {
        return zaidimoLenta;
    }
    public void keistiLenta(char[][] zaidimoLenta) {
        this.zaidimoLenta = zaidimoLenta;
    }
}
