package ru.netology.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

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

    @Test
    public void shouldAdd1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAdd0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAdd100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void more1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1900;

        int expected = 100;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }
}

