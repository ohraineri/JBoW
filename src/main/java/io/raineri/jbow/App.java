package io.raineri.jbow;


public class App {
    public static void main(String[] args) {
        try {
            FileProcessor file = new FileProcessor();
            file.getFile(args[0]);
            System.out.print(file.processFile());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
