package com.bridgelabz.basic;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class DatabaseConnectionTest {

    private DatabaseConnection dbConnection;

    @BeforeEach
    public void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }

    @AfterEach
    public void tearDown() {
        dbConnection.disconnect();
    }

    @Test
    public void testConnectionIsEstablished() {
        assertTrue(dbConnection.isConnected(), "Connection should be established in @BeforeEach");
    }

    @Test
    public void testConnectionStillActiveDuringTest() {
        assertTrue(dbConnection.isConnected());
        // You can simulate queries or actions here
    }

    @Test
    public void testConnectionLifecycle() {
        assertTrue(dbConnection.isConnected());
    }

    // Optional: Testing after @AfterEach manually (not common practice in real tests)
    @Test
    public void testDisconnectManually() {
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected());
    }
}
