package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void shouldCountCorrect() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }
}