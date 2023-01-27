import java.math.BigInteger;

public class SumCalculatorThread implements Runnable {
    private int[] numbers;
    private static BigInteger sum = new BigInteger("0");

    public SumCalculatorThread() {
    }

    public SumCalculatorThread(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public static BigInteger getSum() {
        return sum;
    }

    public void setSum(BigInteger sum) {
        SumCalculatorThread.sum = sum;
    }

    public void calculateSum(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            sum = sum.add(new BigInteger(String.valueOf(numbers[i])));
        }
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();
        try {
            calculateSum(numbers);
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

