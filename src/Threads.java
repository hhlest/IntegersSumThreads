public class Threads {

    public Threads() {
    }

    public static void createThreadsAndStartCalculation(int[] numbers) {

        Thread th1 = new Thread(new SumCalculatorThread(RandomArray.getPart1(numbers)));
        Thread th2 = new Thread(new SumCalculatorThread(RandomArray.getPart2(numbers)));
        Thread th3 = new Thread(new SumCalculatorThread(RandomArray.getPart3(numbers)));
        Thread th4 = new Thread(new SumCalculatorThread(RandomArray.getPart4(numbers)));

        th1.start();
        th2.start();
        th3.start();
        th4.start();

        try {
            th1.join();
            th2.join();
            th3.join();
            th4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sum = " + SumCalculatorThread.getSum());
    }

}
