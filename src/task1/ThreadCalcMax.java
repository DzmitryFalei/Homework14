package task1;

public class ThreadCalcMax implements Runnable{

    CommonRes res;
    int[] arrays;

    public ThreadCalcMax(CommonRes res, int[] arrays) {
        this.res = res;
        this.arrays = arrays;
    }

    @Override
    public void run() {
        MaxNumberInArray maxNumberInArray = new MaxNumberInArray(arrays);
        res.setItem(maxNumberInArray.maxDigit());
    }
}
