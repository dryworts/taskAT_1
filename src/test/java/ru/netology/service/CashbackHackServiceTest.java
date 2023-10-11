package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


class CashbackHackServiceTest {

    @Test
    public void shouldCountCorrectIfLess() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldCountCorrectIfEqual() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldCountCorrectIfMore() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1100;

        int actual = cashbackHackService.remain(amount);
        int expected = 900;

        assertEquals(actual, expected);
    }
}