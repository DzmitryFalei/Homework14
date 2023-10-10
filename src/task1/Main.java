package task1;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        int[] arrays = { 15, 3, 4, 7, 2, 5, 9};
        CommonRes resMax = new CommonRes();
        CommonRes resMin = new CommonRes();
        int maxNumber;
        int minNumber;

        Thread threadMax = new Thread(new ThreadCalcMax(resMax, arrays));
        Thread threadMin = new Thread(new ThreadCalcMin(resMin, arrays));

        threadMax.start();
        threadMin.start();

        threadMax.join();
        threadMin.join();

        maxNumber = resMax.getItem();
        minNumber = resMin.getItem();
        System.out.println("Max number: " + maxNumber + ", Min number: " + minNumber);

    }
}