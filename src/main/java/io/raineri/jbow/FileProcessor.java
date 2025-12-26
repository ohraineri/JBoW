package io.raineri.jbow;

import java.io.File;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.io.FileNotFoundException;

public class FileProcessor {
    private Map<String, Integer> database = new HashMap<String, Integer>();
    private Scanner fileScanner;
    
    public Scanner getFile(String path) throws FileNotFoundException {
        File file = new File(path);

        this.fileScanner =  new Scanner(file);
        return this.fileScanner;
    }

    public Map<String, Integer> processFile() {
        Scanner filScanner = this.fileScanner;
        String word;

        while(filScanner.hasNext()) {
            word = TextProcessor.cleanWord(filScanner.next());
            if(this.database.containsKey(word)) {
                this.database.put(word, this.database.get(word) + 1);
                continue;
            }
            this.database.put(word, 1);
        }

        return this.database;
    }
    
}