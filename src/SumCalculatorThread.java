public class SumCalculatorThread implements Runnable {
    private int[] numbers;
    private static int sum = 0;

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

    public static int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        SumCalculatorThread.sum = sum;
    }

    public void calculateSum(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();
        try {
            calculateSum(numbers);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

