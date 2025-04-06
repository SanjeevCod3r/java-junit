package com.bridgelabz.basic;

// File: FileProcessorTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.io.IOException;
import java.nio.file.*;

public class FileProcessorTest {

    private FileProcessor fileProcessor;
    private static final String TEST_FILE = "testfile.txt";

    @BeforeEach
    public void setUp() {
        fileProcessor = new FileProcessor();
    }

    @AfterEach
    public void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    public void testWriteAndReadFile() throws IOException {
        String content = "Hello, File!";
        fileProcessor.writeToFile(TEST_FILE, content);

        String readContent = fileProcessor.readFromFile(TEST_FILE);
        assertEquals(content, readContent);
    }

    @Test
    public void testFileExistsAfterWriting() throws IOException {
        fileProcessor.writeToFile(TEST_FILE, "Some data");
        assertTrue(Files.exists(Paths.get(TEST_FILE)));
    }

    @Test
    public void testReadFromNonExistentFileThrowsException() {
        String nonExistentFile = "nonexistent.txt";

        Exception exception = assertThrows(IOException.class, () -> {
            fileProcessor.readFromFile(nonExistentFile);
        });

        assertTrue(exception.getMessage().contains("nonexistent"));
    }
}
