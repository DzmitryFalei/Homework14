package task3;

import java.util.List;
import java.util.Random;

public class Generator extends Thread{

    private final List<Integer> list;

    public Generator(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {

        Random random = new Random();
        int i = 0;

        while (i < 100) {

            list.add(random.nextInt());
            i++;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for (int j: list) {
            System.out.println(j);
        }
    }
}
