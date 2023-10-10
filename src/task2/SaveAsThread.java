package task2;

import java.io.FileOutputStream;
import java.io.IOException;

public class SaveAsThread implements Runnable{

    private int[] array;
    private String name;
    private final Object lock;

    public SaveAsThread(int[] array, String name, Object lock) {
        this.array = array;
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {

        synchronized (lock) {

            try (FileOutputStream fileOut = new FileOutputStream(name, true)) {
                for (int item : array) {
                    fileOut.write(item);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
