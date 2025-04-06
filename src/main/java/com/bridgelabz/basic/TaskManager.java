package com.bridgelabz.basic;

public class TaskManager {

    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000); // Simulate long task (3 seconds)
        return "Task Complete";
    }
}

