package edu.cscc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RPSLSpockTest {



    @Test
    public void testIsValidPick() {
        Assert.assertTrue(RPSLSpock.isValidPick("rock"));
        Assert.assertTrue(RPSLSpock.isValidPick("paper"));
        Assert.assertTrue(RPSLSpock.isValidPick("scissors"));
        Assert.assertTrue(RPSLSpock.isValidPick("lizard"));
        Assert.assertTrue(RPSLSpock.isValidPick("spock"));
        Assert.assertFalse(RPSLSpock.isValidPick(" "));
    }

    @Test
    public void testGeneratePick() {
        for (int i = 0; i < 1000000; i++) {
            String pick = RPSLSpock.generatePick();
            Assert.assertTrue(RPSLSpock.isValidPick(pick));
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testIsComputerWin() {
        Assert.assertTrue(RPSLSpock.isComputerWin("rock", "scissors"));
        Assert.assertFalse(RPSLSpock.isComputerWin("paper", "scissors"));
        Assert.assertTrue(RPSLSpock.isComputerWin("spock", "rock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("paper", "spock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("lizard", "paper"));
        Assert.assertTrue(RPSLSpock.isComputerWin("scissors", "lizard"));
        Assert.assertTrue(RPSLSpock.isComputerWin("spock", "scissors"));
        Assert.assertTrue(RPSLSpock.isComputerWin("lizard", "spock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("rock", "lizard"));
        Assert.assertTrue(RPSLSpock.isComputerWin("paper", "rock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("scissors", "paper"));

    }
}