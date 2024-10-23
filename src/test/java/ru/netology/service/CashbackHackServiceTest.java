package ru.netology.service;

import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void add1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void add0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void add100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void ofMore1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1900;

        int actual = service.remain(amount);
        int expected = 100;

        org.testng.Assert.assertEquals(actual, expected);
    }
}
