package task2;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        int[] arraysFirst = { 11, 12, 13, 14, 15};
        int[] arraySecond = { 21, 22, 23, 24, 25};
        int[] arrayThird = { 31, 32, 33, 34, 35};

        Object lock = new Object();

        Thread threadFirst = new Thread(new SaveAsThread(arraysFirst,"file.txt", lock));
        Thread threadSecond = new Thread(new SaveAsThread(arraySecond,"file.txt", lock));
        Thread threadThird = new Thread(new SaveAsThread(arrayThird,"file.txt", lock));

        threadFirst.start();
        threadSecond.start();
        threadThird.start();

        Printer printer = new Printer();
        try {
            printer.print("file.txt");
            File file = new File("file.txt");
            boolean delete = file.delete();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
