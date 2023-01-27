public class Threads {

    public Threads() {
    }

    public static void createThreadsAndStartCalculation(int[] numbers) {

        Thread[] t = new Thread[4];
        double divider = 1.0 / t.length;

        double startIndex = 0;
        double endIndex = divider;

        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new SumCalculatorThread(RandomArray.getPart(numbers, startIndex, endIndex)));
            startIndex += divider;
            endIndex += divider;
        }

        for (Thread thread : t) {
            thread.start();
        }

        for (Thread thread : t) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sum = " + SumCalculatorThread.getSum());
    }

}
