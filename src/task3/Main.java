package task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Generator generator = new Generator(list);
        generator.start();
    }
}
