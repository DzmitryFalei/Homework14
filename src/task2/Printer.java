package task2;

import java.io.FileInputStream;
import java.io.IOException;

public class Printer {

    public void print(String name) throws IOException {

        try (FileInputStream fileIn = new FileInputStream(name)) {
            int item;
            while ((item = fileIn.read()) != -1) {
                System.out.println(item);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
