package com.bridgelabz.basic;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TaskManagerTest {

    private final TaskManager taskManager = new TaskManager();

    @Test
    @Timeout(value = 4, unit = TimeUnit.SECONDS)
    public void testLongRunningTask_ShouldTimeout() throws InterruptedException {
        taskManager.longRunningTask(); // Should fail because it takes 3 seconds
    }
}

