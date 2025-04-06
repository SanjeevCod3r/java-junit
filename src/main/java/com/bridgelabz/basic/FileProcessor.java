package com.bridgelabz.basic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class FileProcessor {

    public void writeToFile(String filename, String content) throws IOException {
        Path path = Paths.get(filename);
        Files.writeString(path, content);
    }

    public String readFromFile(String filename) throws IOException {
        Path path = Paths.get(filename);
        return Files.readString(path);
    }
}
