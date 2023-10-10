package task1;

public class MaxNumberInArray {

    private final int []arrays;
    private int max;

    public MaxNumberInArray(int[] arrays) {
        this.arrays = arrays;
    }

    public int maxDigit() {

        for (int array : arrays) {
            if (array >= max) {
                max = array;
            }
        }
        return max;
    }
}
