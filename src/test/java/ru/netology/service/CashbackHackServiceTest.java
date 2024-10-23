package ru.netology.service;

import org.junit.Test;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void add1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void add0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void add100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void ofMore1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1900;

        int actual = service.remain(amount);
        int expected = 100;

        org.junit.Assert.assertEquals(actual, expected);
    }
}
