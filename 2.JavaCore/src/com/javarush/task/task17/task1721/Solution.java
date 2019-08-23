package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws CorruptedDataException {
        String fileOne;
        String fileTwo;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileOne = reader.readLine();
            fileTwo = reader.readLine();
            reader.close();
            allLines = Files.readAllLines(Paths.get(fileOne), StandardCharsets.UTF_8);
            forRemoveLines = Files.readAllLines(Paths.get(fileTwo), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        new Solution().joinData();
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            List<String> temp = allLines;
            allLines.removeAll(temp);
            throw new CorruptedDataException();
        }
    }
}
