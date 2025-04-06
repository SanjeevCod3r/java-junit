package com.bridgelabz.advance;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount(100.0); // Start with $100
    }

    @Test
    public void testDepositIncreasesBalance() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawDecreasesBalance() {
        account.withdraw(30.0);
        assertEquals(70.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawWithInsufficientFunds() {
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            account.withdraw(200.0);
        });
        assertEquals("Insufficient funds", exception.getMessage());
    }

    @Test
    public void testDepositNegativeAmountThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-10.0);
        });
    }

    @Test
    public void testWithdrawNegativeAmountThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-10.0);
        });
    }

    @Test
    public void testInitialBalanceCannotBeNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount(-50.0);
        });
    }
}

