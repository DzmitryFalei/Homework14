package task1;

public class MinNumberInArray {

    private int []arrays;
    private int min;

    public MinNumberInArray(int[] arrays) {
        this.arrays = arrays;
    }

    public int minDigit() {
        min = arrays[0];
        for (int array : arrays) {
            if (array <= min) {
                min = array;
            }
        }
        return min;
    }
}
