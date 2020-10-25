package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TestKlase {
    @Test
    public void antrosKoordinatesIvestis(){
        Ivestis ivestis = new Ivestis();
        Assert.assertEquals(1, ivestis.antraKoordinate("a"));

    }
    @Test
    public void tusciuLaukuSkaiciavimas(){
        Zaidejas zaidejas = new Zaidejas();
        Lenta lenta = Lenta.grazintiObjekta(zaidejas);
        ZaidimoPabaiga zaidimoPabaiga = new ZaidimoPabaiga(lenta);

        Assert.assertEquals(60, zaidimoPabaiga.skaiciuotiTusciusLaukus());
    }
    @Test
    public void priesininkoSimbolioGavimas(){
        Zaidejas zaidejas = new Zaidejas();
        Assert.assertEquals('B', zaidejas.gautiPriesininka());
    }
}
