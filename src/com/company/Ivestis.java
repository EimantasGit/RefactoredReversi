package com.company;

import java.util.Scanner;

public class Ivestis {
    public final String klaida = "Netinkamas pasirinkimas";
    Scanner scanner = new Scanner(System.in);

    public int pirmaKoordinate() {
        int pirma = 0;
        do {
            try {
                pirma = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println(klaida);
            }
        } while (pirma < 1 || pirma > 8);
        return pirma;
    }

    public int antraKoordinate() {
        String ivestis = scanner.nextLine();
        int antra = 0;
        switch (ivestis) {
            case "a":
                antra = 1;
                break;
            case "b":
                antra = 2;
                break;
            case "c":
                antra = 3;
                break;
            case "d":
                antra = 4;
                break;
            case "e":
                antra = 5;
                break;
            case "f":
                antra = 6;
                break;
            case "g":
                antra = 7;
                break;
            case "h":
                antra = 8;
                break;
            default:
                System.out.println(klaida);
        }
        return antra;
    }
}
