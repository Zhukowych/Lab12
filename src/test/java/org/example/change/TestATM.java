package org.example.change;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestATM {

    @Test
    public void testProcessValidAmount() {
        ATM atm = new ATM();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        atm.receiveMoney(155);

        String expectedOutput = "Received 1 coins of 5 denomination\n" +
                            "Received 15 coins of 10 denomination\n";
        Assert.assertEquals(expectedOutput.trim(), outputStream.toString().trim());

        System.setOut(System.out);
    }

    @Test
    public void testProcessInvalidAmount() {
        ATM atm = new ATM();
        Assert.assertThrows(IllegalArgumentException.class, () -> atm.receiveMoney(3));
    }

}
