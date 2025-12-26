package io.raineri.jbow;

import java.io.File;
import java.util.Map;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileProcessor {
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
            if(Database.instance().containsKey(word)) {
            	Database.put(word, Database.instance().get(word) + 1);
                continue;
            }
            Database.add(word, Integer.valueOf(1));
        }

        return Database.instance();
    }   
}