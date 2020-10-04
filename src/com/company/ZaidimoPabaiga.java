package com.company;

public class ZaidimoPabaiga {
    private Lenta lenta;
    private Baltas baltas = new Baltas();
    private Juodas juodas = new Juodas();

    public ZaidimoPabaiga(Lenta lenta){
        this.lenta = lenta;
    }
    public boolean baigesiZaidimas(){
        int balti = baltas.skaiciuotiBaltoTaskus(lenta.gautiLenta());
        int juodi = juodas.skaiciuotiJuodoTaskus(lenta.gautiLenta());
        int tustiLaukai = this.skaiciuotiTusciusLaukus();
        if(balti == 0){
            System.out.println("Pralaimėjo B žaidėjas");
            return true;
        }
        if(juodi == 0){
            System.out.println("Pralaimėjo J žaidėjas");
            return true;
        }
        if(tustiLaukai==0){
            if(balti > juodi){
                System.out.println("Pralaimėjo J žaidėjas");
                return true;
            }
            if(juodi == balti){
                System.out.println("Lygiosios");
                return true;
            }
            else{
                System.out.println("Pralaimėjo B žaidėjas");
                return true;
            }
        }
    return false;
    }
    public int skaiciuotiTusciusLaukus(){
        char[][] zaidimoLenta = lenta.gautiLenta();
        char tusciasLaukas = '-';
        int tustiLaukai = 0;
        for(int i=1; i<=8; i++){
            for(int j=1; j<=8; j++){
                if(zaidimoLenta[i][j] == tusciasLaukas){
                    tustiLaukai++;
                }
            }
        }
        return tustiLaukai;
    }
}
