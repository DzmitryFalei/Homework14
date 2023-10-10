package task1;

public class ThreadCalcMin implements Runnable{

    CommonRes res;
    int[] arrays;

    public ThreadCalcMin(CommonRes res, int[] arrays) {
        this.res = res;
        this.arrays = arrays;
    }
    @Override
    public void run() {
        MinNumberInArray minNumberInArray = new MinNumberInArray(arrays);
        res.setItem(minNumberInArray.minDigit());
    }
}
