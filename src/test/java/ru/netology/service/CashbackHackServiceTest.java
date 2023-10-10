package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


class CashbackHackServiceTest {

    @Test
    public void shouldCountCorrect() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }
}