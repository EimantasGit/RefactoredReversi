package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TestKlase {
    @Test
    public void antrosKoordinatesIvestis(){
        Ivestis ivestis = new Ivestis();

        Assert.assertEquals(1, ivestis.antraKoordinate("a"));
        Assert.assertEquals(0, ivestis.antraKoordinate("Testas"));
        Assert.assertEquals(2, ivestis.antraKoordinate("b"));
    }
}
